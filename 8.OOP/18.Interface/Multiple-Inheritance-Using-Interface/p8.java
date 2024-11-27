interface A{
	int a = 10;
	void fun();
}
interface B extends A{
	void gun();
}
class Child implements A , B{
	public void fun(){
		System.out.println("in fun");
	}
	public void gun(){
		System.out.println("in gun");
	}
}
class Demo{
	public static void main(String[]args){
		B obj = new Child();
		obj.fun();
		obj.gun();
	}
}


/*OUTPUT:-  in fun
	    in gun					*/