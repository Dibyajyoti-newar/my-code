//time complaxity=O(n);space complaxity=O(n)//
import java.util.Scanner;
public class factorial {
    public static int fact(int val){
        if(val==0 || val==1){
            return 1;
        }
        else{
            return val*fact(val-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println(f);
    }
}
