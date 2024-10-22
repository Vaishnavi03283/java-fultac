class Demo{
	public static void main(String [] args){
		Codex chavi = new Codex();
		String name = chavi.toUpperCase();
		System.out.println(name);
	}																
}

class Codex{
	String toUpperCase(){
		char [] names = {'v','i','r','a','t'};
		for(int i=0;i<names.length; i++){
			names[i]-=32;
		}
		String name = new String(names);
		return name;
	}
}

/*OUTPUT:-  VIRAT						*/