class Movie {
	private String hero;
	private String heroin;
	private int shootingDays;
		
	private static int movieCount;
	
	public Movie(){
		this("gdsfgd","ssfsdfsd");
		System.out.println("Default constructor");
	}
	
	public Movie(String fgdfgdgsdfg, String heroin){
		//this();
		System.out.println("Movie param constructor");
		hero = fgdfgdgsdfg;
		this.heroin = heroin;
		
		//we can instance as well static.
		this.init();
	}
	
	public Movie(String a, int b){
		//this();
		System.out.println("Movie param with int constructor");
		hero = a;
		this.shootingDays = b;
		
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
		Movie m4 = new Movie();
		System.out.println("m4"+ m4);
		
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