class Home{
 private int doors;
 private int windows;
  
  public int getDoors(){
	return doors;
  }
  
  public  void setDoors(int g){
	  doors=g;
  }
  
  public int getWindows(){
	  return windows;
  }
	
	public void setWindows(int a){
		windows=a;
	}
	
	
   public static void main(String...c){
	   Home g=new Home();
	    g.setDoors(6);
	   g.setWindows(4);
	   printvalues(g);
   }
   public static void printvalues(Home j){
	   System.out.println(j.getDoors());
	   System.out.println(j.getWindows());
   }

  
  }
