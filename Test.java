import java.util.Scanner;
public class Test{	
    public static void main(String[] args){
		int[] myArr = {7, 5, 4, 9, 8, 1, 2};
		int[] flag =new int [myArr.length];
		int flag_count = 1;	
		int med=0;
		int number=0;
		Scanner input = new Scanner(System.in);
		System.out.print("number:");
		number = input.nextInt();
		for(int i=0; i<number; i++){
			int flag_min = 1000;
			int flag_min_index = 0;
			for (int j=0; j<myArr.length; j++){
				if(myArr[j] < flag_min && flag[j] == 0){
					flag_min = myArr[j];
					flag_min_index = j;
				}
			}
			flag[flag_min_index] = flag_count;
			flag_count++;
			med = myArr[flag_min_index];
		}

		System.out.printf("med:%d%n",med);
		
		
		
		
	}
}		
