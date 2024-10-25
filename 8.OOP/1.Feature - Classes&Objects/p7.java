class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.fun();
		System.out.println(obj.a);
	}
}

class Codex{
	int a = 10;
	void fun(){
		System.out.println(a);
	}
}

/*
OUTPUT:-  10      //initiallizing instance variable - topic
	  10

*/