class Codex{
	private int a = 10;
	public int b = 20;
	protected int c = 30;
	int d = 40;---------------default 
	
}
class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();
		//System.out.println(obj.a); -----------error
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}


/*OUTPUT:-  	20
		30
		40							*/