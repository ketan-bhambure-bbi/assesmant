import java.util.*;
import java.io.*;
public class Main
{
    public static Boolean isPalindrome(String S){
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(S.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static String maxlength(String A, String B){
        if(A.length()>B.length()){
            return A;
        }
        else if(A.length()==B.length()){
            return A;
        }
        else{
            return B;
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String");
	    String io=sc.nextLine();
	    int n=io.length();
	    String ans="";
	    
	    for(int i=0;i<n;i++){
	        for(int j=i;j<n;j++){
	            String temp="";
	            for(int k=i;k<=j;k++){
	                temp+=io.charAt(k);
	            }
	            if(isPalindrome(temp)){
	                ans=maxlength(ans,temp);
	            }
	            
	        }
	    }
	    System.out.println(ans+" "+ans.length());
	    
		 
	}
}