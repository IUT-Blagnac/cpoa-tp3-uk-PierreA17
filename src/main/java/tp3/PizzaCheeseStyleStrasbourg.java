package tp3;
import java.util.ArrayList;

public class PizzaCheeseStyleStrasbourg extends Pizza{
	public PizzaCheeseStyleStrasbourg() {
		this.garnishes = new ArrayList<String>();
        this.garnishes.add("Mozarella");
        System.out.println("Preparation of Pizza Strasbourg style cheese");
	}
	
	public void cut() {
		System.out.println("Cut in square portions");
}
}
