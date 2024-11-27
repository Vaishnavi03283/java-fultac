/*Method Signature:- method name along with mathod parameters ;  fun(int a)*/

class Codex{
	void fun(int a){
		System.out.println("in fun"+ a);
	}
	void fun(char a){
		System.out.println("in fun2"+ a);
	}
}

class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.fun(20);
	}
}



//OUTPUT:-  in fun20