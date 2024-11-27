interface A{
	void fun();
}
class B implements A{
	
}
class Demo{
	public static void main(String[]args){
		B obj = new B();
	}
}


/*error: B is not abstract and does not override abstract method fun() in A
class B implements A{
^
*/