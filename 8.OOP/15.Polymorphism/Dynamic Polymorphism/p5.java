class Codex{

	void fun(int a , int b){
		System.out.println(a+b);
	}
	int fun(int a, int b, int c){
		return a+b+c;
	}
}
class Demo{
	public static void main(String[]args){
		Codex c = new Codex();
		c.fun(10,20);
		int sum = c.fun(10,20,30);
		System.out.println(sum);
	}
}

/*
OUTPUT:- 30
	 60



*/