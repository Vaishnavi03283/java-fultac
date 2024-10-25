class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.fun();
		System.out.println(obj);
	}
}

class Codex{
	int a ;
	void fun(){
		System.out.println(a);
	}
}

/*
OUTPUT:-  0
	  Codex@2f92e0f4
*/