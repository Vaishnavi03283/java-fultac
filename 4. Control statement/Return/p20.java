class Demo{
	public static void main(String [] args){
		codex chavi = new codex();
		int sum = chavi.fun(10,20);
		System.out.println(sum);
	}
}

class codex{
	int fun(int a,int b){
		System.out.println("in fun");
		return (a+b);
	}
}



/*OUTPUT:-

in fun
30              */