package prob3;

//Make sure to extend the LibraryMember class to allow polymorphism
public class Student extends LibraryMember{
	private String name;
	private String studentId;
	private CheckoutRecord record;
	public Student(String name, String studentId, CheckoutRecord record) {
		this.name = name;
		this.studentId = studentId;
		this.record = record;
	}
	
	public String getName() {
		return name;
	}

	public String getStudentId() {
		return studentId;
	}

	public CheckoutRecord getRecord() {
		return record;
	}
	public String toString() {
		return "{Name: " + name + "Overdue: " + record.getOverdueBooks() + "}";
	}
}
