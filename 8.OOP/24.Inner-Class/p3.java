class Outer{
	class Inner{
		void fun(){
			System.out.println("in inner class fun");
		}
	}
}
class Demo{
	public static void main(String[]args){
		Outer.Inner obj = new Outer().new Inner();
		obj.fun();
	}
}



/*OUTPUT:-  in inner class fun
*/