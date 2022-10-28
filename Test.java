public class Test{
    public static void main(String[] args){
	   for ( int i=0; i<6; i++) {
		   for (int k=5; k>=0; k--){
			   if (k>i)
				   System.out.print("*");
			   else
				   System.out.printf("%d",i-k+1);
		   }
		   System.out.println("");
	   }   
    }
}