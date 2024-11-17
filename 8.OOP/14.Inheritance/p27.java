class Parent{
	

}
class Child extends Parent{
	Child(){
		super();
		System.out.println("in Child");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
	}
}

/*

Byte Code :-(Parent class - Parent -object)

class Parent {
  Parent();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return
}


invokespecial - super()
java-by default-support-inheritance




*/