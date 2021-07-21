package SchoolerTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import SchoolerObjectsRepository.SchoolerObjects;

public class BroadcastFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		SchoolerObjects so = new SchoolerObjects(driver);
		
		// Messages : from Institute to Staff & Student.
		
		driver.get("https://kgtopg.com");
		Thread.sleep(3000L);
		System.out.println("Page Title:");
		System.out.println(driver.getTitle());
		
		so.LoginButtonClick().click();
		System.out.println("Page Title:");
		System.out.println(driver.getTitle());
		
		so.Enteryourmail().sendKeys("oxford@gmail.com");
		so.Enteryourpassword().sendKeys("1234");
		so.SignInButtonClick().click();
		Thread.sleep(9000L);
		System.out.println(driver.getTitle());
		
		so.InstituteMessagesClick().click();
		Thread.sleep(2000L);
		System.out.println(driver.getTitle());
		so.InstituteComposeClick().click();
		so.InstituteBroadcastClick().click();
		
		//Selecting only staff from the dropdown "select to"
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='selectText']")));
		s.selectByIndex(3);
		
		//Selecting Class 10 A from the dropdown "select class"
		
		Select clas = new Select(driver.findElement(By.xpath("//select[@name='classroomid']")));
		clas.selectByVisibleText("Class 10 A");
		
		so.InstituteSubjectBarSendKeys().sendKeys("Good Evening Staff");
		so.InstituteTypeMessageSendKeys().sendKeys("Tomorrow online classes start at 11 AM. Thank You");
		so.InstituteSendClick().click();
		System.out.println("Broadcast message to Staff");
		System.out.println(driver.findElement(By.xpath("//div[@class='alert-text']")).getText());
		
		Thread.sleep(2000L);
		so.InstituteCompose2Click().click();
		so.InstituteBroadcastClick().click();
		
		//Selecting only students from the dropdown "select to"
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='selectText']")));
		s1.selectByIndex(2);
		
		//Selecting Class 10 A from the dropdown "select class"
		Select clas1 = new Select(driver.findElement(By.xpath("//select[@name='classroomid']")));
		clas1.selectByVisibleText("Class 10 A");
		
		so.InstituteSubjectBarSendKeys().sendKeys("Good Evening Students");
		so.InstituteTypeMessageSendKeys().sendKeys("Tomorrow online classes start at 11 AM. Thank You");
		so.InstituteSendClick().click();
		System.out.println("Broadcast message to Students");
		System.out.println(driver.findElement(By.xpath("//div[@class='alert-text']")).getText());
		
		
		

	}

}
