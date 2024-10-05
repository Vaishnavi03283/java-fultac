class Demo{
	public static void main(String [] args){
		char ch = fun();
		System.out.println("ch");
	}

	static int fun( ){
		System.out.println("in fun ");	
		return 10;
	}
}



error: incompatible types: possible lossy conversion from int to char
                char ch = fun();
                             ^