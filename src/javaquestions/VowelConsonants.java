package javaquestions;

//WAP to check whether a character is vowel or a consonant

public class VowelConsonants {

	public static void main(String[] args) {

       char ch = 'k';
       
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    	   System.out.println("character is vowel");
       }else {
    	   System.out.println("character is consonant");
       }
       
       switch(ch) {
       case 'a':
       case 'e':
       case 'i':
       case 'o':
       case 'u':
           System.out.println("character is vowel");
           break;
       default :
           System.out.println("character is consonant");
           break;
       }
		
	}

}
