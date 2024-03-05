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
				driver.get("https://trytestingthis.netlify.app/");
				driver.manage().window();
				
				//Text Area
				
				driver.findElement(By.id("fname")).sendKeys("Fahi");
				driver.findElement(By.id("lname")).sendKeys("Abrar");
				
				//Radio Button
				
				WebElement Radio=driver.findElement(By.id("male"));
				Radio.click();
			   //Drop Down
				WebElement Option=driver.findElement(By.id("option"));
			    Select Testdrop= new Select(Option);
			    Testdrop.selectByIndex(2);
			    //Multiple
				WebElement OptionMulti=driver.findElement(By.id("owc"));
			    Select TestMulti= new Select(OptionMulti);
			    TestMulti.selectByIndex(1);
			    
			    WebElement OptionMulti2=driver.findElement(By.id("owc"));
			    Select TestMulti2= new Select(OptionMulti2);
			    TestMulti2.selectByIndex(3);
			    
			    //Applicable Option
			  WebElement radio=driver.findElement(By.name("option3"));
			    radio.click();

	}

}
