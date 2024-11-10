class Codex{
	int a = 10;

	Codex(int a){
		this.a = a;
		System.out.println(a);
	}

}

class Demo{
	public static void main(String [] args){
		Codex obj = new Codex(10);	
		System.out.println(obj.a);		
	}
}


/*
OUTPUT:- 10
	 10


*/