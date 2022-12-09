public class Test{	
    public static void main(String[] args){
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int count = 0;
		int i;
		for (int x=0; x<arr.length; x++){
				if (arr[x] == 2){
					System.out.println(">>"+x);
					break;
				}
				count++;
		}
		System.out.println("count>>" + count);
	}
}		
