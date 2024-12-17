class Outer{
	int b = 20;
	class Inner{
		int a = 10;
		void fun(){
			System.out.println("in inner class fun"+a);
			System.out.println("Outer class Var "+b);
		}
	}
}
class Demo{
	public static void main(String[]args){
		Outer.Inner obj = new Outer().new Inner();
		obj.fun();
	}
}



/*OUTPUT:-  

in inner class fun10
Outer class Var 20 

					*/