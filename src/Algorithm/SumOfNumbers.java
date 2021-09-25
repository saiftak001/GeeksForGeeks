package Algorithm;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		System.out.println(getValue(523));
	}

	private static int getValue(int i) {
		// TODO Auto-generated method stub
		int count=0;
		while(i>0) {
			count++;
			i=i/10;
		}

		return count;
	}

}
