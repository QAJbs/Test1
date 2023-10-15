package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	
	WebDriver dr;
	 
	 @FindBy(xpath = "Xpath of Men Menu") WebElement menMenuBar;  
	 @FindBy(xpath = "Xpath of Shirt Sub Menu") WebElement allShirtSubMenu;  
	 @FindBy(xpath = "Xpath of Women Menu Bar") WebElement WomenMenuBar;
	 @FindBy(xpath = "Xpath of Shirt Sub Menu") WebElement WomenSuitSubMenu;
	 
	 public Footer(WebDriver x) {
		 dr = x; 
		 PageFactory.initElements(dr, this);
		 
	 }

}
