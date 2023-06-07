package interviewquestion;

//WAP to remove junk or special character from a String.

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "!@#$%^&* java () with <?/ Selenium";
		
		//Regular Expression [^a-zA-Z0-9]
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		
	}

}
