import java.util.*;
	class Frinds{
			
				int id;
				String name;;
				int salary;
				public ab(int id,String name,int salary){
					this.id=id;
					this.name=name;
					this.salary=salary;
					
				}
				}
				public class LinkedhashMap1{
					public static void main(String[] args){
						LinkedHashSet r=new LinkedHashSet();
						ab a=new Frinds(254,"father",980);
						ab a1=new Frinds(625,"mother",809);
						r.add(a);
						r.add(a1);
						for(Frinds d:r){
						System.out.println(d.id+""+d.name+""+d.salary);	
						
				
						}
					}
					
}
	