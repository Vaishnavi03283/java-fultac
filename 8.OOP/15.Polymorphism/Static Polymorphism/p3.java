// Polymorphism Using Private Method

class Parent{
	private void education(){
		System.out.println("Engineering");
	}
}
class Child extends Parent{
	private void education(){
		System.out.println("Chaha taprii......");
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.education();
	}
}
	

/*error: education() has private access in Child
                obj.education();
                   ^						*/