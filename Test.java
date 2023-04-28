import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		int[] arr = {11, 2, 3, 14, 5, 16, 7};
		
		int min = Integer.MAX_VALUE;
	
		

		Arrays.sort(arr);
		
		for(int e : arr)
			System.out.println("e = " + e);
			System.out.println();
	}		

}