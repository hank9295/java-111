public class Test{	
    public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int x = 10;
		
		setVariable(x);
		System.out.println("setVariable = "+x);
		
		setVariable(arr);
		for (int i:arr)
			System.out.println("setVariable = "+i);
	}
	
	public static void setVariable(int x){
		x = 20;
	}

	public static void setVariable(int arr[]){
		arr[0] = 20;
	}	
}	