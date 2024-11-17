class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent{
	Child(){
		super();  // call Parent class - default constructor 
		System.out.println("Child Constructor");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
	}
}

/*
OUTPUT:-

Parent Constructor
Child Constructor



*/