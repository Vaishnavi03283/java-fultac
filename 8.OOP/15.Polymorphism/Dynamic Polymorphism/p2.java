/*
Method Over-Loading :-same mathod performs different tasks.
		(method name & signature {i.e- parameters} different)
*/

class Codex{

	void fun(){
		System.out.println("in fun");
	}
	void fun(int a){
		System.out.println("in fun 2");
	}
}
class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();
		obj.fun(10);
	}
}


//OUTPUT:-  in fun 2