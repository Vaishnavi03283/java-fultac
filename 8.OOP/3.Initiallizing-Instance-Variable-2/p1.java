class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		System.out.println(obj.a);
		obj.a = 10;
		System.out.println(obj.a);
	}
}

class Codex{
	int a ;
}


/*

OUTPUT:-  0
	  10


*/