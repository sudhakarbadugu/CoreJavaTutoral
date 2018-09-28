class Movies{
   private String hero;
   private String heroin;
   private float payment;
   private int shootingdays;
   
   public Movies(String a,String b){
	   System.out.println("movies");
   }
   public String getHero(){
	   return hero;
   }
   public void setHero(String hero){
	   this.hero=hero;
   }
   public String getHeroin(){
	   return heroin;
   }
   public void setHeroin(String heroin){
	   this.heroin=heroin;
   }
   public float getPayment(){
	   return payment;
   }
   public void setPayment(float payment){
	   this.payment=payment;
   }
   public int getshootingDays(){
	  return shootingdays;
   }
   public void setshootingDays(int shootingDays){
	  this.shootingdays=shootingDays;
   }

   public static void main(String...w){
	   Movies g=new Movies("murali","venky");
	      g.setHero("allu");
		  g.setHeroin("kajal");
		  g.setPayment(59.8f);
		  g.setshootingDays(10);
		  Movies r=new Movies("ajay","siva");
		  r.setHero("pavan");
		  r.setHeroin("sam");
		  r.setPayment(53.74f);
		  r.setshootingDays(50);
	System.out.println(g.getHero());
    System.out.println(g.getHeroin());
    System.out.println(g.getPayment());
    System.out.println(g.getshootingDays());	
   }
}