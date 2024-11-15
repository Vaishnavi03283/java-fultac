class Country{
	int a = 10;

}
class Maharashtra extends Country{

	void language(){
		System.out.println(a);
	}
}
class Demo{
	public static void main(String[]args){
		Country obj = new Country();
		obj.language();
	}
}



/*

 error: cannot find symbol
                obj.language();
                   ^




*/