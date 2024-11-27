interface A{
	int a = 10;
	void fun();
}
interface B{
	int a = 20;
	void fun();
}
class Child implements A , B{
	public void fun(){
		System.out.println("in fun");
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.fun();
	}
}


/*OUTPUT:-  in fun
	   					*/