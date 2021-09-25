package Algorithm;

public class GCD {
	
	public static void main(String[] args) {
		System.out.println(gcd(21,27));
		
	}
	public static int gcd(int a, int b) {
		System.out.println("a : "+ a + " " +"b: "+ b);
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}

}
