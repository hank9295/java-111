public class Test{
    public static void main(String[] args){
        int a;
		int k = 7;
		
		System.out.printf("%d%n",k);
		a = add(k, 4);
		System.out.printf("%d%n",a);
    }

	public static int add(int x, int y){          
		//int t = add(x, y);
		int t = x + y;
		return t;
	}	
}