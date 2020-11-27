import java.util.ArrayList;

public class PizzaPoivronStyleStrasbourg extends Pizza{
	public PizzaPoivronStyleStrasbourg() {
		this.garnishes = new ArrayList<String>();
        this.garnishes.add("Poivrons");
        System.out.println("Preparation of Pizza with Brest style sauce and cheese");
	}

}
