//two string A,B are given,check how many character are common between A and B//
import java.util.*;
import java.lang.*;
import java.io.*;

class common_char
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    String a=sc.next();
		    String b=sc.next();
		    HashMap<Character,Integer>A_map=new HashMap<>();		
		    HashMap<Character,Integer>B_map=new HashMap<>();
		    for(int j=0;j<a.length();j++){
		        if(A_map.containsKey(a.charAt(j))){
		            A_map.put(a.charAt(j),A_map.get(a.charAt(j))+1);
		        }
		        else{
		            A_map.put(a.charAt(j),1);
		        }
		    }
		    for(int j=0;j<b.length();j++){
		        if(B_map.containsKey(b.charAt(j))){
		            B_map.put(b.charAt(j),B_map.get(b.charAt(j))+1);
		        }
		        else{
		            B_map.put(b.charAt(j),1);
		        }
		    }
		    int m=0,s=0;
		    //traversal of A_map hashmap using for loop//
		    for(Character key :A_map.keySet()){
		        if(B_map.containsKey(key)){
		            m=Math.min(A_map.get(key),B_map.get(key));
		            s=s+m;
		        }
		    }
		    System.out.println(s);
		}
	}
}
