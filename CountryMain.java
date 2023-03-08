package com.countr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CountryMain 
{
public static void main(String[] args)
{
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configaration.xml");
	Country country = (Country) applicationContext.getBean("mycountry");
	
	System.out.println(country.getId());
	System.out.println(country.getName());
	System.out.println(country.getPm());
	System.out.println(country.getPopulation());
	System.out.println(country.getState());
}
}
