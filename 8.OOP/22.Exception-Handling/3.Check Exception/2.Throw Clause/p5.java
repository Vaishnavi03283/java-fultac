/*Throw Clause :- Used to throw an Exception explisitly and catch it..*/

import java.io.*;

class Demo{
	public static void main(String[]args)throws IOException{
		
		try{
			throw new IOException();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}


/*(Run time error)

java.io.IOException

*/