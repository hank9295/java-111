public class Test{	
    public static void main(String[] args){
		int width=0;
		for(int i=-4;i<=4;i++){
			for(int y=-5;y<=5;y++){
				if(Math.abs(y)>width)
					System.out.printf("*"); 			
				else
					System.out.printf(" ");
					
			}	
            System.out.println(); 

			if (i<0)
				width++;
			else
				width--;
					
		

		}	
	}
}
/* ***** *****
   ****   ****
   ***     ***
   **       **
   *         *
   **       **
   ***     ***
   ****   **** 
   ***** ***** */