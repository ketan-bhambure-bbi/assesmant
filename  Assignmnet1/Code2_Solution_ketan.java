Code2_Solution
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		HashSet <Integer> hs=new HashSet<Integer>();
		int ans[]=new int[n];
		for(int i=0;i<n;i++){
		    hs.clear();
		    for(int j=0;j<n;j++){
		        if(arr[j]<arr[i]){
		            hs.add(arr[j]);
		        }
		    }
		    ans[i]=hs.size();
		}
		for(int i=0;i<n;i++){
		    System.out.println(ans[i]);
		}
	}
}