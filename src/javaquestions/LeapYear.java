package javaquestions;

//WAP to find a leap year
//Year which are divisible by 4
//Century Year which are divisible by 400

public class LeapYear {

	public static void main(String[] args) {

		
		int year = 2224;
		boolean leap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
                     leap = true;
				}else {
					leap = false;
				}
			}else {
				leap = true;
			}
		}else {
			leap = false;
		}
		
		if(leap) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+" is not a leap year");
		}
	}

}
