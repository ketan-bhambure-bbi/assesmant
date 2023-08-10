class humans{
    int HP;
    String behaviour;
    humans(){
        HP=50;
    }
}
class Heros extends humans{
    int lightAttack;
    boolean hasHighIQ;
    Heros(){
        lightAttack=10;
        this.behaviour="Good";
    }
}
class Monster extends humans{
    int darkAttack;
    boolean hasBigBody; 
    Monster(){
        darkAttack=10;
        this.behaviour="Bad";
    }
}


public class Main
{
	public static void main(String[] args) {
		Heros h1=new Heros();
		h1.hasHighIQ=false;
		Heros h2=new Heros();
		h2.hasHighIQ=false;;
		Monster m1=new Monster();
		m1.hasBigBody=false;
		Monster m2=new Monster();
		m2.hasBigBody=true;
		
		Heros H[]=new Heros[2];
		H[0]=h1;
		H[1]=h2;
		Monster M[]=new Monster[2];
		M[0]=m1;
		M[1]=m2;
		for(int i=0;i<2;i++){
		    if(H[i].hasHighIQ){
		        H[i].lightAttack+=5;
		    }
		}
		for(int i=0;i<2;i++){
		    if(M[i].hasBigBody){
		        M[i].HP+=5;
		    }
		}
		double HP1=0;
		double A1=0;
		for(int i=0;i<2;i++){
		    HP1=HP1+H[i].HP;
		    A1=A1+H[i].lightAttack;
		}
		double HP2=0;
		double A2=0;
		for(int i=0;i<2;i++){
		    HP2=HP2+M[i].HP;
		    A2=A2+M[i].darkAttack;
		}
		if((HP1/A2)>(HP2/A1)){
		    System.out.println("heros are winners");
		}
		else if((HP1/A2)==(HP2/A1)){
		    System.out.println("Match Tie");
		}
		else{
		    System.out.println("Monters are winners");
		}
		 
	}
}