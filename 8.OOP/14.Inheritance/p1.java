class A{
	int a = 10;
}

class B{
	void fun(){
		System.out.println(a);
	}
}

class Demo{
	public static void main(String[]args){
		B obj = new B();
		obj.fun();
	}
}


/*
 error: cannot find symbol
                System.out.println(a);
                                   ^




*/