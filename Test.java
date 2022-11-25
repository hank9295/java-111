public class Test{	
    public static void main(String[] args){
		
		for(int i=-4;i<=4;i++){
			for(int y=-5;y<=5;y++){
				if(i+y<=-5||i-y>=5)
					System.out.printf("*"); 			
				else if(i+y>4||i-y<-4)
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