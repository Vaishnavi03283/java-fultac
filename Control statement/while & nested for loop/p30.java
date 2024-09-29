class Demo{
	public static void main (String [] args){
		for(int i=1;i<=4;i++){
			int a=1;
			for(int j=4;j>=1;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print(a+" ");
					a++;
				}
			}
				System.out.println( );
		}
	}
}



    1
  1 2
 1 2 3
1 2 3 4