class Outer{
	class Inner{
		void fun(){
			System.out.println("in inner class fun");
		}
	}
}
class Demo{
	public static void main(String[]args){
		Outer obj = new Outer();
		obj.fun();
	}
}



/*OUTPUT:-

error: cannot find symbol
                obj.fun();
                   ^


*/