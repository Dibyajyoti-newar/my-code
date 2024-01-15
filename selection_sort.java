import java.util.*;
import java.io.*;
public class selection_sort {
    public static void selectioSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min_indx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_indx]){
                    min_indx=j;
                }
            }
            if(min_indx != i){
                int temp=arr[i];
                arr[i]=arr[min_indx];
                arr[min_indx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,4,8,2,6};
        selectioSort(arr);
        System.out.println("sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
