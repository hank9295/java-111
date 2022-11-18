public class Test{
    public static void main(String[] args){
        int a;
		int k = 7;
		
		System.out.printf("%d%n",k);
		
		Test2 t1 = new Test2();
		a = t1.add(k, 4);
		System.out.printf("%d%n",a);
    }

}

class Test1{
	public int add(int x, int y){          
		//int t = add(x, y);
		int t = x + y;
		return t;
	}	
                  
}
class Test2{
	public int add(int x, int y){          
		//int t = add(x, y);
		int t = x - y;
		return t;
	}	
                  
}
