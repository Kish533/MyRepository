package spicejet;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {
	

	public static void main(String[] args) {
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.manage().deleteAllCookies();
		dri.get("https://www.spicejet.com");
		dri.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		/*Select depcity = new Select(dri.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		depcity.s*/
		//List<WebElement> lis = dri.findElements(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		/*int num = dri.findElements(By.className("ctl00_mainContent_ddl_originStation1_CTXT")).size();
		System.out.println(num);
				for(int i=0;i<num;i++) {
					System.out.println(i);
			
		}*/
		dri.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dri.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement ele = dri.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']"));
 		List<WebElement> list = ele.findElements(By.tagName("a"));
 		for(int i=0;i<ele.findElements(By.tagName("a")).size();i++) {
 		
 		if(ele.findElements(By.tagName("a")).get(i).getText().contains("Rajahmundry (RJA)")){
 			ele.findElements(By.tagName("a")).get(i).click();
 			
 		}	
}
}
	}

