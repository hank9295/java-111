import java.util.Scanner;
public class Test{	
    public static void main(String[] args){
		int money=0;  
		int km=0;
		int a=85;
		Scanner input = new Scanner(System.in);        
        System.out.print("km:");
        km = input.nextInt();
		if(km<=7)
			System.out.printf("%d",a);
		else if(km>7){
			money=(km-7)*5+a;
		    System.out.printf("%d",money);
		}
	}
}	