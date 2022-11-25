public class Test{	
    public static void main(String[] args){
		for(int i=-4;i<=4;i++){
			for(int y=-5;y<=5;y++){
				if(Math.abs(y)+Math.abs(i)>4)
					System.out.printf("*"); 			
				else
					System.out.printf(" ");
					
			}	
            System.out.println(); 

		

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