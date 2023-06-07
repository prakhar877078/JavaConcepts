package javaquestions;

//WAP to swap two numbers

public class SwapUsingTemp {

	public static void main(String[] args) {

		int temp;
		int fno = 12;
		int sno = 23;
		
		System.out.println("First number is :"+fno);
		System.out.println("Second number is :"+sno);
		
		temp = fno;
		fno = sno;
		sno = temp;
		
		System.out.println("After swaping First number is :"+fno);
		System.out.println("After swaping Second number is :"+sno);
		
		fno = fno - sno;
		sno = fno + sno;
		fno = sno - fno;
		
		System.out.println(" First number = "+fno);
		System.out.println(" Second number = "+sno);

		
	}

}
