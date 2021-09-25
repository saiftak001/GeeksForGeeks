package Algorithm;

import java.util.Arrays;

public class SieveOfEratosthenes {
	
	public static void main(String[] args) {
		int a=18;
		getSieve(a);
	}
	
	public static void getSieve(int n) {
		
		boolean[] arr= new boolean[n];
		
		Arrays.fill(arr, true);
		
		for(int i=2;i*i<=n;i++) {
			if(arr[i]) {
				for(int j=i*i;j<n;j=j+i) {
					arr[j]=false;
				}
			}
		}
		for(int i=2;i<n;i++) {
			if(arr[i]) {
				System.out.print(i+" ");				
			}
		}
		
	}

}
