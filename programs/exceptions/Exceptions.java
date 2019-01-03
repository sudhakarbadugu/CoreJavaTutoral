class Exceptions{
	
	public static void main(String[] args){
	String language[]= {"c","c++","java","orcle"};
	
	try{
	for(int i=1;i<=4;i++){
	System.out.println(language[i]);
	}
   }
	catch(Exception e){
	System.out.println(e);
	}
	
	}
  }