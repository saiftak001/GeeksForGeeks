package Algo_practice;

public class GCM {
    public static void main(String[] args) {
        System.out.println(getGCM(24,64));
    }
    public static int getGCM(int n, int m){
        if(m==0){
            return n;
        }
        return getGCM(m, n%m);
    }
}
