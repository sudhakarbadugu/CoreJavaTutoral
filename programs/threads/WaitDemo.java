class WaitDemo {
	public static void main(String[] args) throws Exception {	
		HelloThread ht = new HelloThread();

		//System.out.println("main thread");
		ht.start();
		
		synchronized(ht){		
			ht.wait();
			System.out.println("Main got notification");
			System.out.println(ht.getTotal());
		}
	}
}

class HelloThread extends Thread {
	HelloThread(){
	}
	private int total;
	
	public void run() {
		for(int i = 50; i<60; i++){
			total = total + i;
		}
		
		synchronized(this){
			System.out.println("Notify to main");
			
			try{
			this.wait();
			}catch(Exception e){
			}
			
		}
		
	}
	
	public int getTotal(){
		return this.total;
	}
}
