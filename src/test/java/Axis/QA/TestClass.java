package Axis.QA;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.Test;
	 
	public class TestClass {
		WebDriver driver;
		@Test
		public void configLogin()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();		
			driver.get("http://tutorialsninja.com/demo/");	
			driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("shelkevaishnavi2320.com");
			driver.findElement(By.id("input-password")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		}
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
	}


