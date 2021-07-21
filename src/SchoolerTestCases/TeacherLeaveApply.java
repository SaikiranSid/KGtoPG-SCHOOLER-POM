package SchoolerTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import SchoolerObjectsRepository.SchoolerObjects;

public class TeacherLeaveApply {

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
		System.out.println("Page Titles:");
		System.out.println(driver.getTitle());
		
		so.LoginButtonClick().click();
		System.out.println(driver.getTitle());
		
		so.Enteryourmail().sendKeys("t4@gmail.com");
		so.Enteryourpassword().sendKeys("1234");
		so.SignInButtonClick().click();
		Thread.sleep(5000L);
		System.out.println(driver.getTitle());
		so.SchoolerTemplateClick().click();
		System.out.println(driver.getTitle());
		so.TeachersAccountButtonClick().click();
		Thread.sleep(1000L);
		so.MyLeaveApplicationClick().click(); 
		System.out.println(driver.getTitle());
		Thread.sleep(3000L);
		so.ApplyforaLeaveClick().click();
		
		Select l = new Select(driver.findElement(By.xpath("//select[@name='leavetype']")));
		l.selectByVisibleText("Sick Leave");
		
		so.EnterReasonSendKeys().sendKeys("Tomorrow is my friend's marriage. Kindly Grant the Permission");
		
		so.ChooseDateSendKeys().sendKeys("24-06-2021");
		so.ApplyButtonClick().click();
		System.out.println("Single Day Leave:");
		System.out.println(driver.findElement(By.xpath("//div[@class='alert-text']")).getText());
		Thread.sleep(7000L);
		
		// Multiple Days
		so.ApplyforaLeaveClick().click();
		Select ml = new Select(driver.findElement(By.xpath("//select[@name='leavetype']")));
		ml.selectByIndex(2);
		so.EnterReasonSendKeys().sendKeys("Own sister's Marriage");
		so.MultipleDayClick().click();
		so.ChooseDateSendKeys().sendKeys("20-06-2021");
		so.ToDateSendKeys().sendKeys("25-06-2021");
		so.ApplyButtonClick().click();
		System.out.println("Multiple Day:");
		System.out.println(driver.findElement(By.xpath("//div[@class='alert-text']")).getText());
		

	}

}
