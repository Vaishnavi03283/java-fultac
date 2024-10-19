class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		Codex chavi = new Codex();
		chavi.add(a,b);
		chavi.sub(a,b);
	}
}



class Codex{

	void add(int a , int b){
		System.out.println("Addition is: "(a+b));
	}

	void sub(int a , int b){
		System.out.println("sub is: "(a-b));
	}
}