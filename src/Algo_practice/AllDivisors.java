package Algo_practice;

public class AllDivisors {
    public static void main(String[] args) {
        int n=28;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
