package tp3;

public class PizzaFactoryBrest extends PizzaFactory {
	
	private static PizzaFactoryBrest uniqueInstance ;
	
	private PizzaFactoryBrest() {
		
	}
	
	public static PizzaFactoryBrest getInstance() {
		return uniqueInstance;
	}
	
	public static Pizza create(String name) {
		Pizza pizza;
		if (name == "Cheese") {
			pizza = new PizzaCheeseStyleBrest();
		}else if (name == "Grecque") {
			pizza = new PizzaGrecqueStyleBrest();
		}else {
			pizza = new PizzaPoivronStyleBrest();
		}
			
		return pizza;
	}
}
