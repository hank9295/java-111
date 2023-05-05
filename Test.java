import java.util.Arrays; 
public class Test{             
	public static void main (String[] args){
		int[] a = {8, 6, 7, 5, 1, 2, 9, 3, 4};
		Arrays.sort(a);
		for(int good: a)
			System.out.print(good);
	}
}	