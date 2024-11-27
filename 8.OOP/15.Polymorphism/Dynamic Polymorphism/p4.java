class Codex{

	void fun(int a , int b){
		System.out.println(a+b);
	}
	
	void fun(int a, int b, int c){
		System.out.println(a+b+c);
	}
}
class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.fun(10,20);
		c.fun(10,20,30);
	}
}


/*OUTPUT:-   30
             60	*/