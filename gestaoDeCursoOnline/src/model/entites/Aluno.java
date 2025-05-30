package model.entites;

import java.util.ArrayList;
import java.util.List;

import model.enums.Level;

public class Aluno extends User {
	private String registration;
	private Level level;
	private List<Course> enrolledCourses = new ArrayList<>();

	public Aluno() {
	}

	public Aluno(String name, String email, String registration, Level level) {
		super(name, email);
		this.registration = registration;
		this.level = level;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void enrollInCourse(Course course) {
		enrolledCourses.add(course);
	}

	@Override
	public String displayInformation() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(getName() + "\n");
		sb.append("Email: ");
		sb.append(getEmail() + "\n");
		sb.append("Registration: " );
		sb.append(registration + "\n");
		sb.append("Level: ");
		sb.append(level + "\n");
		sb.append("courses taught:");
		for (Course user : enrolledCourses) {
			sb.append(user + "\n");
		}
		return sb.toString();
	}

	@Override
	public String getTypeUser() {
		return "aluno";
	}

}
