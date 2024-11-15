// extends -- Keyword

class Country{
	int a = 20;

}
class Maharashtra extends Country{

	void language(){
		System.out.println(a);
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