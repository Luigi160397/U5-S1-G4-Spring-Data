package epicode.u5s1g4.entities.drinks;

import java.util.UUID;

import epicode.u5s1g4.entities.Consummation;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "drinks")
@AllArgsConstructor
@Getter
@Setter
public class Drink extends Consummation {
	@Id
	@GeneratedValue
	protected UUID id;
	double size;

	public String toString() {
		return this.getName() + " " + this.getSize() + ", prezzo: " + this.getPrice() + "€, calorie:"
				+ this.getCalories();
	}
}
