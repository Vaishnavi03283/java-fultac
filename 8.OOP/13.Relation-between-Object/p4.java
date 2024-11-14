class One{
	int x;
	Two t;

	One(Two t){
		t = t;
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
		y = y;
	}
	void display(){
		System.out.println("Twos y : "+ y);
	}
}

class Demo{
	public static void main(String [] args){
		Two obj2 = new Two(22);
		One obj1 = new One(obj2);
		obj1.display();
	
	}
}

/*

NullPointerException: Cannot invoke "Two.display()" because "this.t" is null



*/