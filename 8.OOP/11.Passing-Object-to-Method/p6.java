class One{
	int a = 10;
	void display(){
		System.out.println(a);
	}
}

class Two{
	void display(One ref){
		System.out.println(ref.a);
	}
}

class Three{
	void display(One ref1){
		System.out.println(ref1.a);
	}
}

class Four{
	void display(One ref2){
		System.out.println(ref2.a);
	}
}

class Demo{
	public static void main(String [] args){
		One obj = new One();
		obj.display();

		Two t = new Two();
		t.display(obj);

		Three t1 = new Three();
		t1.display(obj);
		
		Four t2 = new Four();
		t2.display(obj);
	}
}



/*
OUTPUT:- 

10
10
10
10




*/






