class One{
	int a = 10;

	void display(){
		System.out.println(a);
	}
}

class Two{
	
	void dispaly(){
		System.out.println(a);
	}
}

class Demo{
	public static void main(String []args){
		One obj = new One();
		obj.display();
		
		Two t = new Two();
		t.display();
	}
}



/*
 error: cannot find symbol
                System.out.println(a);
                                   ^

 error: cannot find symbol
                t.display();
                 ^


*/