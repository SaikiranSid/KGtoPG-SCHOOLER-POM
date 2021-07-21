package SchoolerTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import SchoolerObjectsRepository.SchoolerObjects;

public class LoginPageTitleValidations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		SchoolerObjects so = new SchoolerObjects(driver);
		
		// Title page Validations of Dashboard (Student, Teacher & Institute)
		
		driver.get("https://kgtopg.com");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		System.out.println("Page Titles:");
		System.out.println(driver.getTitle());
		
		so.LoginButtonClick().click();
		System.out.println(driver.getTitle());
		
		so.Enteryourmail().sendKeys("s1@gmail.com");
		so.Enteryourpassword().sendKeys("1234");
		so.SignInButtonClick().click();
		Thread.sleep(5000L);
		System.out.println(driver.getTitle());
		so.SchoolerTemplateClick().click();
		Thread.sleep(3000L);
		System.out.println(driver.getTitle());
		
		
		so.AccountsButtonClick().click();
		Thread.sleep(2000L);
		so.StudentTeacherLogoutClick().click();
		Thread.sleep(3000L);
		System.out.println(driver.getTitle());
		so.UserProfileClick().click();
		so.STLogoutClick().click();
		so.YesLogoutClick().click();
		Thread.sleep(4000L);
		System.out.println("Student LoggedOut Successfully");
		
		so.LoginButtonClick().click();
		System.out.println("Page Titles:");
		System.out.println(driver.getTitle());
		
		so.Enteryourmail().sendKeys("t1@gmail.com");
		so.Enteryourpassword().sendKeys("1234");
		so.SignInButtonClick().click();
		Thread.sleep(5000L);
		System.out.println(driver.getTitle());
		so.SchoolerTemplateClick().click();
		System.out.println(driver.getTitle());
		//so.SettingsButtonClick().click(); //settings button was there the same code of accounts button. Now code changed.
		so.TeachersAccountButtonClick().click();
		Thread.sleep(2000L);
		so.StudentTeacherLogoutClick().click();
		Thread.sleep(4000L);
		System.out.println(driver.getTitle());
		so.UserProfileClick().click();
		so.STLogoutClick().click();
		so.YesLogoutClick().click();
		Thread.sleep(4000L);
		System.out.println("Teacher LoggedOut Successfully");
		
		so.LoginButtonClick().click();
		System.out.println("Page Titles:");
		System.out.println(driver.getTitle());
		
		so.Enteryourmail().sendKeys("testinginstitute1@gmail.com");
		so.Enteryourpassword().sendKeys("1234");
		so.SignInButtonClick().click();
		System.out.println(driver.getTitle());
		so.SchoolerTemplateClick().click();
		System.out.println(driver.getTitle());
		so.InstituteLogoutClick().click();
		Thread.sleep(3000L);
		System.out.println("Page Title:");
		System.out.println(driver.getTitle());
		so.UserProfileClick().click();
		so.ILogoutClick().click();
		so.YesLogoutClick().click();
		Thread.sleep(4000L);
		System.out.println("Institute LoggedOut Successfully");

	}

}
