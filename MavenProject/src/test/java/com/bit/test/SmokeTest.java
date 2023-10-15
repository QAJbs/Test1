package com.bit.test;

import org.junit.Test;

import pages.HomePage;
import pages.ShirtPage;
import pages.WomenSuitsPage;

public class SmokeTest extends BaseTest{

	HomePage hp;
	
	ShirtPage sp;
	
	WomenSuitsPage wsp;
	
	@Test
	public void buyAShirt() {
		
		hp = new HomePage(dr);
		hp.HoverOverOnMenMenu();
		sp = hp.clickAllShirtSubMenu(); 
		sp.clickOnFirstShirt();
	}
	
	@Test 
	public void buyAWomanSuits() {
		hp = new HomePage(dr);
		hp.HoverOverOnWomenMenu();
		wsp = hp.clickWomenSuitsSubMenu();
		wsp.clickOnFirstProduct();
	}
	
}
