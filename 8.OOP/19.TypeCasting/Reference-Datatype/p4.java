class Emp{
	void fun(){
		System.out.println("Emp");
	}
}
class Dev extends Emp{
	void gun(){
		System.out.println("Dev");
	}
}
class Demo{
	public static void main(String[]args){
		Emp e = new Dev();
		e.fun();
		Dev obj =(Dev)e;  //Narrowing of parent class reference into child reference

		obj.fun();
		obj.gun();
	}
}


/*OUTPUT:- Emp
	   Emp
	   Dev							*/

