class One{
	int x;
	Two t;

	One(Two t){
		this.t = t;
		x = 10;
	}
	void display(){
		System.out.println("Ones x  : "+ x);
		t.display();
		System.out.println("Twos var y : "+ t.y);
	}
}

class Two{
	int y;
	
	Two(int y){
		this.y = y;
	}
	void display(){
		System.out.println("Twos y : "+ y);
	}
}

class Demo{
	public static void main(String [] args){
		Two obj2 = new Two(22);
		One obj1 = new One(10);
		obj1.display();
	
	}
}

/*
 error: incompatible types: int cannot be converted to Two
                One obj1 = new One(10);
                                   ^
*/