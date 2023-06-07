package interviewquestion;

//WAP to reverse a string

public class ReverseString {

	public static void main(String[] args) {

		//1. Using For Loop
		String s = "Selenium";
		String rev = "";
		
		int length = s.length();
		
		for(int i = length-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
	
	//2. Using StringBuffer Class
	StringBuffer sf = new StringBuffer(s);
	System.out.println(sf.reverse());

}
}
