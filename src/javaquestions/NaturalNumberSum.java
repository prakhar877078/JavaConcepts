package javaquestions;

//WAP to find sum of natural numbers.

public class NaturalNumberSum {

	public static void main(String[] args) {

		int num = 100;
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum = sum + i;
		}
		
		System.out.println("sum of "+num+" natural numbers is "+sum);
		
		sum = 0;
		
		int k = 1;
		
		while(k <= num) {
			sum = sum+k;
			k++;
		}
		
		System.out.println("sum is "+sum);

		
		
	}

}
