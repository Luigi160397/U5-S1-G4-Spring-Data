package epicode.u5s1g4.entities.drinks;

import java.util.UUID;

import jakarta.persistence.Entity;

@Entity
public class Coke extends Drink {
	public Coke(UUID id, double size) {
		super(id, size);

		this.calories = 300;
		this.name = "Coca cola";
		this.price = 3.00;
	}
}
