package SchoolerTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import SchoolerObjectsRepository.SchoolerObjects;

public class TimeTableSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		
		SchoolerObjects so = new SchoolerObjects(driver);
		
		//TimeTable Setup
		
		driver.get("https://kgtopg.com");
		Thread.sleep(3000L);
		System.out.println("Page Title:");
		System.out.println(driver.getTitle());
		
		so.LoginButtonClick().click();
		System.out.println("Page Title:");
		System.out.println(driver.getTitle());
		
		so.Enteryourmail().sendKeys("titans@gmail.com");
		so.Enteryourpassword().sendKeys("1234");
		so.SignInButtonClick().click();
		Thread.sleep(5000L);
		System.out.println(driver.getTitle());
		
		so.SchoolerTemplateClick().click();
		Thread.sleep(7000L);
		System.out.println(driver.getTitle());
		
		so.TimeTableIconClick().click();
		Thread.sleep(3000L);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='swal2-actions']/button [1]")).click(); // ok button (telling no time created)
		Thread.sleep(1000L);
		so.SetTimeTableButtonClick().click();
		
		
		//Selecting classroom from the dropdown to set timing.
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='classroomid']")));
		s.selectByVisibleText("10 A");
		
		Thread.sleep(3000L);
		so.MoreHorzIconClick().click();
		Thread.sleep(10000L);
		so.CreateTimingClick().click();
		Thread.sleep(10000L);
		
		int i=1;
		
		while(i<=4)
		{
			driver.findElement(By.xpath("//div[@class='m-10']/span[2]")).click();
			i++;
			
		}
		//1st period
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [1]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [1]")).sendKeys("04:00 PM");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [1]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [1]")).sendKeys("05:00 PM");
		Thread.sleep(1000L);
		
		//2nd period
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [2]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [2]")).sendKeys("05:00 PM");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [2]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [2]")).sendKeys("06:00 PM");
		Thread.sleep(1000L);
		
		//3rd period
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [3]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [3]")).sendKeys("06:00 PM");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [3]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [3]")).sendKeys("07:00 PM");
		Thread.sleep(1000L);
		
		//4th Period
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [4]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [4]")).sendKeys("07:00 PM");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [4]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [4]")).sendKeys("08:00 PM");
		Thread.sleep(1000L);
		
		//5th Period
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [5]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[2]) [5]")).sendKeys("08:00 PM");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [5]")).clear();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("(//ul[@id='timingop']//input[3]) [5]")).sendKeys("09:00 PM");
		Thread.sleep(1000L);
		
		so.SaveTimingsButtonClick().click(); //SaveTimingsButton.
		
		System.out.println(driver.findElement(By.xpath("//div[@id='msgdiv']")).getText());
		
		Thread.sleep(3000L);
		
		//Adding 1st staff subjects to 1st period created time..
		so.MoreHorzIconClick().click();
		so.AddPeriodClick().click();
		Thread.sleep(1000L);
		
		Select st = new Select(driver.findElement(By.xpath("//select[@name='staff-subject']")));
		st.selectByIndex(1);
		
		//selecting duplication of timetable for next week
		Select set = new Select(driver.findElement(By.xpath("//select[@id='setupop']")));
		set.selectByIndex(1);
		
		//Selecting created time. (1st period) Teacher-1 to period 1
		Select day1 = new Select(driver.findElement(By.xpath("(//select[@id='timeShow']) [1]")));
		day1.selectByIndex(1);
		System.out.println(driver.findElement(By.xpath("//div[@id='msgdiv']")).getText());
		Thread.sleep(1000L);
		
		Select day2 = new Select(driver.findElement(By.xpath("(//select[@id='timeShow']) [2]")));
		day2.selectByIndex(1);
		System.out.println(driver.findElement(By.xpath("//div[@id='msgdiv']")).getText());
		Thread.sleep(1000L);
		
		Select day3 = new Select(driver.findElement(By.xpath("(//select[@id='timeShow']) [3]")));
		day3.selectByIndex(1);
		System.out.println(driver.findElement(By.xpath("//div[@id='msgdiv']")).getText());
		Thread.sleep(1000L);
		
		Select day4 = new Select(driver.findElement(By.xpath("(//select[@id='timeShow']) [4]")));
		day4.selectByIndex(1);
		System.out.println(driver.findElement(By.xpath("//div[@id='msgdiv']")).getText());
		Thread.sleep(1000L);
		
		Select day5 = new Select(driver.findElement(By.xpath("(//select[@id='timeShow']) [5]")));
		day5.selectByIndex(1);
		System.out.println(driver.findElement(By.xpath("//div[@id='msgdiv']")).getText());
		Thread.sleep(1000L);
		
		Select day6 = new Select(driver.findElement(By.xpath("(//select[@id='timeShow']) [6]")));
		day6.selectByIndex(1);
		Thread.sleep(1000L);
		so.AddPeriodSubmitClick().click();
		System.out.println(driver.findElement(By.xpath("//div[@id='msgdiv']")).getText());
		
	}

}
