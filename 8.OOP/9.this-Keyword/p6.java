class Codex{
	int a ;

	Codex(){
		this(10);
		System.out.println("default Constructor");
	}

	Codex(int a ){
		this.fun();
	}

	void fun(){
		System.out.println("in fun"+a);
	}
}

class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
	}
}


/*
OUTPUT:-

in fun0
default Constructor


*/