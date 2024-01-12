//time complexity=O(n);//space complexity=O(1);//
//example:give a elements(in sorted form & repetation allow) like 1 2 2 3 4 ,find the the index of given element(),for example here if we want to find the index of 2 then answer will be 1//
import java.util.*;
import java.io.*;
public class lower_bound {
    public static int findlower(int arr[],int val){
        int low=0;int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==val){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]<val){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            int result=findlower(arr, x);
            if(result==-1){
                System.out.println("given element is not found");
            }
            else{
                System.out.println("element is found in location "+result);
            }
        }
}
