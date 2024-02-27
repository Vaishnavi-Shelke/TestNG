package Axis.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvokeEdge {
	
	@Test
	public void Invokeedge() {
	
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\Admin\\Documents\\manipal\\edgedriver_win64\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.selenium.dev/");

}
}
