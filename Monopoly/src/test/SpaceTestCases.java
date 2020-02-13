package test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Test;

import production.Go;
import production.IncomeTax;
import production.Player;
import production.Property;

public class SpaceTestCases {
	
	Property propertyTile;
	IncomeTax incomeTaxTile;
	Go goTile;
	Player player;
	
	@After
	public void tearDown(){
		propertyTile = null;
		incomeTaxTile = null;
		player = null;
	}

	@Test
	public void testNotNullPropety() {
		propertyTile = new Property();
		assertNotNull(propertyTile);
	}
	@Test
	public void testCreateProperty1(){
		propertyTile = new Property();
		propertyTile.setColor(Color.GRAY);
		propertyTile.setCost(60);
		propertyTile.setName("Mediteranian Avenue");	
		
		assertEquals(Color.GRAY, propertyTile.getColor());
		assertEquals(60,propertyTile.getCost());
		assertEquals("Mediteranian Avenue", propertyTile.getName());
	}
	@Test
	public void testLandOnIncomeTaxTile200(){
		incomeTaxTile = new IncomeTax();
		player = new Player();
		
		player.setMoney(600);
		incomeTaxTile.collectTheMonies(player);
		
		int expectedMoney = 400;
		int actualMoney = player.getMoney();
		
		assertEquals(expectedMoney, actualMoney);
	}
	
	@Test
	public void testLandOnIncomeTaxTile10(){
		incomeTaxTile = new IncomeTax();
		player = new Player();
		
		player.setMoney(600);
		incomeTaxTile.collectTheMonies(player);
		
		int expectedMoney = 540;
		int actualMoney = player.getMoney();
		
		assertEquals(expectedMoney, actualMoney);
	}
	
	@Test
	public void testGoTile(){
		goTile = new Go();
		player = new Player();
		
		player.setMoney(1000);
		goTile.giveBasicIncome(player);
		
		int expectedMoney = 1200;
		int actualMoney = player.getMoney();
		
		assertEquals(expectedMoney, actualMoney);
	}
}
