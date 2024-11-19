// Multiple Inheritance >> 

class Father{
	int x = 20;
}
class Mother{
	int x = 10;
}

class Child extends Father,Mother{
	
	void fun(){
		System.out.println(x);
	}
}

class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.fun();
	}
}

/* error: '{' expected
class Child extends Father,Mother{
                          ^
Multiple Inheritance >> Not support in java (Father,Mother)
*/