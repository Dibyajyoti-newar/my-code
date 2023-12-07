import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,j,c=0;
		
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
        
		
		for(i=0;i<n;i++){
            int m=scn.nextInt();
	    	String str1=scn.next();
            for(j=0;j<m;j++){
                if(str1.charAt(i)=='a' ||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
                c=c++;
            }
            if(c>=4){
                System.out.println("NO");
            }
            else
            System.out.println("yes");
            

	    }

  
    }
}
