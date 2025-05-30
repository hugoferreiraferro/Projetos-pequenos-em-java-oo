package model.entites;

import java.util.ArrayList;
import java.util.List;

import model.execeptions.DomainExepections;

public class Course {
	private String title;
	private String description;
	private Integer duration;
	private String instructor;
	private List<String> alunos = new ArrayList<String>();

	public Course() {
	}

	public Course(String title, String description, String instructor, Integer duration) {
		super();
		this.title = title;
		this.description = description;
		this.instructor = instructor;
		this.duration = duration;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstrucotr() {
		return instructor;
	}

	public void setInstrucotr(String instrucotr) {
		this.instructor = instrucotr;
	}

	public List<String> getAlunos() {
		return alunos;
	}

	public void addAluno(List<User> user, String name) {
		for (User u : user) {
			if (name.equals(u.getName())) {
				alunos.add(name);
				System.out.println("Aluno cadastrado no curso");
				return;
			}
		}

		throw new DomainExepections("Aluno não cadastrado no site");

	}
	
	public void buscarCurso(List<Course> courseList,String nameOfCourse) {
		for(Course c : courseList) {
			if(nameOfCourse.equalsIgnoreCase(c.getTitle())) {
				System.out.println("Curso encontrado");
			}
			else {
				System.out.println("Curso não encontrado");
			}
		}
	}

	public String courseDetails(List<Course> course, String titulo) {
		StringBuilder sb = new StringBuilder();
		for (Course c : course) {
			if (titulo.equals(c.getTitle())) {
				sb.append("title: ");
				sb.append(c.getTitle() + "\n");
				sb.append("Description: ");
				sb.append(c.getDescription() + "\n");
				sb.append("Instructor: ");
				sb.append(c.getInstrucotr() + "\n");
				sb.append("Duration: ");
				sb.append(c.getDuration() + "\n");
			}
		}
		return sb.toString();

	}

	public String toString(Course list) {
		StringBuilder sb = new StringBuilder();
		sb.append("Title: ");
		sb.append(title + "\n");
		sb.append("Description: ");
		sb.append(description + "\n");
		sb.append("Instructor: ");
		sb.append(instructor + "\n");
		sb.append("Duration: ");
		sb.append(duration + "\n");
		sb.append("Alunos: ");
		for (String aluno : alunos) {
			sb.append(aluno + "\n");
		}
		return sb.toString();
	}

}
