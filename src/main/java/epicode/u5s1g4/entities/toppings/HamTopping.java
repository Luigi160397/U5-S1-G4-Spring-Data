package epicode.u5s1g4.entities.toppings;

import epicode.u5s1g4.entities.Consummation;
import jakarta.persistence.Entity;

@Entity
public class HamTopping extends ToppingDecorator {
	public HamTopping() {
		super();
		this.name = "Prosciutto";
		this.price = 2.00;
		this.calories = 200;
	}

	public HamTopping(Consummation c) {
		super(c);
		this.name = "Prosciutto";
		this.price = 2.00;
		this.calories = 200;
	}
}
