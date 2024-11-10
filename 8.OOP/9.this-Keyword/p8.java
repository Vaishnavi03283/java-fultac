class Codex{
	int a;

	Codex(){
		System.out.println("default Constructor");
	}

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


//OUTPUT:-  in fun10