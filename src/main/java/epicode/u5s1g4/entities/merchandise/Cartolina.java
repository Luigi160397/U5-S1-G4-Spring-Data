package epicode.u5s1g4.entities.merchandise;

public class Cartolina extends Gadget {

	public Cartolina(String cartolina) {
		super(cartolina);
		setName("cartolina");
		setPrice(2.00);
	}

	@Override
	public String toString() {
		return getName() + ", " + "prezzo: " + getPrice() + "€";
	}

}
