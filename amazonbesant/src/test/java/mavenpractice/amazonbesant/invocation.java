package mavenpractice.amazonbesant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocation {
	WebDriver driver = new ChromeDriver();
	@ Test(invocationCount=5 ,threadPoolSize=2,invocationTimeOut=2000)
	public void chromelaunch() {
		System.setProperty("WebDriver.chrome.driver", "E:\\New Folder\\chromedriver.exe");
		driver.get("https://www.google.com");
		
	}
	@ Test 
	public void openbrowser() {
		System.setProperty("WebDriver.chrome.driver", "E:\\New Folder\\chromedriver.exe");
		driver.get("https://www.amazon.com");
		
	}
	
}

