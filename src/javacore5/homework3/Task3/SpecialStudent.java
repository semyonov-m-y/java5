package javacore5.homework3.Task3;

public class SpecialStudent extends CollegeStudent {

	private long secretKey;
	private String email;
	
	public SpecialStudent(String firstName, String lastName, int group) {
		super(firstName, lastName, group);
	}

	public SpecialStudent(String lastName, Course[] coursesTaken) {
		super(lastName, coursesTaken);
	}

	public SpecialStudent(String firstName, String lastName, int group, long secretKey) {
		super(firstName, lastName, group);
		this.secretKey = secretKey;
	}

	private long getSecretKey() {
		return secretKey;
	}

	private void setSecretKey(long secretKey) {
		this.secretKey = secretKey;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}
}
