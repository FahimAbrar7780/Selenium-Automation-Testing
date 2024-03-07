import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 
				//Initialization
				//System.setProperty("webdriver.gecko.gecko", "A:\\gecko\\geckodriver");
				
				ChromeDriver driver=new ChromeDriver();
				//FirefoxDriver driver=new FirefoxDriver();
				driver.get("https://www.saucedemo.com/");
				driver.manage().window();
				
				//Text Area
				
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
				
				//Absolute Path
				driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();
				//Check Out
				
				driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
				
				driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
				
				//user details
				driver.findElement(By.id("first-name")).sendKeys("Fahim");
				driver.findElement(By.id("last-name")).sendKeys("Abrar");
				driver.findElement(By.id("postal-code")).sendKeys("786");
				driver.findElement(By.id("continue")).click();
				
				

	}

}
