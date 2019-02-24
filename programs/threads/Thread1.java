class Thread1{
	public static void main(String args[]){
	Thread currentThread =Thread.currentThread();
	System.out.println("store: "+currentThread.getName());
	System.out.println("priority:"+currentThread.getPriority());
	// System.out.println("join:"+currentThread.getjoin());
	System.out.println("id:"+currentThread.getId());
	family l=new family();
	l.setName("rahul");
	l.start();
	l.setPriority(8);
	// l.setjoin();
	l.setId("98f547");
	}
}
class family extends Thread{
	public void run(){
	System.out.println("relation");


 System.out.println("Name:"+getName());
 System.out.println("priority:"+getPriority());
 // System.out.println("join:"+getjoin());
 System.out.println("id:"+getId());
	}
}

