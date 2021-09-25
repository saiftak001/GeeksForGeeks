package Algo_practice;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("value is : " + getValue(555));
    }

    private static int getValue(int i) {
        int count=0;
        while(i>0){
            count+=i%10;
            i=i/10;
        }
        return count;
    }
}
