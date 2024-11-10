class Test{
	static{
		System.out.println("in static block");
	}

	static void gun(){
		System.out.println("in gun");
	}
}

class Demo{
	public static void main(String [] args){
		Test t = new Test();
		Test.gun();
		System.out.println("in main block");
	}
}

/*
OUTPUT:-

in static block
in gun
in main block


*/