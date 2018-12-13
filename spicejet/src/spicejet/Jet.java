package spicejet;


	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class Jet {
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			//departure
			
	WebElement ele =driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']"));

	List<WebElement> link=ele.findElements(By.tagName("a"));
	Iterator<WebElement> its=link.iterator();
	while(its.hasNext()) {
		System.out.println(its.next().getText());
	}
		for(int i=0;i<ele.findElements(By.tagName("a")).size();i++) {
	 		
	 		if(ele.findElements(By.tagName("a")).get(i).getText().contains("Rajahmundry (RJA)")){
	 			ele.findElements(By.tagName("a")).get(i).click();
	 		}
		}
		
		System.out.println();
		
//arrival
		
	System.out.println("Arrival");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
	 	driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	 WebElement ele1 = driver.findElement(By.id("glsctl00_mainContent_ddl_destinationStation1_CTNR"));
	 List<WebElement> link1=ele1.findElements(By.tagName("a"));
	 Iterator<WebElement> its1=link1.iterator();
		while(its.hasNext()) {
			System.out.println(its.next().getText());
		}
	 for(int i1=0;i1<ele1.findElements(By.tagName("a")).size();i1++) {
	 		 		
if(ele1.findElements(By.tagName("a")).get(i1).getText().contains("Tirupati (TIR)")){
	ele1.findElements(By.tagName("a")).get(i1).click();
}
 }
//dates
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
	//passingers
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		WebElement adult =driver.findElement(By.id("divpaxinfo"));
		adult.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement plus = driver.findElement(By.id("hrefIncAdt"));
		plus.click();
		plus.click();
		WebElement childplus = driver.findElement(By.id("hrefIncChd"));
		childplus.click();
		WebElement ButtonDone = driver.findElement(By.id("btnclosepaxoption"));
		ButtonDone.click();
		
	
		WebElement search = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		search.click();	
		}}
	           
	
	
	
		


