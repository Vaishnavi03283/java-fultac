class Codex{
	int a = 10;

	void fun(){
		static int b = 20;
		System.out.println(b);
	}
}

class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.fun();
	}
}

/*error :- static variable is not present in method

Execution Priority:- 1).static block
		     2).static variable
		     3).instance methods / static methods	
*/