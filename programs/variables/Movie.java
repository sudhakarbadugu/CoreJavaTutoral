class Movie {
	private String hero;
	private String heroin;
	private int shootingDays;
		
	private static int movieCount;
	
	public Movie(String a, String heroin){
		System.out.println("Movie constructor");
		hero = a;
		this.heroin = heroin;
		
		//we can instance as well static.
		this.init();
	}
	
	public String getHero(){
		return hero;
	}
	public void setHero(String hero){
		this.hero = hero;
	}
	
	public String getHeroin(){
		return heroin;
	}
	
	public void setHeroin(String heroin){
		this.heroin = heroin;
	}
	
	public static void main(String args[]){
		Movie m = new Movie("Sudhakar", "Suma");
		
		m.setHero("Murali");
		m.setHeroin("Kajal");
		
		Movie m1 = new Movie("Sudhakar2", "Suma3");	
		
		Movie m2 = new Movie("Sudhakar1", "Suma2");
		
		Movie m3 = new Movie("Sudhakar1", "Suma2");
		
		System.out.println(m.toString());		
		System.out.println(m1.toString());		
		System.out.println(m2.toString());
	}
	
	public void init(){
		System.out.println("taking rest");
	}
	
	public String toString(){
		return this.hero + " "+ this.heroin + " "+ this.shootingDays;
	}
}