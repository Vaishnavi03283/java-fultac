class Demo{
	public static void main(String [] args){
		char [] arr = {'a','b','c','d'};
		arr[0]-=32;
		arr[1]-=32;
		arr[2]-=32;
		arr[3]-=32;

		System.out.println(arr);
	}
}
 

/*OUTPUT:-  ABCD				*/