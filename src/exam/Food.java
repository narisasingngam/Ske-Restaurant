package exam;

public class Food {

	String name ;
	int price ;
	int quantity = 0;
	
	public Food(String string, int i) {//constructor
		this.name = string;
		this.price = i;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void addQuantity(int add){
		quantity += add;
	}
	
}
