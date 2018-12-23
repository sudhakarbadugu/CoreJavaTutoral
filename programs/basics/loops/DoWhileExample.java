class DoWhileExample {
	static public void main(String[] args){
		int i = 100;
		do {
			if(i % 2 == 0)
			System.out.println(i);
			i = i -1;
		}while( i > 50);
	}
}