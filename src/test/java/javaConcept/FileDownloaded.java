package javaConcept;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloaded {
	
	WebDriver driver;
	@Test
	public void fileChecking() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.imacros.net/Automate/Downloads");
		driver.findElement(By.xpath("(//a[text()='Download']//self::a)[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		File f = new File("C:\\Users\\HP\\Downloads");
		
		File[] available=f.listFiles();
		
		for(File list : available) {
			
			if(list.getName().equals("Download(1).zip")) {
				System.out.println("This file downloaded");
				break;
			}
		}
		
	}

}
