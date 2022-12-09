public class Test{	
    public static void main(String[] args){
		int[] arr = {9, 8, 7, 6, 5};
		int i;
		int count = 0;
		for (int x=0; x<arr.length; x++){
			for (int y=0; y<x-1; y++){
				if (arr[x]<arr[y]){
					i = arr[x];
					arr[x]=arr[y];
					arr[y]=i;
				}
			count++;
			}	
		}	
						
		for (int x=0; x<arr.length; x++){			
			System.out.println(">>" + arr[x]);
		}	
			System.out.printf("%d",count);
	}
	public static void add(int x) {
		System.out.println("===>" + x);
	}	
}	