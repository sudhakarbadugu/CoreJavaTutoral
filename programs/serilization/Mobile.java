import java.io.Serializable;
	class Mobile implements Serializable{
			String name;
			int cost;
			String number;
			Mobile(String name,int cost,String number){
			this.name=name;
			this.cost=cost;
			this.number=number;
			}
			public void setName(String name){
				this.name=name;
			}
			public void setCost(int cost){
				this.cost=cost;
			}
			public void setNumber(String number){
				this.number=number;
			}
			public String getName(){
				return this.name;
			}
			public int getCost(){
				return this.cost;
			}
			public String getNumber(){
				return this.number;
			}
			}
