package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumhelper.SharedClass;

public class WomenSuitsPage {
	WebDriver dr;
	
	public WomenSuitsPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this); //this means this Class
		
	}
	
	 @FindBy(xpath = "Xpath of First Product of Women Suit") WebElement firstWomenSuit; 
	
	public ProductDetailPage clickOnFirstProduct() {
		
		SharedClass.clickOnElement(firstWomenSuit);
		
		return new ProductDetailPage();
				
	}

}
