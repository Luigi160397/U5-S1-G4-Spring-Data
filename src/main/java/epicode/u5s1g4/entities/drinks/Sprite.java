package epicode.u5s1g4.entities.drinks;

import java.util.UUID;

public class Sprite extends Drink {
	public Sprite(UUID id, double size) {
		super(id, size);
		this.calories = 300;
		this.name = "Sprite";
		this.price = 3.00;
	}
}
