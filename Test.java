public class Test{	
    public static void main(String[] args){
		Human.printheight();
	}
}	

class Human{	
	int sex;
	static int height = 180;
    private int weight = 75;
	
	public static void printheight(){
		System.out.println(height);
	}	
	
	private void printweight(){
		System.out.println(weight);
	}	
}	
