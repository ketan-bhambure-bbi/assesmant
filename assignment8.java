assignment8
public class Main
{
    public static char checkwin(char [][] arr, int i,int j,char ans){
        if(i==0 && j==0){
            if(arr[i][j]==ans && arr[++i][j]==ans && arr[++i][j]==ans){
                return ans;
            }
            i=0;j=0;
            if(arr[i][j]==ans && arr[++i][++j]==ans && arr[++i][++j]==ans){
                return ans;
            }
            i=0;j=0;
            if(arr[i][j]==ans && arr[i][++j]==ans && arr[i][++j]==ans){
                return ans;
            }
            
        }
        if(i==0 && j==1){
            if(arr[i][j]==ans && arr[++i][j]==ans && arr[++i][j]==ans ){
                return ans;
            }
            
        }
        if(i==0 && j==2){
            if(arr[i][j]==ans && arr[++i][--j]==ans && arr[++i][--j]==ans){
                return ans;
            }
            if(arr[i][j]==ans && arr[++i][j]==ans && arr[++i][j]==ans ){
                return ans;
            }
        }
        if(i==1 && j==0){
            if(arr[i][j]==ans && arr[i][++j]==ans && arr[i][++j]==ans){
                return ans;
            }
        }
        if(i==2 && j==0){
            if(arr[i][j]==ans && arr[i][++j]==ans && arr[i][++j]==ans){
                return ans;
            }
        }
        return ' ';
        
        
    }
	public static void main(String[] args) {
	    char [][] ttm={
	        {'N','X','O'},
	        {'O','X','X'},
	        {'O','O','X'}
	    };
	    int flag=0;
	    char ans=' ';
	    for(int j=0;j<3;j++){
	        ans=checkwin(ttm,0,j,ttm[0][j]);
	        if(ans==ttm[0][j]){
	            flag=1;
	            System.out.println("winner"+ ans);
	            break;
	        }
	        
	    }
	    if(flag!=1){
	        ans=checkwin(ttm,1,0,ttm[1][0]);
	        if(ans==ttm[1][0]){
	            System.out.println("winner"+ans);
	            return;
	        }
	        ans=checkwin(ttm,2,0,ttm[2][0]);
	        if(ans==ttm[2][0]){
	            System.out.println("winner"+ans);
	            return;
	        }
	        
	        else{
	            for(int i=0;i<3;i++){
	                if(ttm[i][0]=='N' || ttm[i][1]=='N' || ttm[i][2]=='N'){
	                    System.out.println("pending");
	                    return;
	                }
	            }
	            System.out.println("Draw");
	            
	        }
	        
	    }
	    
		 
	}
}