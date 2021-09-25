package Algorithm;

public class LCM {
	
	public static void main(String[] args) {
		int a=6,b=15;
		int value = getGCM(a, b);
		System.out.println("LCM is : "+ (a*b)/value);
		System.out.println("LCM is : "+ getLCM(a, b));
	}
	private static int getLCM(int a, int b) {
		// TODO Auto-generated method stub
		
		int max=Math.max(a,b);
		
		while(true) {
			if(max%a==0 && max%b==0) {
				return max;
			}
			max++;
		}
	}
	private static int getGCM(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return a;
		}
		return getGCM(b, a%b);
	}
}
