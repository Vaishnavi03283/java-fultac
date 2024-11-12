class One{
	int a = 10;
	void display(){
		System.out.println("One method "+ a);
	}
}
class Two{

	//passing object to a method
	void data(One ref){
		System.out.println("Twos method : "+ ref);
		ref.display();
	}

	//passing primitive datatype to a method
	void display(int a){
		System.out.println("Twos method : "+ a);
	}
}

class Demo{
	public static void main(String [] args){
		One obj = new One();
		int a = 10;

		Two t = new Two();
		t.display(a);
		t.data(obj);
	}
}


/*
OUTPUT:-

Twos method : 10
Twos method : One@3af49f1c
One method 10






*/





