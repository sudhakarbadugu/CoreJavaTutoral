class Movie {
	private String hero;
	private String heroin;
	
	public Movie(String a, String b){
		System.out.println("Movie constructor");
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
		m.setHero("Prabhas");
		m.setHeroin("Tam");

		Movie m1 = new Movie("Sudhakar2", "Suma3");
		m1.setHero("Mahesh");
		m1.setHeroin("Anu");
		
		Movie m2 = new Movie("Sudhakar1", "Suma2");
		
		System.out.println(m.getHero());
		System.out.println(m.getHeroin());
	}
}