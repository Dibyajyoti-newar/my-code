import java.util.Scanner;

public class atm{
    public static void main(String[] args) {
        

        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();

        for(int j=0;j<t;j++){
             int p=scan.nextInt();
        //total money present in ATM//
             int m=scan.nextInt();
             System.out.println();
//money required for each pepole//
              int arr[]=new int[p];

           for(int i=0;i<p;i++){
            arr[i]=scan.nextInt();
        }

          for(int i=0;i<p;i++){
            if(m>=arr[i]){
                System.out.print("1");
                m=m-arr[i];
            }
            else{
                System.out.print("0");
            }

        }
        }
       
       

    }
}