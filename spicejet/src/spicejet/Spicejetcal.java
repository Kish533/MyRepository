package spicejet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejetcal {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		
		 WebElement month = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//tbody"));
		 List<WebElement> rightbox = month.findElements(By.tagName("td"));
		 for(WebElement dates:rightbox) {
			 System.out.println(dates.getText());
		 }
		 try {
		 for(int i=0;i<month.findElements(By.tagName("td")).size();i++) {
			 if(month.findElements(By.tagName("td")).get(i).getText().contains("23")) {
				 month.findElements(By.tagName("td")).get(i).click();
			 }}}
		 catch(StaleElementReferenceException e) {
				 
			 }
		
		 }
	}



