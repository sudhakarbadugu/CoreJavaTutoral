class JoinDemo {
	public static void main(String[] args){	
		HelloThread ht = new HelloThread();

		System.out.println("main thread");
		ht.start();
		
		try{
			ht.join(5000); //called by main thread
		}catch(Exception e){
		}
		
		for(int i = 50; i<60; i++){
			System.out.println(i);
		}
	}
}

class HelloThread extends Thread {
	public void run(){
		System.out.println("Child thread");

		try{
			Thread.sleep(1000); //called by child thread
		}catch(Exception e){
		}
		
		for(int i = 1; i< 10; i++){			
			System.out.println(i);		
		}
	}
}