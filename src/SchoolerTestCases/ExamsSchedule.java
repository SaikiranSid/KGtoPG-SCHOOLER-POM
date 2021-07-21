package SchoolerTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import SchoolerObjectsRepository.SchoolerObjects;

public class ExamsSchedule {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		SchoolerObjects so = new SchoolerObjects(driver);
		driver.get("https://kgtopg.com");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		System.out.println("Page Title:");
		System.out.println(driver.getTitle());
		so.LoginButtonClick().click();
		System.out.println(driver.getTitle());
		
		so.Enteryourmail().sendKeys("oxford@gmail.com");
		so.Enteryourpassword().sendKeys("1234");
		so.SignInButtonClick().click();
		Thread.sleep(5000L);
		System.out.println(driver.getTitle());
		so.SchoolerTemplateClick().click();
		Thread.sleep(5000L);
		System.out.println(driver.getTitle());
		
		so.SideBarButtonClick().click();
		Thread.sleep(1000L);
		so.InstituteSettingsDropdownClick().click();
		so.InstituteSettinsPageClick().click();
		Thread.sleep(3000L);
		System.out.println(driver.getTitle());
		

	}

}
