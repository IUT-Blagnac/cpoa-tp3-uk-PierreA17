
import java.util.ArrayList;

public abstract class Pizza {
	
	
	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList<String> garnishes;
	

	public void prepare() {
		System.out.println("Preparation of " + name);
		System.out.println("Spread the pizza dough...");
		System.out.println("Add the sauce...");
		System.out.println("Add the garnishes: ");
		
        
		for (int i = 0; i < garnishes.size(); i++) {
			System.out.println(" " + garnishes.get(i));
		}

	}

	public void bake() {
		System.out.println("Bake 25 minutes at 180°");
		
	}

	public void cut() {
		System.out.println("Cut the pizza in triangles");
		
	}

	public void wrap() {
		System.out.println("Put the pizza in the official box");
		
	}
	public String getName() {
		return name;
		
	}
}
