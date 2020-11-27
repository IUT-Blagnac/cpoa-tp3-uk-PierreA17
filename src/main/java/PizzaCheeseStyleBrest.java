import java.util.ArrayList;

public class PizzaCheeseStyleBrest extends Pizza {
	
	public PizzaCheeseStyleBrest() {
		this.garnishes = new ArrayList<String>();
        this.garnishes.add("Parmigiano reggiano");
        System.out.println("Preparation of Pizza with Brest style sauce and cheese");
	}

}
