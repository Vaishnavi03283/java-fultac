class Test{
	//static variable
	static int a = 10;
	
	static void access(){
		System.out.println(a);
	}
}

class Demo{
	public static void main(String []args){
		Test t = new Test();
		t.access();
	}
}



//OUTPUT:-  10