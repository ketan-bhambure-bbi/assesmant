public class Main
{
	public static void main(String[] args) {
		int rowsum[]={3,8};
		int colsum[]={4,7};
		int ans[][]=new int[2][2];
		for(int i=0;i<2;i++){
		    for(int j=0;j<2;j++){
		        ans[i][j]=Math.min(rowsum[i],colsum[j]);
		        rowsum[i]-=ans[i][j];
		        colsum[j]-=ans[i][j];
		    }
		}
		for(int i=0;i<2;i++){
		    for(int j=0;j<2;j++){
		        System.out.print(ans[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}