class Test{
	static int x = 10;

	void access(){
		System.out.println(x);
	}
}

class Demo{
	public static void main(String [] args){
		Test t = new Test();
		t.access();
	}
}


//OUTPUT:-  10