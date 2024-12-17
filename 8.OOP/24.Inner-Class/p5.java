class Outer{
	int b = 20;
	class Inner{
		int a = 10;
		void fun(){
			System.out.println("in inner class fun"+a);
			System.out.println("Outer class Var "+b);
		}
	}

	void gun(){
		System.out.println("in Outer class gun"+a);
	}
}
class Demo{
	public static void main(String[]args){
		Outer.Inner obj = new Outer().new Inner();
		obj.fun();
		Outer obj1 = new Outer();
		obj1.gun();
	}
}



/*OUTPUT:-  

error: cannot find symbol
                System.out.println("in Outer class gun"+a);
                                                        ^

					*/