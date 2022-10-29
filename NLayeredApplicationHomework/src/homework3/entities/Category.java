package homework3.entities;

import java.util.ArrayList;

public class Category {
	private String name;
	private int id;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Category() {
	}

	public Category(String name, int id, ArrayList<Course> courses) {
		this.name = name;
		this.id = id;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	
}
