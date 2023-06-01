package epicode.u5s1g4.entities.ordini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import epicode.u5s1g4.config.BeansConfiguration;
import epicode.u5s1g4.dao.DrinkService;
import epicode.u5s1g4.dao.PizzaService;
import epicode.u5s1g4.entities.BoscaiolaDecorator;
import epicode.u5s1g4.entities.CocaCola;
import epicode.u5s1g4.entities.ExtraPepeDecorator;
import epicode.u5s1g4.entities.Ferrarelle;
import epicode.u5s1g4.entities.HawaianaDecorator;
import epicode.u5s1g4.entities.MaxiPizzaDecorator;
import epicode.u5s1g4.entities.Pizza;

@Component
public class MenuRunner implements CommandLineRunner {
	@Value("${application.costoCoperto}")
	private double costoCoperto;
	@Autowired
	PizzaService menuService;
	@Autowired
	DrinkService drinkService;

	@Override
	public void run(String... args) throws Exception {
		menu(costoCoperto, menuService, drinkService);
	}

	public static void menu(double costoCoperto, PizzaService menuService, DrinkService drinkService) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		System.out.println();

		Pizza margherita = (Pizza) ctx.getBean("margherita");
		BoscaiolaDecorator boscaiola = (BoscaiolaDecorator) ctx.getBean("boscaiola");
		HawaianaDecorator hawaiana = (HawaianaDecorator) ctx.getBean("hawaiana");
		MaxiPizzaDecorator boscaiolaMaxi = (MaxiPizzaDecorator) ctx.getBean("boscaiolaMaxi");
		MaxiPizzaDecorator margheritaMaxi = (MaxiPizzaDecorator) ctx.getBean("margheritaMaxi");
		MaxiPizzaDecorator hawaianaMaxi = (MaxiPizzaDecorator) ctx.getBean("hawaianaMaxi");
		ExtraPepeDecorator boscaiolaPepata = new ExtraPepeDecorator(boscaiola);
		Ferrarelle ferrarelle = (Ferrarelle) ctx.getBean("ferrarelle");
		CocaCola coca = (CocaCola) ctx.getBean("coca");

		ctx.close();
	}
}
