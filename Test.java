import java.util.Scanner;

public class Test{	
    public static void main(String[] args){
        int num1;
        
        Scanner input = new Scanner(System.in);        
        System.out.print("Enter first integer:");
        num1 = input.nextInt();
        
        if (num1 >= 60 & num1 <=70) {
            System.out.print("<=70");           
        }   
        else{
            System.out.print("<60");
        }    
         
    }
}