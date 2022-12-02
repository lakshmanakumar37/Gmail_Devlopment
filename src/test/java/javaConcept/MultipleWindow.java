package javaConcept;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {
	
	WebDriver driver;
	@Test(enabled=false)
	public void openMultiWindow() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement input=driver.findElement(By.name("q"));
		input.sendKeys("selenium");
		input.sendKeys(Keys.ENTER);
		List<WebElement> seleniumaLinks=driver.findElements(By.tagName("a"));
		//seleniumaLinks.addAll(driver.findElements(By.tagName("img")));
		
		Iterator<WebElement> itr=seleniumaLinks.iterator();
		
		for(WebElement printLinks:seleniumaLinks) {
			
			System.out.println(printLinks.getText());
		}
		
		/*
		 * while(itr.hasNext()) {
		 * 
		 * System.out.println("THe lists"+itr.next()); }
		 */
		System.out.println(seleniumaLinks);
		
		//if()
		
		
	}
	@Test()
	public void googleSearchRightClick() {
		

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement input=driver.findElement(By.name("q"));
		input.sendKeys("selenium");
		input.sendKeys(Keys.ENTER);
		
		Actions act= new Actions(driver);
		WebElement link=driver.findElement(By.xpath("//a[text()='Selenium']"));
		act.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> setWindow=windows.iterator();
		
		setWindow.next();
		
		String tab=setWindow.next();
		driver.switchTo().window(tab);
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
