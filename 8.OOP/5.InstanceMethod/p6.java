class Codex{
	int x;
	
	void fun(int a){
		x = a;
		System.out.println(a);
		System.out.println(x);
	}
	void gun(){
		System.out.println(x);
	}
}

class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.fun(10);
		obj.gun();
	}
}

/*
OUTPUT:-

10
10
10


*/