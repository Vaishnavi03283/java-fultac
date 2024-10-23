class Demo{
	public static void main(String [] args){
		Codex chavi = new Codex();
		String name = chavi.reverse();
		System.out.println(name);
	}																
}

class Codex{
	String reverse(){
		char [] names = {'v','i','r','a','t'};
		for(int i=4;i>=0; i--){
			names[i]-=32;
		}
		String name = new String(names);
		return name;
	}
}