/*3.Anpnymous Inner Class :- (applicable in --> Android Devleopment)  
 	Anpnymous Inner class are declared without any name.

They created in two ways:-
1)-As a sub-class of specified type.
2)-As an implementor of the specified interface				*/


//* 1)-As a sub-class of specified type.


class Outer{
	void fun(){
		System.out.println("in fun");
	}
}
class Demo{
	public static void main(String[]args){
		Outer obj = new Outer(){
			void fun(){
				System.out.println("in Anpnymous fun");
			}
		};
		obj.fun();
	}
}







//OUTPUT:-  in Anpnymous fun