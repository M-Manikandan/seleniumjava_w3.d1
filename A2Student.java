package week3.day1;

public class A2Student extends A2Department {

	public void studentName() {
		System.out.println("Student name");

	}
	public void studentDept() {
		System.out.println("Student Department");

	}
	public void studentId() {
		System.out.println("Student ID");

	}
	public static void main(String[] args) {
		A2Student obj=new A2Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
