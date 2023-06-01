package epicode.u5s1g4.entities.pizzas;

import jakarta.persistence.Entity;

@Entity
public class PizzaXL extends Pizza {

	String ingredientsList;

	public PizzaXL() {
		this.name = "Margherita XL";
		this.calories = 2208;
		this.price = 10.00;
		this.ingredientsList = "Pomodoro, mozzarella";
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
