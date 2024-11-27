class Codex{
	void add(int a){
		System.out.println(10);
		System.out.println("Vaishnavi");
	}
	void add(String str){
		System.out.println("Vaishnavi");
	}

}
class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.add(10);
		c.add("Vaishnavi");
	}
}




/*
OUTPUT:- 10
	Vaishnavi
	Vaishnavi



*/