class ThreadDemo {
	public static void main(String[] args){
		Thread currentThread = Thread.currentThread();
		System.out.println("Hi " + currentThread.getName());
		System.out.println("pri " + currentThread.getPriority());
		
		//3 create object for our thread class
		HelloThread ht = new HelloThread();
		ht.setName("Raj");
		ht.setPriority(7);//1-10
		//start the thread
		ht.start();
		
	}
	

}

//1 create class
class HelloThread extends Thread {
	
	//override 
	public void run(){
		Thread currentThread = Thread.currentThread();
		System.out.println("Hello thread" );
		System.out.println("Name:" + getName());
		System.out.println("getPriority:" + getPriority());
	}
}