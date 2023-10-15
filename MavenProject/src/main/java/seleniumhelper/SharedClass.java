package seleniumhelper;

import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SharedClass {

	public static void HoverOver(WebElement element) {
		
	}

	public static void clickOnElement(WebElement allShirtSubMenu) {
			
	}
	
	public static void verifyDiscountPrice(WebElement ogPriceEle, WebElement discountPriceELe, Float offPercentage) {
		
		String og = ogPriceEle.getText();
		double ogp = Double.parseDouble(og);
		
		String dp = discountPriceELe.getText();
		double dpp = Double.parseDouble(dp);
		
		double d = ogp * offPercentage;
		if (ogp == dpp + d) {
			System.out.println("Price Match");
		}
	}
}
