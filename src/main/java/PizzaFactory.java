

public abstract class PizzaFactory {
	public static Pizza create(String name) {
		
		Pizza pizza;
		
		if (name == "Cheese") {
			pizza = new PizzaCheeseStyleBrest();
		}else if (name == "Grecque") {
			pizza = new PizzaGrecqueStyleBrest();
		}else {
			pizza = new PizzaCheeseStyleBrest();
		}
		return pizza;
	}
}
