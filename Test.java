import java.util.Scanner;

public class Test{	
    public static void main(String[] args){
        int num1;
        
        Scanner input = new Scanner(System.in);        
        System.out.print("Enter first integer:");
        num1 = input.nextInt();
        
        if (num1 >= 90) {
            System.out.print("very Good!!");
        }
        else if(num1 >= 70) {
            System.out.print("good!!");    
        }
        else if(num1 >= 50) {
            System.out.print("soso!!");    
        }
        else{
            System.out.print("bad!!");
        }      
        
    }
}