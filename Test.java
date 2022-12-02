public class User{	
    public static void main(String[] args){
		int[] iArr = {7, 3, 4, 9, 6};
		int i;
		for (int x=0; x<iArr.length-1; x++){
			if (iArr[x]>iArr[x+1]){
				i = iArr[x];
				iArr[x]=iArr[x+1];
				iArr[x+1]=i;
			}	
		}	
				
			
				
		for (int x=0; x<iArr.length; x++){			
			System.out.println(">>" + iArr[x]);
		}	
	}
	public static void add(int x) {
		System.out.println("===>" + x);
	}	
}	