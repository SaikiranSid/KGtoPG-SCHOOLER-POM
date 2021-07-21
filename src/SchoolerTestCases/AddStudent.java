package SchoolerTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import SchoolerObjectsRepository.SchoolerObjects;

public class AddStudent {

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
		so.StudentManagementClick().click();
		Thread.sleep(3000L);
		System.out.println(driver.getTitle());
		so.AddNewStudentButton().click();
		
		//Selecting the class to add the student in particular class
		
		Select cls = new Select(driver.findElement(By.xpath("(//select[@name='classroomid']) [2]")));
		cls.selectByVisibleText("LKG B");
		
		so.EnterStudentNameSendKeys().sendKeys("Madhavrao");
		so.EnterStudentEmailSendKeys().sendKeys("urekarprasadMadhav@gmail.com");
		so.EnterParentMailSendKeys().sendKeys("kp11@gmail.com");
		so.EnterParentNoSendKeys().sendKeys("1234568890");
		so.StudentRollNoSendKeys().sendKeys("1");
		so.StudentAdmissionNoSendKeys().sendKeys("A109");
		so.AddStudentConfirmButtonClick().click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert-text']")).getText());
		
		

	}

}
