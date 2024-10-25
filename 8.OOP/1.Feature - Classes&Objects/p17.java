class Codex{
	int a ;
	void fun(){
		System.out.println(a);
	}
}

class Jankalyan{
	void gun(){
		System.out.println("in gun : "+ obj.a);
	}
}

class Demo{
	public static void main(String [] a ){
		Codex obj = new Codex();
		obj.fun();

		Jankalyan obj1 = new Jankalyan();
		obj1.gun();		
	}
}



/*
 error: cannot find symbol
                System.out.println("in gun : "+ obj.a);
                                                ^

*/