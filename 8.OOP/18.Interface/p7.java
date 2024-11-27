interface CreditCard{
	void interest();
	void limit();
}
class Axis implements CreditCard{
	public void interest(){
		System.out.println("%12");
	}
	public void limit(){
		System.out.println("1 lakh");
	}
}
class HDFC implements CreditCard{
	public void interest(){
		System.out.println("%10");
	}
	public void limit(){
		System.out.println("2 lakh");
	}
}
class Demo{
	public static void main(String[]args){
		System.out.println("Axis data :-");
		Axis obj = new Axis();
		obj.interest();
		obj.limit();

		System.out.println("===========================");

		System.out.println("HDFC data :-");
		HDFC obj1 = new HDFC();
		obj1.interest();
		obj1.limit();
	}
}


/*OUTPUT:-

Axis data :-
%12
1 lakh
===========================
HDFC data :-
%10
2 lakh




*/