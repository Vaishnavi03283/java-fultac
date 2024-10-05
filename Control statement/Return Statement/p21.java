class Demo{
	public static void main(String [] args){
		codex chavi =new codex();
		int sum =chavi.add(10,20);
		int sub =chavi.sub(10,20);
		System.out.println(sum);
		System.out.println(sub);
	}
}

class codex{
	int add(int a,int b){
		return a+b;
	}
	
	int sub(int a,int b){
		return a-b;
	}
}



OUTPUT:-

30
-10