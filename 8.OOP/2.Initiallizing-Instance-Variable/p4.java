class Codex{
	int a ;
	void fun(){
		System.out.println(a);
	}
}


class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.a = 10;
		obj.fun();
	}
}


//OUTPUT:-  10