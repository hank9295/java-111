public class Test{	
    public static void main(String[] args){
		int[] myArr = {7, 5, 4, 8, 1, 2};
		int y;
		for(int x=0; x<myArr.length/2; x++){
				y = myArr[x];
				myArr[x] = myArr[myArr.length-1-x];
				myArr[myArr.length-1-x] = y;

				
				
			
		}
		for (int i=0; i<myArr.length; i++){
			System.out.println(myArr[i]);
		}	
		
	}
}		
