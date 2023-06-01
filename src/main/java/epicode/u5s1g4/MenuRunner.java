package epicode.u5s1g4;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import epicode.u5s1g4.dao.PizzeService;
import epicode.u5s1g4.entities.pizzas.Pizza;
import epicode.u5s1g4.exceptions.ItemNotFoundException;

@Component
public class MenuRunner implements CommandLineRunner {
	@Autowired
	PizzeService pizzaService;

	@Override
	public void run(String... args) throws Exception {
//		Pizza pizza1 = new Pizza();
//		pizzaService.save(pizza1);

		try {
			Pizza pizzaTrovata = pizzaService.findById(UUID.fromString("d23ebbc3-48ac-461c-a070-9ef9ca6ab7fd"));
			System.out.println(pizzaTrovata);

		} catch (ItemNotFoundException e) {
			System.out.println(e);
		}

	}

}
