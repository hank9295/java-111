public class Test{	
    public static void main(String[] args){
		int[] myArr = {7, 5, 4, 9, 8, 1, 2};
		int a;	
		int max=0;
		int min=0;
		int middle=0;
		int average=0;
		for(int x=0; x<myArr.length; x++){
			average += myArr[x];
			for (int y=0; y<x; y++){
				if (myArr[x]<myArr[y]){
					a = myArr[x];
					myArr[x]=myArr[y];
					myArr[y]=a;
				}
			}
			
			max = myArr[6]; 		
			min = myArr[0];
			middle = myArr[3];
		}
		System.out.printf("max:%d%n",max);//最大
		System.out.printf("min:%d%n",min);//最小
		System.out.printf("average:%d%n",average/7);//平均
		System.out.printf("middle:%d%n",middle);//中位數
		
	
		for (int x=0; x<myArr.length; x++){
			System.out.print(">>"+myArr[x]);
		}	
		
	}
}		
