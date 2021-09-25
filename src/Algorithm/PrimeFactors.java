package Algorithm;

public class PrimeFactors {
	
	public static void main(String[] args) {
		int a=450;
		getFactor(a);
		isPrimeFactor(a);
	}
	
	
	public static void isPrimeFactor(int n) {
		
		if(n==1) System.out.println(n);
		if(n%2==0) {
			while(n%2==0) {
				System.out.print(" 2");
				n=n/2;
			}
		}
		if(n%3==0) {
			while(n%3==0) {
				System.out.print(" 3");
				n=n/3;
			}
		}
		
		for(int i=5;i*i<=n;i=i+6) {
			while(n%i==0) {
				System.out.print(" "+i);
				n=n/i;
			}
			while(n%(i+2)==0) {
				System.out.print(" " + i+2);
				n=n/(i+2);
			}
			
		}
		if(n>3)	System.out.print(" "+n);
	}
	
	
	
	public static void getFactor(int num) {
		
		for(int i=2;i*i<=num;i++) {
			if(isPrime(i)) {
				int x=i;
				while(num%x==0) {
					System.out.print(i+" ");
					x=x*i;
				}
			}
		}
		
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		
		if(n==2||n==3) return true;
		if(n%2==0||n%3==0) return false;
		
		for(int i=5;i*i<=n;i=i+6) {
			if(n%i==0) return false;
		}
		
		return true;
	}

}
