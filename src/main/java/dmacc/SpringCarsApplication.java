package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Cars;
import dmacc.beans.Owner;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.CarsRepository;

@SpringBootApplication
public class SpringCarsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCarsApplication.class, args);
		
		/*
		 * ApplicationContext appContext = new
		 * AnnotationConfigApplicationContext(BeanConfiguration.class);
		 * 
		 * Cars c = appContext.getBean("car", Cars.class);
		 * System.out.println(c.toString());
		 */
	}
	
	@Autowired
	CarsRepository repo;
	
	@Override
	public void run (String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// Using an existing bean
		Cars c = appContext.getBean("car", Cars.class);
		c.setMake("Honda");
		repo.save(c);
		
		// Creating a bean to use - not managed by Spring 
		
		Cars cx9 = new Cars("CX-9", "Mazda", "SUV", "2015");
		Owner james = new Owner("James Smith", "555-123-5566");
		cx9.setCarowner(james);
		repo.save(cx9);
		
		List<Cars> allMyCars = repo.findAll();
		for (Cars automobile: allMyCars) {
			System.out.println(automobile.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
