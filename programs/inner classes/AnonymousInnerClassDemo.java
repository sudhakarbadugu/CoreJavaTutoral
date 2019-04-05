class AnonymousInnerClassDemo {
	
	
	public static void main(String[] args){
		System.out.println("Thread name: " + Thread.currentThread().getName());
		//Regular way of creating thread.
		ThreadA t = new ThreadA();
		Thread th1 = new Thread(t);
		th1.start();
		
		//By usin anonymous inner classes.
		Thread th = new Thread(new Runnable(){
			public void run() {
				System.out.println("Thread name: " + Thread.currentThread().getName());
				for(int i=0; i<10; i++){
					System.out.println(i);
				}
				System.out.println("Task completed");
			}
		});
		th.setName("child");
		th.start();
	}

}

class ThreadA implements Runnable {

	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
		System.out.println("Task completed");
	}
}
