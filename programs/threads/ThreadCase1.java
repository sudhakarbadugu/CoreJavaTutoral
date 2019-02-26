class ThreadCase1{
			public static void main(String[] args){
				HaiThread t=new HaiThread();
				t.run();
				for(int i=0;i<5;i++){
					System.out.println(i);
				}
			}
}
class HaiThread extends Thread{
	public void run(){
		Thread j = Thread.currentThread();
		System.out.println("hello");
		System.out.println("Name:"+getName());
		for(int i=3;i<=8;i++){
			System.out.println(i);
		}
	}
}