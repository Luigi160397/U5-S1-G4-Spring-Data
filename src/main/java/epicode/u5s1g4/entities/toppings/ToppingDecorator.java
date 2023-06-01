package epicode.u5s1g4.entities.toppings;

import java.util.UUID;

import epicode.u5s1g4.entities.Consummation;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "toppings")
public class ToppingDecorator extends Consummation {
	@Id
	@GeneratedValue
	private UUID id;
	@Transient
	Consummation decoratedPizza;

	public ToppingDecorator() {
		getId();
	}

	public ToppingDecorator(Consummation c) {
		getId();
		this.decoratedPizza = c;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return this.decoratedPizza.getName() + " più " + this.name;
	}

	public long getCalories() {
		return this.decoratedPizza.getCalories() + this.calories;
	}

	public double getPrice() {
		return this.decoratedPizza.getPrice() + this.price;
	}

	public String toString() {
		return this.getName() + ", prezzo: " + this.getPrice() + "€, calorie:" + this.getCalories();
	}

	public String toMenu() {
		return this.name + ", prezzo: " + this.price + "€, calorie:" + this.calories;
	}

}
