package week1.day1;

public class IsPrimeNumber {
	
		public static boolean isPrime(int num) {
	      boolean isPrime = true;
	      for(int i=2;i<num;i++){
			if(num%i==0){
	          isPrime=false;
	          break;
	        }
	      }
	       return isPrime;
		}
		
		public static void main(String args[])
		{
			IsPrimeNumber Obj = new IsPrimeNumber();
			System.out.println(Obj.isPrime(7));
			
		}
	

}
