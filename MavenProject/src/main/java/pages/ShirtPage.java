package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumhelper.SharedClass;

public class ShirtPage {
	
	WebDriver dr; 
	@FindBy(xpath = "Xpath of Shirt Sub Menu") WebElement allShirtSubMenu;  
	@FindBy(xpath = "Xpath of Shirt Sub Menu") WebElement allShirtSubMenu;
	@FindBy(xpath = "Xpath of Shirt Sub Menu") WebElement allShirtSubMenu;
	
	public ShirtPage(WebDriver x) {
		dr = x;
		 PageFactory.initElements(dr, this);
	}
	
	public ProductDetailPage clickOnFirstShirt() {
		SharedClass.clickOnElement(null);
		
		return new ProductDetailPage(); 
	}
	
	public void verifyDiscountShirtPrice() {
		
		SharedClass.verifyDiscountPrice(allShirtSubMenu, allShirtSubMenu, null);
	};

}
