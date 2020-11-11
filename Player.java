
public class Player {

	String name;
	int position;
	int rating;
	int price;
	double fiyatPerf;
	public Player() {
		
	}
	
	public Player(String name, int position, int rating, int price,double fiyatPerf) {
		
		this.name = name;
		this.position = position;
		this.rating = rating;
		this.price = price;
		this.fiyatPerf = fiyatPerf;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", position=" + position + ", rating=" + rating + ", price=" + price + ", fiyatPerf=" + fiyatPerf + "]";
	}
	
	
	public void zaa() {
		System.out.println("19");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getFiyatPerf() {
		return fiyatPerf;
	}

	public void setFiyatPerf(double fiyatPerf) {
		this.fiyatPerf = fiyatPerf;
	}
	
	
	
}
