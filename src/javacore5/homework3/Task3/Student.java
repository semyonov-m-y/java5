package javacore5.homework3.Task3;

public class Student {
	
	String firstName;
	String lastName;
	int group;
	Course[] coursesTaken;
	int age;
	
	public Student(String firstName, String lastName, int group) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
	}

	public Student(String lastName, Course[] coursesTaken) {
		this.lastName = lastName;
		this.coursesTaken = coursesTaken;
	}

	private String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private int getGroup() {
		return group;
	}

	private void setGroup(int group) {
		this.group = group;
	}

	private Course[] getCoursesTaken() {
		return coursesTaken;
	}

	private void setCoursesTaken(Course[] coursesTaken) {
		this.coursesTaken = coursesTaken;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}
	
	
}
