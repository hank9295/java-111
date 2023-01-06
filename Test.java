public class Test{	
    public static void main(String[] args){
		int x = 10;
		int y = x;
		y = 20; 
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		

		int[] arr = {1, 2, 3, 4, 5, 6, 7,};
		int[] arr2 = arr;
		arr[0] = 10;	
		System.out.println("arr[0]=" + arr[0]);
		System.out.println("arr2[0]=" + arr2[0]);
	}
}	