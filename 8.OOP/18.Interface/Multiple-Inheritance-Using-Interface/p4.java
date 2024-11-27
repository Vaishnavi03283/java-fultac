interface A{
	int a = 10;
}
interface B{
	int a = 20;
}
class Child implements A , B{
	void fun(){
		System.out.println(A.a);
		System.out.println(B.a);
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.fun();
	}
}


/*OUTPUT:-  10
	    20					*/