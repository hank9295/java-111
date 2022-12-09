public class Test{	
    public static void main(String[] args){
		int[] arr = {7, 3, 4, 9, 6, 10, 8, 5, 1, 2};
		int i;
		for (int x=0; x<arr.length; x++){
			for (int y=0; y<arr.length; y++){
				if (arr[x]<arr[y]){
					i = arr[x];
					arr[x]=arr[y];
					arr[y]=i;
				}
			}	
		}	
				
						
		for (int x=0; x<arr.length; x++){			
			System.out.println(">>" + arr[x]);
		}	
	}
	public static void add(int x) {
		System.out.println("===>" + x);
	}	
}	