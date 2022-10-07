import java.util.Scanner;

public class Test{	
    public static void main(String[] args){
        int num1;
        
        Scanner input = new Scanner(System.in);        
        System.out.print("Enter first integer:");
        num1 = input.nextInt();
        
        if (num1 >= 90)
            System.out.print("A");           
        
        else if (num1 >= 80)
			System.out.print("B");
			 
		else if (num1 >= 70)
            System.out.print("C");
                      
		else if (num1 >= 60)
            System.out.print("D");
					           
		else
            System.out.print("E");
          
         
    }
}