package Algo_practice;

public class Factorial {
    public static void main(String[] args) {
        int n=5,m=5;
        int count=1;
        while (n > 0) {
            count*=n;
            n--;
        }
        System.out.println(count);
        System.out.println(getFact(m));
    }

    public static int getFact(int n){
        if (n == 0) {
            return 1;
        }
        return n*getFact(n-1);
    }
}
