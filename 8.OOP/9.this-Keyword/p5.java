class Codex{
	int a = 10;

	Codex(int a){
		this.a = a;
		this.fun();
	}

	void fun(){
		System.out.println("in fun"+a);
	}
}

class Demo{
	public static void main(String [] args){
		Codex obj = new Codex(10);
	}
}


//OUTPUT:- in fun10