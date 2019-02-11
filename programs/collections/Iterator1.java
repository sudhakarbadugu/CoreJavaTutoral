import java.util.*;
	class Iterator1{
					public static void main(String[] args){
					ArrayList f=new ArrayList();
					f.add("sujay");
					f.add("saleem");
					f.add("venu");
					System.out.println(f);
					Iterator g=f.iterator();
					boolean c=g.hasNext();
					System.out.println(c);
					while(g.hasNext()){
					Object l=g.next();
							if("sujay".equals(l)){
								g.remove();
							}
							System.out.println(g.next());
					}
					}
	}