import java.util.*;
		class TreeSet2{
				public static void main (String...a){
					TreeSet l=new TreeSet();
					l.add("K");
					l.add("b");
					l.add("j");
					l.add("a");
					l.add("A");
					System.out.println(l);
					Object c=l.clone();
					System.out.println(c);
					System.out.println(l.first());
					System.out.println(l.pollFirst());
					System.out.println(l.pollLast());
					System.out.println(l.higher("b"));
					System.out.println(l.ceiling("a"));
					System.out.println(l.contains("murali"));
					boolean r=l.remove("K");
					System.out.println(r);
					System.out.println(l);
					int d=l.size();
					System.out.println(d);
					TreeSet k=new TreeSet();
					k.add(-89);
					k.add(76);
					k.add(-32);
					k.add(4);
					System.out.println(k);
				}
		}