class Demo{
	public static void main(String [] args){
	
		boolean a = true;
		switch (a) {

			case 10 :
				System.out.println("case 1");

			default :
				System.out.println("default");
		}
	}
}




error: primitive patterns are a preview feature and are disabled by default.
                switch (a) {
                       ^

error: incompatible types: int cannot be converted to boolean
                        case 1 :