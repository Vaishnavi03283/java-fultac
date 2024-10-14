class Demo{
	public static void main(String [] args){
		Scanner Sc =new Scanner();
		int a = Sc.nextInt();
		System.out.println(a);
		String b = Sc.next();
		System.out.println(b);
	}
}

class Scanner{
	
	int nextInt(){
		return 10;
	}
	String next(){
		return "Codex";
	}
}





/*OUTPUT:-  

 10
 Codex         */