package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Aluno;
import model.entites.Course;
import model.entites.Instructor;
import model.entites.User;
import model.enums.Level;
import model.execeptions.DomainExepections;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<User> user = new ArrayList<User>(); // lista para fazer upcasting
		List<Course> courseList = new ArrayList<Course>();
		Course course = new Course() {
		};

		int select = 7;
		int selectTwo = 0;

		try {
		while (select != 0) {
			System.out.println("===== PLATAFORMA DE CURSO =====");
			System.out.println("1 - Cadastrar usuário");
			System.out.println("2 - Cadastrar curso");
			System.out.println("3 - Matricular aluno em curso");
			System.out.println("4 - Exibir detalhes dos cursos");
			System.out.println("5 - Buscar curso por título");
			System.out.println("6 - Listar usuários por tipo");
			System.out.println("0 - Sair");

			System.out.print("Escolha uma opção: ");
			select = sc.nextInt();
			sc.nextLine();

			switch (select) {
			case 1: {
				System.out.println("-- Cadastro de usuário --");
				System.out.println("1 - Aluno");
				System.out.println("2 - Instrutor");
				int selectTwo1 = sc.nextInt();
				switch (selectTwo1) {
				case 1: { // case para o aluno
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Email: ");
					String email = sc.nextLine();
					System.out.print("Matrícula: ");
					String matricula = sc.nextLine();
					System.out.print("Nível (iniciante, intermediário, avançado):");
					Level leve = Level.valueOf(sc.next().toUpperCase());
					Aluno aluno = new Aluno(name, email, matricula, leve);
					user.add(aluno);
					break;
				}
				case 2: { // case para o professor
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Email: ");
					String email = sc.nextLine();
					System.out.print("Especialidade: ");
					String especialidade = sc.nextLine();
					System.out.print("Biografia: ");
					String biografia = sc.nextLine();
					Instructor instructor = new Instructor(name, email, especialidade, biografia);
					user.add(instructor);
					System.out.print("Quantos cursos você ministrou? ");
					int quantidade = sc.nextInt();
					System.out.println("Digite o nome dos cursos que você ministrou: ");
					sc.nextLine();
					for (int i = 0; i < quantidade; i++) {
						System.out.print("Nome: ");
						String nomeDosCursos = sc.nextLine();
						instructor.addCourseTaught(nomeDosCursos);

					}
					break;

				}

				}
				break;
			}
			case 2: { // case para cadastro do curso
				System.out.println("-- Cadastro de curso --");
				System.out.print("Título: ");
				String title = sc.nextLine();
				System.out.print("Descrição: ");
				String descricao = sc.nextLine();
				System.out.print("Duração em horas: ");
				int horas = sc.nextInt();
				sc.nextLine();
				System.out.print("Instrutor responsável: ");
				String name = sc.nextLine();
				course = new Course(title, descricao, name, horas);
				courseList.add(course);
				break;
			}
			case 3: { // matricular aluno no curso
				System.out.println("-- Matrícula em curso --");
				System.out.print("Nome do aluno: ");
				String name = sc.nextLine();
				course.addAluno(user,name);
				break;
			}
			case 4: { // exibir detalhes do curso
				System.out.println("Qual curso você quer ver os detalhes? ");
				for (Course c : courseList) {
					System.out.println("Cursos que temos: " + c.getTitle());
				}
				String nameCurso = sc.nextLine();
				System.out.println("-- Detalhes dos cursos --");
				String courseDetalhes = course.courseDetails(courseList, nameCurso);
				System.out.println(courseDetalhes);
				break;
			}
			case 5:{ //funcao basica de buscar um curso, apenas para implementar algo que eu achei legal
				System.out.println("===== BUSCAR CURSO =====");
				System.out.print("Digite o nome do curso que você quer:");
				String nameCurso = sc.nextLine();
				course.buscarCurso(courseList, nameCurso);
				break;
			}
			case 6:{
				for(User u : user) {
					System.out.println(u.displayInformation() + " " + u.getTypeUser() + "\n");
					break;
				}
			}

			}

		}
		}
		catch (DomainExepections e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		finally {
			System.out.println("Fim do programa");
		}

		sc.close();
	}

}
