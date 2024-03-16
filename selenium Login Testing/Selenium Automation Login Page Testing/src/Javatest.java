import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Initialization
		//System.setProperty("webdriver.gecko.gecko", "A:\\gecko\\geckodriver");
		
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window();
		
		//LOGIN FUNCTION
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//title Check
		
				String ExpectedLink = "https://www.saucedemo.com/inventory.html";
				String ActualLink = driver.getCurrentUrl();
				
				//Right URL Check
				
				System.out.println(ActualLink);
				
				//Compare the right URL
				
				if(ExpectedLink.equals(ActualLink))
				{
					System.out.println("Login Success.");
				}
				else System.out.println("Something is Wrong ! Please Try Again");
	}

}
