// extends -- Keyword

class Country{
	int a = 20;

}
class Maharashtra extends Country{
	int a = 10;

	void language(){
		System.out.println(this.a);    //Local or Child instance variable
		System.out.println(super.a);   // Parent instance variable
	}
}
class Demo{
	public static void main(String[]args){
		System.out.println("Maharashtra language is : ");
		Maharashtra obj = new Maharashtra();
		obj.language();
	}
}

/*
OUTPUT:-

Maharashtra language is :
10
20


*/