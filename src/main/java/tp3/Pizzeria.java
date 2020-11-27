package tp3;
public abstract class Pizzeria {
	protected Pizza createPizza (String type) {
		
		Pizza pizza = PizzaFactory.create(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.wrap();
		return pizza;
		  }
	
	public Pizzeria (PizzaFactory pizzaFactory) {
	
	}
	
	public Pizza orderPizza(String type) {
		return createPizza(type);
	
	}
	
}


