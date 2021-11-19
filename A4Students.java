package week3.day1;

public class A4Students {

	public void getStudentInfo(int id) {
		
		System.out.println("Employee ID is" + id);
	} 
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Employee id and Name is "+id+" "+name);
	}
	
	public void getStudentInfo(String email, String phonenumber) {
		System.out.println("Email and Phonenumber is " +email + " & " + phonenumber);
	}

	public static void main(String[] args) {
		
		A4Students stud=new A4Students();
		stud.getStudentInfo(100);
		stud.getStudentInfo( 100, "Test Leaf");
		stud.getStudentInfo("testleaf@gmail.com", "123457890");
	}
}
