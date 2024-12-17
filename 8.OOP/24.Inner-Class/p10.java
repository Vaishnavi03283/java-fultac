//2)-As an implementor of the specified interface


interface Outer{
	void fun();
}
class Demo{
	public static void main(String[]args){
		Outer obj = new Outer(){
			public void fun(){
				System.out.println("in Anpnymous fun");
			}
		};

		obj.fun();
	}
}



//OUTPUT:-  in Anpnymous fun