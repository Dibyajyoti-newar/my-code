//time complaxity=O(n),space complaxity=O(n)//
//problem=alternate sum find;example:if n=5,5-4+3-2+1=3/n=4,-4+3-2+1=-2//
import java.util.Scanner;
public class alt_num {
    public static int altSum(int num){
        if(num == 0){
            return 0;
        }
        else if(num%2 ==0){
            return -num+altSum(num-1);
        }
        else{
            return num+altSum(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=altSum(n);
        System.out.println(result);
    }
}
