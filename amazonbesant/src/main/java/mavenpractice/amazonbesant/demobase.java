package mavenpractice.amazonbesant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class demobase {
	public static WebDriver driver ;
	
	

	public static  void launch(String url) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
	

	}
	
	public static void Username(String path, String element) {
		driver.findElement(By.id(path)).sendKeys(element);
		
	}
	public static void click(String path) {
		 driver.findElement(By.name(path)).click();
	
		
	} 
	
	

	
		                                     
	}


