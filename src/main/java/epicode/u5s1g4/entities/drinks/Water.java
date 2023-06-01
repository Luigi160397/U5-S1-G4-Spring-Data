package epicode.u5s1g4.entities.drinks;

import java.util.UUID;

public class Water extends Drink {
	public Water(UUID id, double size) {
		super(id, size);
		this.calories = 70;
		this.name = "Acqua";
		this.price = 1.50;
	}
}