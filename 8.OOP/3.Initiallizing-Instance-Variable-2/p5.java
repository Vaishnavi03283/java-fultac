class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		System.out.println(obj.a);	
		obj.a = 20;	
		System.out.println(obj.a);
	}
}

class Codex{
	int a = 10;
}



/*

OUTPUT:-  10
	  20



*/