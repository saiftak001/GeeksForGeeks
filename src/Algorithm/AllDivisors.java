package Algorithm;

public class AllDivisors {
	
	public static void main(String[] args) {
		int a=25;
		getDivisors(a);
	}
	
	public static void getDivisors(int n) {
		System.out.print("1");
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)System.out.print(" "+i);
		}
		System.out.print(" "+n);
		
	}

}
