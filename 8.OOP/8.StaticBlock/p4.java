class Test{
	static{
		System.out.println("in static block");
	}
}

class Demo{
	public static void main(String [] args){
		Test t = new Test();
		System.out.println("in main block");
	}
}

/*
OUTPUT:-  in static block
	  in main block




*/