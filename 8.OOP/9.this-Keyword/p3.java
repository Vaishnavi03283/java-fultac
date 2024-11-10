class Codex{
	int a = 10;

	void fun(){
		System.out.println("instance var a : "+a);
	}

	static void gun(){
		System.out.println("instance var a : "+this.a);
	}
}

class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.fun();
		obj.gun();
	}
}


/*  error: non-static variable this cannot be referenced from a static context



*/