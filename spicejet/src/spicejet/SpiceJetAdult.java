package spicejet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetAdult {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.findElement(By.id("divpaxinfo")).click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	WebElement adult =driver.findElement(By.id("divAdult"));
	
	WebElement plus = driver.findElement(By.id("hrefIncAdt"));
	plus.click();
	plus.click();
	WebElement childplus = driver.findElement(By.id("hrefIncChd"));
	childplus.click();
	WebElement ButtonDone = driver.findElement(By.id("btnclosepaxoption"));
	ButtonDone.click();
	
	/*for(WebElement web:ele) {
	System.out.println(ele);
	}
	*/
	
	
	
	
}
}
