import java.util.concurrent.*;
	class PriorityBlockingQueue1{
			public static void main(String[] args){
			PriorityBlockingQueue ab=new PriorityBlockingQueue(3);
					ab.add("rahul");
					ab.add("vijaj");
					ab.add("dhoni");
					System.out.println(ab);
					System.out.println(ab.peek());
					System.out.println(ab.poll());
					
					
			}
}