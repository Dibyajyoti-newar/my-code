//time complaxity=O(2^n),space complaxity=O(n)//
import java.util.Scanner;
public class fibonacci {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=fibo(n);
        System.out.println(result);
    }
}
