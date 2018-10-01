class BahubaliTeam{
   private String directorName;
   private String heroName;
   private int amount;
   private float rating;
   
   public BahubaliTeam(String directorName,String heroName,int amount,float rating){
	   this.directorName=directorName;
	   this.heroName=heroName;
      this.amount=amount;
	   this.rating=rating;
   }
   public void setDirectorName(String a){
	   directorName=a;
   }
   public String getDirectorName(){
	   return directorName;
   }
   public void setHeroName( String h){
	   heroName=h;
   }
   public String getHeroName(){
	   return heroName;
   }
   public void setAmount(int x){
	   amount=x;
   }
   public int getAmount(){
	   return amount;
   }
   public void setRating(float f){
	   rating=f;
   }
   public float getRating(){
	   return rating;
   }
   public String toString(){return directorName+"\n"+heroName+"\n "+amount+"\n"+rating;}

	public static void main(String...p){
		BahubaliTeam o=new BahubaliTeam("rajamouli","prabhas",9000,9.5f);
		o.setDirectorName("trivikram");
		o.setHeroName("pavan");
		o.setAmount(4000);
		o.setRating(7777);
		System.out.println(o);
		
	}
	public void init(){
		System.out.println("take rest");
	}
}