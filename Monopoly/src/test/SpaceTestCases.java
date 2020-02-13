package test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Test;

import production.Property;

public class SpaceTestCases {
	
	Property property;
	
	@After
	public void tearDown(){
		property = null;
	}

	@Test
	public void testNotNullPropety() {
		property = new Property();
		assertNotNull(property);
	}
	@Test
	public void testCreateProperty1(){
		property = new Property();
		property.setColor(Color.GRAY);
		property.setCost(60);
		property.setName("Mediteranian Avenue");
		
		assertEquals(Color.GRAY, property.getColor());
		assertEquals(60,property.getCost());
		assertEquals("Mediteranian Avenue", property.getName());
	}
}
