//Final Method

class Parent{
	final void education(){
		System.out.println("Engineering");
	}
}
class Child extends Parent{
	final void education(){
		System.out.println("Eng odun sagla");
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.education();		
	}
}


/*error: education() in Child cannot override education() in Parent
        final void education(){
                   ^									*/