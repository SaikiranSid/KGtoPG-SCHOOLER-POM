package SchoolerTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import SchoolerObjectsRepository.SchoolerObjects;

public class StaffBroadcastFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		SchoolerObjects so = new SchoolerObjects(driver);
		
		// Messages : from Staff to Institute & Student.
		
		driver.get("https://kgtopg.com");
		Thread.sleep(3000L);
		driver.manage().window().maximize();
		System.out.println("Page Title:");
		System.out.println(driver.getTitle());
		
		so.LoginButtonClick().click();
		System.out.println("Page Title:");
		System.out.println(driver.getTitle());
		
		so.Enteryourmail().sendKeys("kanishk012@gmail.com");
		so.Enteryourpassword().sendKeys("1234");
		so.SignInButtonClick().click();
		Thread.sleep(9000L);
		System.out.println(driver.getTitle());
		
		so.StaffMessagesClick().click();
		Thread.sleep(2000L);
		System.out.println(driver.getTitle());
		so.StaffComposeClick().click();
		so.StaffToEnterMailSendKeys().sendKeys("oxford");
		so.StaffAutoCompleteMailClick().click();
		so.StaffSubjectBarSendkeys().sendKeys("GoodAfternoon Admin");
		so.StaffTypeMessageSendKeys().sendKeys("Please share the latest syllabus PDF. Thank You.");
		so.StaffSendClick().click();
		Thread.sleep(2000L);
		System.out.println(driver.getCurrentUrl());
		
		so.StaffCompose2Click().click();
		so.StaffMultipleMessageClick().click();
		
		//Selecting only students from the dropdown "select to"
		Select s = new Select(driver.findElement(By.xpath("//select[@id='selectText']")));
		s.selectByIndex(2);
		
		//Selecting Class 10 A from the dropdown "select class"
		Select c = new Select(driver.findElement(By.xpath("//select[@name='classroomid']")));
		c.selectByVisibleText("Class 10 A");
		so.StaffSubjectBarSendkeys().sendKeys("GoodAfternoon Students");
		so.StaffTypeMessageSendKeys().sendKeys("PDF of Latest syllabus for halfyearly exam will be shared soon. THank you.");
		so.StaffSendClick().click();
		System.out.println(driver.getCurrentUrl());

	}

}
