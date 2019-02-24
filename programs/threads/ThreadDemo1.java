class ThreadDemo1{
	public static void main(String...w){
	Thread currentThread=Thread.currentThread();
	System.out.println("hellojava:"+currentThread.getName());
	System.out.println("priority:"+currentThread.getPriority());
	 System.out.println("pri:"+currentThread.setPriority(9));
	CricketThread k=new CricketThread();
	k.start();
	}
}
	class CricketThread extends Thread{
		public void run(){
			System.out.println("java thread");
		System.out.println("pri:"+getPriority());
		System.out.println("priority:"+setPriority(9));

		}
	}