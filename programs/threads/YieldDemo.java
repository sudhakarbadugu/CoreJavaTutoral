class YieldDemo {
	public static void main(String[] args){	
		HelloThread ht = new HelloThread();

		System.out.println("main thread");
		ht.start();
		
		for(int i = 50; i<60; i++){
			System.out.println(i);
		}
	}
}

class HelloThread extends Thread {
	public void run(){
		System.out.println("Child thread");

		Thread.yield();
		for(int i = 1; i< 10; i++){
			
			System.out.println(i);
		
		}
	}
}