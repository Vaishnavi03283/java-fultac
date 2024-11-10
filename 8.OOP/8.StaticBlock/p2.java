class Demo{
	static int a = 10;

	public static void main(String [] args){
		System.out.println("in main block");
	}
}

/*
OUTPUT:- in main block

Byte code :-

class Demo{
	static int a;

	static{
		a = 10;
	}
}



*/