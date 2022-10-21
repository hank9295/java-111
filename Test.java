public class Test{	
    public static void main(String[] args){
        int row = 0;
		int blake = 4;
		int star = 0;
		int col;
             
		while (row < 5){
			col = 0;
			while (col < blake){
				System.out.print(" ");
				col += 1;
			}
			
			col = 0 ;
			while (col <= star) {
			    System.out.print("*");
			    col += 1;
      		}   
            System.out.print("\n");		
			
			blake -= 1;
			star += 2;
			row += 1;
			    			
	
		}
	}
}