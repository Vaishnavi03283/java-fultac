abstract class RBI{
	abstract void interest();
	void weeklyoff(){
		System.out.println("sat-sun off");
	}
}
class Axis extends RBI{
	void interest(){
		System.out.println("%12");
	}
	void weeklyoff(){
		System.out.println("sun off");
	}
}
class HDFC extends RBI{
	void interest(){
		System.out.println("%10");
	}
}
class Demo{
	public static void main(String[]args){
		System.out.println("Axis data :-");
		Axis a = new Axis();
		a.interest();
		a.weeklyoff();
		
		System.out.println("================================");
		System.out.println("HDFC data :-");
		HDFC c = new HDFC();
		c.interest();
		c.weeklyoff();	
	}
}


/*OUTPUT:- 

Axis data :-
%12
sun off
================================
HDFC data :-
%10
sat-sun off

*/





