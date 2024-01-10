//time complexity=O(n);//space complexity=O(1);//
import java.util.*;
import java.io.*;
public class binary_search {
    public static int binarysearch(int arr[],int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            int result=binarysearch(arr, x);
            if(result==0){
                System.out.println("given element is not found");
            }
            else{
                System.out.println("element is found in location "+result);
            }
        }
    

} 
