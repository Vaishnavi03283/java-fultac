interface A{
	void fun();
}
class B extends A{

}
class Demo{
	public static void main(String[]args){
		B obj = new B();
	}
}

/*error: no interface expected here
class B extends A{
                ^			*/