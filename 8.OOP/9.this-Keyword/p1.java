class Codex{
	
	void fun(){
		System.out.println("address of own class Codex : "+ this);
	}
}

class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.fun();
		System.out.println("address of Codex : "+obj);
	}
}


/*
OUTPUT:-
address of own class Codex : Codex@2f92e0f4
address of Codex : Codex@2f92e0f4





*/