public class Test{	
    public static void main(String[] args){
		int[] myArr = {7, 5, 4, 9, 8, 1, 2};
		float a;
		for(int i=0; i<5; i+=2){
			a=myArr[i]+myArr[i+1];
			
			System.out.printf("number:%.1f%n",a/2);

		}
		System.out.printf("number:%d%n",myArr[myArr.length-1]);
		
		
		
	}
}		
