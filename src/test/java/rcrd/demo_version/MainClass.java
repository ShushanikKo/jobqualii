import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainClass {

	public static final String USERNAME = "jobqualii";
	public static final String ACCESS_KEY = "f72bc9c7-b9bb-41c6-927d-a7db360259e2";
	public static final String URL = "https://" + ":" + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "example of test");
		// Create an instance of the driver
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

		// Navigate to a web page to test something
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Project start here");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());
		driver.quit();
		System.out.println("Test Completed Successfully");

	}
}