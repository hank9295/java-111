public class Test{	
    public static void main(String[] args){
		int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int left = 0;
		int right = arr.length-1;
		int medianIndex;
		int count = 0;
		int numder = 2;
		int numberIndex = 0;
		
			for (int x=0; x<3; x++){
				medianIndex = (right - left)/2+left;
				if (arr[medianIndex] == numder){
					numberIndex = medianIndex;
					break;		
		        }
				count++;
				
				if (numder > arr[medianIndex])
					right = medianIndex/2;
				else
					left = medianIndex;
					
		    }
		System.out.println("The position is>>" + numberIndex);	
		System.out.println("count>>" + count);
	}
}	