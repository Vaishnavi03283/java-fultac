
/*Throw Clause :- Used to throw an Exception explisitly and catch it..*/

import java.io.*;

class Demo{
	public static void main(String[]args){
		throw new IOException();
	}
}


/*(compile time error)

 error: unreported exception IOException; must be caught or declared to be thrown
                throw new IOException();
                ^
*/