package epicode.u5s1g4.entities.toppings;

import epicode.u5s1g4.entities.Consummation;
import jakarta.persistence.Entity;

@Entity
public class SalameTopping extends ToppingDecorator {
	public SalameTopping() {
		super();
		this.name = "Salame";
		this.price = 2.50;
		this.calories = 300;
	}

	public SalameTopping(Consummation c) {
		super(c);
		this.name = "Salame";
		this.price = 2.50;
		this.calories = 300;
	}

}
