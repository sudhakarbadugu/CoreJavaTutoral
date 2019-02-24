class RunnableDemo {
	public static void main(String[] args){
		
		NumberThread nt = new NumberThread();
	
		Thread t = new Thread(nt);
		t.setPriority(8);	
		t.start();
	
		
		System.out.println("main thread");
		for(short i = 65; i< 91; i++){
			System.out.println((char)i);
		}
		
		// for(int i = 0; i< 10 ; i++){
			// System.out.println(i);
		// }
	}
}

//1 create class
class NumberThread implements Runnable {

	public void run(){//definition
		System.out.println("Child thread");
		for(int i = 0; i< 10 ; i++){
			System.out.println(i);
		}
	}
}