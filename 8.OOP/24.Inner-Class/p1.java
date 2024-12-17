/*Inner Class :-

1.Nested Inner Class
2.Method local Inner Class
3.Static Nested Inner class
4.Anpnymous Inner Class.

*/


//1.Nested Inner Class :-


class Outer{
	class Inner{
		void fun(){
			System.out.println("in inner class fun");
		}
	}
}
class Demo{
	public static void main(String[]args){
		Inner obj = new Inner();
		obj.fun();
	}
}



/*OUTPUT:-

error: cannot find symbol
                Inner obj = new Inner();
                ^


*/