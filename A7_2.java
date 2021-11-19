package week3.day1;

public class A7_2 {

	public static void main(String[] args) {
		String text1=new String("I am learning Java");
		String text2=new String("I am learning java");
		if (text1.equalsIgnoreCase(text2)) {
			System.out.println("They are equal");
			
		} else {
			System.out.println("not equal");
			if (text1.equals(text2)) {
				System.out.println("text1 and text2 are equal");
				
			} else {
				System.out.println("text1 and text2 not equal");
				if (text1==text2) {
					System.out.println("equal");
					
				} else {
					System.out.println("not equal");

				}
			}

		}
	}

}