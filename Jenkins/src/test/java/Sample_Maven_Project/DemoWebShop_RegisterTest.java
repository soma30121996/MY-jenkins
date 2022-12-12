package Sample_Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop_RegisterTest {
	
	@Test
	public void TC02() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Somshekar");
		driver.findElement(By.name("LastName")).sendKeys("tsunami");
		driver.findElement(By.id("Email")).sendKeys("tsunami123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("tsunami569");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("tsunami569");
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}

}
