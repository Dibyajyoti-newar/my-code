// let ,given a[]={10,15,5,15,-10,15} and sum=5
//find the starting and ending index of subarray whose sum is 5//
import java.util.HashMap;
import java.util.Scanner;

public class subArray_Sum {
    public static void SubArraySum(int arr[],int sum){
        int currentSum=0;
        int start=0,end=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum==sum){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(currentSum-sum)){
                start=map.get(currentSum-sum)+1;
                end=i;
                break;
            }
            map.put(currentSum,i);
        }
        if(end==-1){
            System.out.println("Subarray is not found");
        }
        else{
            System.out.println(start+" "+end);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//size of an array//
        int array[]=new int[n];
        int s=sc.nextInt();
        for(int j=0;j<n;j++){
            array[j]=sc.nextInt();
        }
        SubArraySum(array, s);
    }
}
