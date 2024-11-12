class Test{
	static int x = 10;

	static void access(){
		System.out.println(x);
	}
}

class Demo{
	public static void main(String [] args){
		Test t = new Test();
		Test t1 = new Test();

		t.x++;
		t.access();
		System.out.println("var x is : "+t.x);
		t1.access();
		System.out.println("var x is : "+t1.x);
	}
}

/*

OUTPUT:-
11
var x is : 11
11
var x is : 11





*/