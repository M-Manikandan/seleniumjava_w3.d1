package week3.day1;

public class A7_3 {

	public static void main(String[] args) {
		String sentence=new String("I am working with Java8");
		String replacedString = sentence.replace('8', '1');
		System.out.println(replacedString);
		char[] sentenceArray = replacedString.toCharArray();
		System.out.println("Printing from position 5 to 14");
		for (int i=5;i<=14;i++) {
			System.out.println(sentenceArray[i]);
			
		}
	}

}
