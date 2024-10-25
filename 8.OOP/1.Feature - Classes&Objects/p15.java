class Codex{
	int a ;
	void fun(){
		System.out.println(a);
	}
}

class Jankalyan{
	void gun(){
		Codex obj = new Codex();
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
OUTPUT:-  0
	  in gun : 0

*/