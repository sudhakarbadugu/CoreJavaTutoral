class AnonymousInnerClass1{
		public static void main(String[] args){
			System.out.println("Thread name"+Thread.currentThread().getName());
		Threadvalue a=new Threadvalue();

		Thread k=new Thread(a);
		k.setName(":child");
		k.start();
	   
	
				
		 Thread lk=new Thread(new Runnable(){
			public void run(){
			  System.out.println("Thread name"+Thread.currentThread().getName());
			  for(int j=0;j<7;j++){
			  System.out.println(j);
			}
			  System.out.println("values");
			}
		});
		
		 lk.setName("hello Thread");
		 lk.start();
		}
}
		 class Threadvalue implements Runnable{
	     public void run(){
		 System.out.println("values");
		 for(int i=0;i<7;i++){
		 System.out.println(i);
		}
		System.out.println("Thread name"+Thread.currentThread().getName());
		}
}
