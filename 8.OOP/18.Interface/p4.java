interface A{
	void fun();
}
class B implements A{
	void fun(){
		System.out.println("in fun");
	}
}
class Demo{
	public static void main(String[]args){
		B obj = new B();
		obj.fun();
	}
}


/* error: fun() in B cannot implement fun() in A
        void fun(){
             ^
  attempting to assign weaker access privileges; was public					*/