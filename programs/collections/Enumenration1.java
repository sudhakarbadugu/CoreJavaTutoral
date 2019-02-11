import java.util.*;
	class Enumenration1{
				public static void main(String[] args){
				Vector v=new Vector(5);
				v.add("xerox");
				v.add("machine");
				v.add("employee");
				System.out.println(v);
				Enumeration  a=v.elements();
				while(a.hasMoreElements()){
					Object o=a.nextElement();
					System.out.println(o);
				}
				}
	}