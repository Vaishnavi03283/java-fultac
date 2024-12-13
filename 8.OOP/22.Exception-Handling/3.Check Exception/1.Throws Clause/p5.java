import java.io.*;

class Demo{

	static void gun(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
	}
	public static void main(String[]args)throws IOException{
		gun();
	}
}




/*(COmpile-Time-Error)

 error: unreported exception IOException; must be caught or declared to be thrown
                String s = br.readLine();
                                      ^
*/