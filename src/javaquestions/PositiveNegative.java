package javaquestions;

//WAP to check whether a program is positive or negative

public class PositiveNegative {

	public static void main(String[] args) {

		double num = 0;
		
		if(num < 0.0) {
			System.out.println(num+" is a negative number");
		}else if(num > 0.0) {
			System.out.println(num+" is a positive number");
		}else {
			System.out.println(num+" is zero");
		}
		
	}

}
