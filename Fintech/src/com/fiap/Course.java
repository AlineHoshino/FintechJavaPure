package com.fiap;

public class Course {
	private int courseId;
	private String name;
	private double price;
	
	public Course(int courseId, String name, double price) {
		this.courseId = courseId;
		this.name = name;
		this.price = price;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
