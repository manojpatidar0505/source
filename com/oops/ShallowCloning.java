package com.oops;

class Course {
	String subject1;
	String subject2;
	String subject3;

	public Course(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
	}
}

class Students implements Cloneable {
	int id;
	String name;
	Course course;

	public Students(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCloning {
	public static void main(String[] args) {
		Course course = new Course("hindi", "English", "Science");
		Students students = new Students(1, "Manoj", course);
		Students students2 = null;
		try {
			students2 = (Students) students.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(students.course.subject3);

		students2.course.subject3 = "Maths";

		System.out.println(students.course.subject3);
		System.out.println(students2.course.subject3);
		
		
	}

}