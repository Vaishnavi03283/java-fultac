class Parent{
	public void education(){
		System.out.println("Engineering");
	}
}
class Child extends Parent{
	void education(){
		System.out.println("Engineering sodun sagla");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();
	}
}



/*error: education() in Child cannot override education() in Parent
        void education(){
             ^
  attempting to assign weaker access privileges; was public					*/