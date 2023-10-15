package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout {
	
	WebDriver dr;
	 
	 @FindBy(xpath = "Xpath of Quantity Element") WebElement quantityElement;  
	 @FindBy(xpath = "Xpath of Price Element") WebElement priceElement;  
	 
	 public Checkout(WebDriver x) {
		 dr = x; 
		 PageFactory.initElements(dr, this);
		// Footer f = new Footer(x); 
		 
	 }

	public void verifyIncreaseQuantityAndPrice() {
		int index = 0;
		int increaseQuantity = 1;
		Select s = new Select(quantityElement);
		s.selectByIndex(index);
		int defaultprice = Integer.parseInt(priceElement.getText());
		s.selectByIndex(index + increaseQuantity);
		int changedprice = Integer.parseInt(priceElement.getText());
		if (defaultprice * (increaseQuantity + 1)== changedprice );
		System.out.println("Price Changed");
		
	}
	
	public void verifyDecreaseQuantityAndPrice() {
		int index = 9;
		int decreaseQuantity = 3;
		Select s = new Select(quantityElement);
		s.selectByIndex(index);
		int defaultprice = Integer.parseInt(priceElement.getText());
		s.selectByIndex(index - decreaseQuantity);
		int changedprice = Integer.parseInt(priceElement.getText());
		
		double result = (decreaseQuantity + 1) / (index + 1);
		if (defaultprice * result == changedprice);
		System.out.println("Price Changed");
		
	}
}
