class Deamon1{
	public static void main(String[] args)throws Exception{
		LenovoThread k=new LenovoThread();
		  k.setDaemon(true);
		  System.out.println(k.isDaemon());
		k.start();
	}
}
class LenovoThread extends Thread{
	LenovoThread(){
	}
	public void run(){
		for(int k=0;k<5;k++){
			System.out.println(k);
		}
}
}