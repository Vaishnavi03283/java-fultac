interface A{
	void fun(); 		// By default compiler add public abstract to a method
}
class B implements A{
	public void fun(){
		System.out.println("in fun");
	}
}
class Demo{
	public static void main(String[]args){
		B obj = new B();
		obj.fun();
	}
}


//OUTPUT:- in fun


/*Byte Code(A class)

interface A {
  public abstract void fun();
}


*/
