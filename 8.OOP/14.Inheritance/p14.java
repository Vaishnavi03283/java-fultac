// extends -- Keyword

class Country{
	int a = 20;

}
class Maharashtra extends Country{
	int a = 10;

	void language(){
		System.out.println(super.a);
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
20


*/