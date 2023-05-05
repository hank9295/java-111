import java.util.ArrayList;
import java.util.ArrayList;
public class Test{             
	public static void main (String[] args){
		ArrayList<ArrayList<Integer>> arrList = new ArrayList<Integer>();
		
		arrList.add(new ArrayList<Integer>());
		arrList.get(0).add(100);
		System.out.println(arrList.get(0).get(0));
		
		
	}
}
/*import java.util.ArrayList;
public class Test{             //MyArrayList
	public static void main (String[] args){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		System.out.println("length = " + arrList.size());
		arrList.add(100);
		System.out.println("length = " + arrList.size());
		arrList.add(200);
		arrList.add(300);

		for(Integer value: arrList){
			System.out.println("arrList = " + value);	
		}
		
		for(int i = 0; i<arrList.size(); i++)  //get
			System.out.println("arrList = " + arrList.get(i));
		
		System.out.println("======================");
		
		arrList.remove(0); //delete
		for(int i = 0; i < arrList.size(); i++)
			System.out.println("arrList = " + arrList.get(i));
		
	}
}*/

/*import java.util.Arrays;
public class Test{  //arraycopy
	public static void main(String[] args){
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[arr1.length];
		
		System.arraycopy(arr1, 0 ,arr2, 0, arr1.length);
		
		arr2[0] = 100;
		
		for(int e : arr1)
			System.out.println("arr1 = " + e);
	}		

}*/

/*import java.util.Arrays;
public class Test{

    public static void main(String [] argv){

        int [] arr1 = {1,2,3,4,5,6,7,8};

        int [] arr2 = new int[8];

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
      
        for(int i : arr2){
            System.out.print(i + " ");
        }
    }
}*/
