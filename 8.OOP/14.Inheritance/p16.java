// extends -- Keyword

class Country{
	int a = 20;

}
class Maharashtra extends Country{
	int b = 100;

	void language(){
		System.out.println(a);    
		System.out.println(b);   
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
100



*/