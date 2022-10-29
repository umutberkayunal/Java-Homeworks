package homework3.entities;

public class Course {
	private String name;
	private int id;
	private String description;
	private double progress;
	private double price;
	private Instructor instructor;
	
	public Course() {
	}
	
	public Course(String name, String description, int id, double progress, double price, Instructor instructor) {
		this.name = name;
		this.description = description;
		this.id = id;
		this.progress = progress;
		this.price = price;
		this.instructor = instructor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
