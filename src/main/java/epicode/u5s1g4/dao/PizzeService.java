package epicode.u5s1g4.dao;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epicode.u5s1g4.entities.pizzas.Pizza;
import epicode.u5s1g4.exceptions.ItemNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PizzeService {
	@Autowired
	PizzaRepository pizzaRepo;

	public void save(Pizza p) {
		pizzaRepo.save(p);
		log.info("Pizza salvata!");
	}

	public Pizza findById(UUID id) throws ItemNotFoundException {

		return pizzaRepo.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
	}
}
