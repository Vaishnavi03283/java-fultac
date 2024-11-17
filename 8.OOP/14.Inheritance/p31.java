class Parent{

	void fun(){
		System.out.println("in Parent fun");
	}
}
class Child{

	void gun(){
		System.out.println("in Child gun");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Parent();
		c.gun();
	}
}

/*

 error: incompatible types: Parent cannot be converted to Child
                Child c = new Parent();
                          ^

*/