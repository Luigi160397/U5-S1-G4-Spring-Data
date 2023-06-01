package epicode.u5s1g4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epicode.u5s1g4.entities.Drink;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DrinkService {
	@Autowired
	private DrinkRepository drinkRepo;

	public void save(Drink d) {
		drinkRepo.save(d);
		log.info("Prodotto salvato nel DB");
	}
}
