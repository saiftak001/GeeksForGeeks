package Algorithm;

public class PrimeNumber {
	
	public static void main(String[] args) {
		System.out.println("The number is : "+getPrime(35));
	}
	
	public static boolean getPrime(int num) {
		
		if(num==1)return false;
		if(num==2||num==3) return false;
		if(num%2==02||num%3==0) return false;
		
		for(int i=5;i*i<num;i=i+6) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
