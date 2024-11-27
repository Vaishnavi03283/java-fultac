/* Access Specifier >> Keyword >> specifies how to access the member of class. 
   Access specifier:- 1.Private 
		      2.Public
		      3.Protected
		      4.Default	
*/

class Codex{
	private int a =10;
}
class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();
		System.out.println(obj.a);
	}
}



/* error: a has private access in Codex
                System.out.println(obj.a);
                                      ^								*/