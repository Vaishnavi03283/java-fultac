class Demo{
	public static void main(String[]args){
		try{
			System.out.println(10/0);     //new ArithmeticException(" / by zero");
		}
	}
}

/*
(compile time error)
p7.java:3: error: 'try' without 'catch', 'finally' or resource declarations
                try{
                ^
*/