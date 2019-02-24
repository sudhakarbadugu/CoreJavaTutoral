class SynchorizationDemo {
	public static void main(String[] args){	
		PrintText p = new PrintText();
		HelloThread ht = new HelloThread(p);

		//System.out.println("main thread");
		ht.start();
		
		for(int i = 50; i<60; i++){
			p.printName("Chiru");
		}
	}
}

class HelloThread extends Thread {
	private PrintText p;
	
	HelloThread(PrintText p){
		this.p = p;
	}
	
	public void run(){
		//System.out.println("Child thread");
		// PrintText p11= new PrintText();
		for(int i = 50; i<60; i++){
			p.printName("Balaiah");
		}
	}
}

class PrintText {

	public void printName(String name){
		
		synchronized(this){
			System.out.print("hello:.........");
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){
			}
			System.out.println(name);
		}
	}
}