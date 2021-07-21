package SchoolerTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SchoolerObjectsRepository.SchoolerObjects;

public class NewRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//user 1
		driver.get("https://kgtopg.com/user-register?email=simha@gmail.com");
		driver.manage().window().maximize();
		SchoolerObjects so = new SchoolerObjects(driver);
		so.WhatsYourNameSendKeys().sendKeys("Narasimha");
		so.SecureWithaPasswordSendKeys().sendKeys("1234");
		so.ConfirmYourPasswordSendKeys().sendKeys("1234");
		so.IAgreeCheckboxClick().click();
		so.GetStartedButtonClick().click();
		Thread.sleep(7000L);
		so.SchoolerTemplateClick().click();
		
		

	}

}
