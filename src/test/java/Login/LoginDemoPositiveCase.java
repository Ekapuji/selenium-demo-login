package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoPositiveCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Open link
		driver.get("https://www.psegameshop.com/");
		
		//Login
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#masthead > div.header-inner.flex-row.container.logo-left.medium-logo-center > div.flex-col.hide-for-medium.flex-right > ul > li.account-item.has-icon > a")).click();
		Thread.sleep(500);
		driver.findElement(By.id("username")).sendKeys("ekapujirahayulestari@gmail.com");
		driver.findElement(By.id("password")).sendKeys("testingweb");
		driver.findElement(By.name("login")).click();
		
		//Shows error incorrect password
		Thread.sleep(500);
		String alertError = "Error: The password you entered for the email address ekapujirahayulestari@gmail.com is incorrect. Lost your password?";
		String getAlert = driver.findElement(By.cssSelector("#wrapper > ul > li > div")).getText();
		org.junit.Assert.assertEquals(getAlert, alertError);
		System.out.println(getAlert);
		System.out.println("Testing Success");

	}

}
