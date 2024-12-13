/*Throw Clause :- Used to throw an Exception explisitly and catch it..*/

import java.io.*;

class Demo{
	public static void main(String[]args)throws IOException{
		throw new IOException();
	}
}


/*(Run time error)

 Exception in thread "main" java.io.IOException
        at Demo.main(p4.java:7)

*/