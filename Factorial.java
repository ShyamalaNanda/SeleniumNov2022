package week1.day1;

public class Factorial {
		public static int getFactorial(int num) {
	     					int i=1;
	 						int fact = 1;  
	      
					       while( i <= num ){  
	            fact = fact * i;   
	            i++; //increment i by 1   
	        }
	      return fact;
		}
	

	public static void main(String[] args) {
		 Factorial num = new Factorial();
		 System.out.println(num.getFactorial(5));

	}

}
