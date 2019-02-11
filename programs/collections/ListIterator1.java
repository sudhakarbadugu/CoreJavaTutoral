import java .util.*;
		class ListIterator1{
			public static void main(String[] args){
				ArrayList n=new ArrayList(5);
				n.add("vasu");
				n.add("surya");
				n.add("ravi");
				n.add("vikram");
				System.out.println(n);
				System.out.println("before:"+n);
				ListIterator b=n.listIterator();
				while(b.hasNext()){
					Object l=b.next();
					if("surya".equals(l)){
						b.set("vikarnth");
					}
					if("vikram".equals(l)){
						b.add("frnd");
					}
					if("ravi".equals(l)){
						b.remove();
					}
				}
				System.out.println("after:"+n);
			}
		}