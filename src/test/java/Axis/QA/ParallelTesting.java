package Axis.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	
	
	public void InvokeCrome() {
		
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Documents\\manipal\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.selenium.dev/");
		}
	@Test
		public void InvokeEdge() {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Admin\\Documents\\manipal\\edgedriver_win64\\msedgedriver.exe");
			
			WebDriver driver = new EdgeDriver();
			
			driver.get("https://www.selenium.dev/");

		}
				
				
				
	}

