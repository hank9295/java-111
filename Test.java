import java.util.Scanner;

public class Test{	
    public static void main(String[] args){
        int grade;
        
        Scanner input = new Scanner(System.in);        
        System.out.print("Enter first integer:");
        grade = input.nextInt();
        
        switch(grade){
			case 100 :
			case 90 :
			    System.out.println("A");
				break;
			case 80 :
				System.out.println("B");
				break;
			case 70 :
				System.out.println("C");
				break;
			case 60 :
				System.out.println("D");
				break;
			default  :
				System.out.println("E");
				break;
		}		
          
         
    }
}