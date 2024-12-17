class Outer{
	int b = 20;
	private class Inner{
		int a = 10;
		void fun(){
			System.out.println("in inner class fun"+a);
			System.out.println("Outer class var"+b);
		}
	}

	void gun(){
		Inner obj1 = new Inner();
		obj1.fun();
		System.out.println("in Outer class gun"+b);
	}
}
class Demo{
	public static void main(String[]args){
		Outer obj = new Outer();
		obj.gun();
	}
} 



/*OUTPUT:-

in inner class fun10
Outer class var20
in Outer class gun20




*/



/*OUTPUT:-

error: Outer.Inner has private access in Outer
                Outer.Inner obj = new Outer().new Inner();
                     ^


*/