class ThreadCaseDemo {
	public static void main(String[] args){		
		//3 create object for our thread class
		HelloThread ht = new HelloThread();

		System.out.println("main thread");
		ht.start();
	}
	

}

//1 create class
class HelloThread extends Thread {
	public void run(){
		System.out.println("Child thread");
		
		for(int i = 1; i< 10; i++){
			
			System.out.println(i);
			
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){
			}
			
		}
	}
}