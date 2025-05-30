package model.entites;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User{
	
	private String specialty;
	private String biography;
    private List<String> listOfCoursesTaught = new ArrayList<String>();
    
    public Instructor () {}

	public Instructor(String name, String email, String specialty, String biography) {
		super(name, email);
		this.specialty = specialty;
		this.biography = biography;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public List<String> getListOfCoursesTaught() {
		return listOfCoursesTaught;
	}
	
	public void addCourseTaught(String courses) {
		listOfCoursesTaught.add(courses);
	}

	@Override
	public String displayInformation() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(getName() + "\n");
		sb.append("Email: ");
		sb.append(getEmail() + "\n");
		sb.append("Specialty: ");
		sb.append(specialty + "\n");
		sb.append("biography: ");
		sb.append(biography + "\n");
		sb.append("courses taught:");
		for (String user : listOfCoursesTaught) {
			sb.append(user + "\n");
		}
		return sb.toString();
	}

	@Override
	public String getTypeUser() {
		return "Teacher";
	}

	
    
	
    
    
    
	
	

}
