package Algorithm;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println(getPalindrom(78611));
	}

	private static int getPalindrom(int i) {
		// TODO Auto-generated method stub
		int num=0;
		while(i>0) {
			num=num*10+i%10;
			i=i/10;
		}
		return num;
	}

}
