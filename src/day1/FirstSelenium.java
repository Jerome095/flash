package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSelenium {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenioum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		WebElement user1 = driver.findElement(By.xpath("//input [@type='email']"));
		user1.sendKeys("jerome220095@gmail.com");
		WebElement user2 = driver.findElement(By.xpath("//input[@name='pass']"));
		user2.sendKeys("jerome1995");
		WebElement user3 = driver.findElement(By.xpath("//input[@type='submit']"));
		user.click();
	
	}
	
	

}

