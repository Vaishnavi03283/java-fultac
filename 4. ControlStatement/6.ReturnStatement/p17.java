class Demo{
	public static void main (String [] args){
		int sum =Arithmatic.add(10,20);
		int sub =Arithmatic.sub(10,20);
		System.out.println(sum);
		System.out.println(sub);
	}
}

class Arithmatic {
	static int add(int a,int b){
		int sum =a+b;
		return sum;
	}

	static int sub(int a,int b){
		int sub =a-b;
		return sub;	
	}
}




/*OUTPUT:-

30
-10                  */