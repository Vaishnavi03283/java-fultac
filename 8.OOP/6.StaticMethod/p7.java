class Test{
	int x;
	
	//a is a local variable
	Test(int a){
		int b = 20;
		x = a;
	}

	static void access(){
		System.out.println(a);
		System.out.println(b);
	}
}

class Demo{
	public static void main(String [] args){
		Test t = new Test(10);
		t.access();
	}
}


/*

 error: cannot find symbol - a&b


*/