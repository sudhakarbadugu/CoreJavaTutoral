import java.util.concurrent.*;
class PriorityBlockingQueueDemo {
	public static void main(String[] args){
		PriorityBlockingQueue ab = new PriorityBlockingQueue(100);
		ab.add("Sudha");
		ab.add("Sudhakar");
		ab.add("MLA");
		ab.add("CM");
		ab.add("A");
		//ab.add(null);
		
		System.out.println(ab.peek());
		System.out.println(ab);
		
		System.out.println(ab.poll());
		System.out.println(ab.poll());
		System.out.println(ab);
		
	}
 }