package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Cars;
import dmacc.beans.Owner;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Cars car() {
		Cars bean = new Cars("Toyota");
		//bean.setModel("Civic");
		//bean.setMake("Toyota");
		//bean.setType("Compact Sedan");
		//bean.setYear("2012");
		return bean;
	}
	
	@Bean
	public Owner owner() {
		Owner bean = new Owner("John Luke", "515-555-5555");
		return bean;
	}
}
