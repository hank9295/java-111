class Human{	
	String sex;
	int height;
    int weight;
	
	public Human(String sex, int height, int weight){
		this.sex = sex;
		this.height = height;
		this.weight = weight;
	}	
	
	public void printsex(){
		System.out.println(sex);
	}

	public void printHight(){
		System.out.println(height);
	}

	public void printWight(){
		System.out.println(weight);
	}		
}	