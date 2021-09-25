package Algorithm;

public class Factorial {
	
	public static void main(String[] args) {
		double value=getFact(25);
		System.out.println(value+"   "+getTrailingZero(25));
	}
	
	private static double getFact(int n) {
		if(n==0) {
			return 1;
		}
		return n*getFact(n-1);
	}
	
	private static double getTrailingZero(int n) {
		
		int fnl=0;
		for(int i=5;i<=n;i=i*5) {
			fnl=fnl+n/i;
		}
		
		return fnl;
	}

}
