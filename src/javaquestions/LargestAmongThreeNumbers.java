package javaquestions;

//WAP to find greatest amongst three numbers

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		int x = 300;
		int y = 200;
		int z = 100;
		
		if(x>y && x>z) {
			System.out.println("x is the greatest number");
		}else if(y>z) {
			System.out.println("y is the greatest number");
		}else if(x==y && x==z){
			System.out.println("all numbers are equal");
		}else {
			System.out.println("z is the greatest number");
		}
		
	}

}
