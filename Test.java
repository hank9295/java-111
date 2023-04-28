public class Test{
	public static void main(String[] args){
		int[] arr1 = {1, 2, 3, 4, 5};
		
		for (int good : arr1){
			good++;
			System.out.println(good);
		}
		
		/*int[] arr2 = arr1;
		arr2[0] = 100;
		System.out.println(arr1[0]);*/
		
	    /*arr2 = arr1.clone();
		arr2[0] = 100;
		System.out.println(arr1[0]);*/
		
		System.out.println("====================");
		
		for (int good : arr1){
			System.out.println(good);
		}

	}
}	