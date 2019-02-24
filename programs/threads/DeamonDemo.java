class DeamonDemo {
	public static void main(String[] args) throws Exception {	
		HelloThread ht = new HelloThread();
		
		
		ht.setDaemon(true);
		
		System.out.println(ht.isDaemon());
		ht.start();
		
	}
}

class HelloThread extends Thread {
	HelloThread(){
	}
	
	
	public void run() {
		for(int i = 50; i<60; i++){
			System.out.println(i);
		}		
	}
}
