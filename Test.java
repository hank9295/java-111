public class Test{	
    public static void main(String[] args){
		int n = 5;
	    for( int j=1; j<=n; j++){
		    for( int i=1; i<=(n-j); i++){
			System.out.print(" ");
			}
			for( int i=1; i<=(2*j-1); i++){
			System.out.print("*");
			}
			System.out.println();
			}
		for( int j=2; j<=n; j++){
			for( int i=1; i<=(j-1); i++){	
			System.out.print(" ");
			}
			for( int i=1; i<=((n-j)*2+1); i++){
			System.out.print("*");
			
			}
			System.out.println();
			}
			
	}
}	