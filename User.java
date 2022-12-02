public class User{	
    public static void main(String[] args){
		// Car myCar = new Car();	
		Car[] myCar = new Car[100000];           //[]代表陣列

		for (int x=0; x<100000; x++){
			myCar[x] = new Car();          // new 實體化，創造; myCar變成了"物件"
			myCar[x].whee11 = x;
		    int z = myCar[x].lanuch(7);
			System.out.println(z);
		}	
	}
}	