package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.audits.model.SharedArrayBufferIssueDetails;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import dev.failsafe.internal.util.Assert;
import seleniumhelper.SharedClass;

public class HomePage extends LoadableComponent<HomePage> {

	 WebDriver dr;
	 
	 @FindBy(xpath = "Xpath of Men Menu") WebElement menMenuBar;  
	 @FindBy(xpath = "Xpath of Shirt Sub Menu") WebElement allShirtSubMenu;  
	 @FindBy(xpath = "Xpath of Women Menu Bar") WebElement WomenMenuBar;
	 @FindBy(xpath = "Xpath of Shirt Sub Menu") WebElement WomenSuitSubMenu;
	 
	 public HomePage(WebDriver x) {
		 dr = x; 
		 PageFactory.initElements(dr, this);
		// Footer f = new Footer(x); 
		 
	 }
	 public void HoverOverOnMenMenu() {
		 
		 SharedClass.HoverOver(menMenuBar);
	 }
	 
	 public ShirtPage clickAllShirtSubMenu() {
		 
		 SharedClass.clickOnElement(allShirtSubMenu);
		 
		 return new ShirtPage(dr); 
	 }
	 
	 public void HoverOverOnWomenMenu() {
		 
		 SharedClass.HoverOver(WomenMenuBar);
	 }
	 
	 public WomenSuitsPage clickWomenSuitsSubMenu() {
		 
		 SharedClass.clickOnElement(WomenSuitSubMenu);
		 
		 return new WomenSuitsPage(dr);
	 }
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		dr.get("https://www.express.com/");
	}
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		if (dr.getCurrentUrl().equals("https://www.express.com/")) {
		
		Footer f = new Footer(dr);	
		}
		
	}
	
	/*
	**What is PageObjectModel?
	-->PageObjectModel is a design pattern which works page by page meaning it works against every page we will create, it will create a corresponding class. 
	
	**Why do we need PageObjectModel?
	-->Nowadays developers keep on changing UI (User Interface) or GUI very frequently. To maintain object and services properly, POM took place.
	
	**Benefits of using PageObjectModel?
	1. It makes it more readable for businesses - Following naming convention of variable/object methods and the way we design our test cases is easy to understand the flow of the test cases for non=technical people.
	2. Helps to avoid code duplication. Example: Shared Class. (When we work in POM Pattern, everyone will be responsible for particular page. However, when we design test cases, I can reuse all the services from all classes. 
	3. Well maintainable - When something goes wrong with any object instead of fixing it in every page where it is used, we can fix it in corresponding class which will reflect in every page. 
	4. In project level, we have used same driver throughout the entire project, and to store object using @Findby annotation and initialize the PageFactory/initElement Class. 
	*/
}
