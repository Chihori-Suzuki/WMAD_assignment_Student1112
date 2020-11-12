package ca.student.exercise;

public class Student {
	int Id;
	String email;
	String fullName;
	
	
	public Student(int id, String email, String fullName) {
		super();
		setId(id);
		setEmail(email);
		setFullName(fullName);
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	


	@Override
	public String toString() {
		return "Student [Id=" + Id + ", email=" + email + ", fullName=" + fullName + "]";
	}



}
