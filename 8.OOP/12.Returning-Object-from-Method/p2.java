class One{
	int a = 10;
	void display(){
		Two obj = new Two();
		return obj;
	}
}

class Two{
	int b = 20;
	void gun(){
		System.out.println("in Twos gun");
	}
}

class Demo{
	public static void main(String [] args){
		One o = new One();
		o.display();
	}
}


/*OUTPUT:-

error: incompatible types: unexpected return value
                return obj;
                       ^



*/ 