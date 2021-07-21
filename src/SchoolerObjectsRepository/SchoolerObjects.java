package SchoolerObjectsRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.This;

public class SchoolerObjects {
	
	WebDriver driver;
	
	public SchoolerObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//New User Registration
	By WhatsYourName = By.xpath("//input[@type='text']");
	
	By SecureWithaPassword = By.xpath("//input[@name='password']");
	
	By ConfirmYourPassword = By.xpath("//input[@name='password2']");
	
	By IAgreeCheckbox = By.xpath("//span[@class='checkbox']");
	
	By GetStartedButton = By.xpath("//button[@type='submit']");
	
	//OBJECTS: Title page Validations of Dashboard (Student, Teacher & Institute)
	By LoginButton = By.xpath("//a[@class='btn btn--primary btn-header hvr-bounce-to-left']");
	
	By MailBar = By.xpath("//input[@id='form_name1']");
	
	By PasswordBar = By.xpath("//input[@id='form_name2']");
	
	By SignInButton = By.xpath("//button[@id='signinbtn']");
	
	By SchoolerTemplate = By.xpath("(//a[@href='schooler-role-selection']) [1]");
	
	By UserProfile = By.xpath("//div[@id='quickdiv']");
	
	By AccountsButton = By.xpath("//a[@id='prfbtn']"); //Students 
	
	//By SettingsButton = By.xpath("(//a[@id='kt_quick_user_toggle']) [1]"); //settings button was there the same code of accounts button. Now code changed
	
	By TeachersAccountButton = By.xpath("//a[@id='btn2']");
	
	By StudentTeacherLogout = By.xpath("(//a[@href='https://kgtopg.com/user-home']) [3]"); //for Student & Teacher
	
	By STLogout = By.xpath("//div[@class='list list-hover']/div[5]");
	
	By ILogout = By.xpath("//div[@class='list list-hover']/div[6]");
	
	By YesLogout = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	
	By InstituteLogout = By.xpath("(//a[@href='https://kgtopg.com/user-home']) [1]");
	
	
	//OBJECTS: Broadcast Functionality (Institute to Staff & Student)
	By InstituteMessages = By.xpath("//a[@href='broadcast-inbox-messages']");
	
	By InstituteCompose = By.xpath("//a[@class='btn btn-block btn-success font-weight-bold text-uppercase py-4 px-6 text-center']");
	
	By InstituteCompose2 = By.xpath("//a[@class='btn btn-block btn-primary font-weight-bold text-uppercase py-4 px-6 text-center']");
	
	By InstituteBroadcast = By.xpath("(//label[@class='checkbox']) [2]"); // Messages for multiple 
	
	By InstituteSubjectBar = By.xpath("//input[@id='broad_title']");
	
	By InstituteTypeMessage = By.xpath("//input[@id='broad_mesg']");
	
	By InstituteSend = By.xpath("(//button[@onclick='draftFunction()']) [1]");
	
	//OBJECTS: Broadcast Functionality (Staff to Institute & Students)
	By StaffMessages = By.xpath("//a[@href='teacher-broadcast-inbox-messages']");
	
	By StaffCompose = By.xpath("//a[@class='btn btn-block btn-success font-weight-bold text-uppercase py-4 px-6 text-center']");
	
	By StaffCompose2 = By.xpath("//a[@class='btn btn-block btn-primary font-weight-bold text-uppercase py-4 px-6 text-center']");
	
	By StaffIndividualMessage = By.xpath("(//label[@class='checkbox']) [1]");
	
	By StaffAutoCompleteMail = By.xpath("//div[@id='searchTextautocomplete-list']");
	
	By StaffMultipleMessage = By.xpath("(//label[@class='checkbox']) [2]");
	
	By StaffToEnterMail = By.xpath("//input[@id='searchText']");
	
	By StaffSubjectBar = By.xpath("//input[@id='broad_title']");
	
	By StaffTypeMessage = By.xpath("//input[@id='broad_mesg']");
	
	By StaffSend = By.xpath("(//button[@onclick='draftFunction()']) [1]");
	
	//Institute_Student Management_Add Student
	
	By SideBarButton = By.xpath("//button[@id='kt_aside_toggle']");
	
	By InstituteSettingsDropdown = By.xpath("(//li[@class='menu-item menu-item-submenu']/a) [2]");
	
	By InstituteSettinsPage = By.xpath("//a[@href='institute-profile']");
	
	By StudentManagement = By.xpath("//a[@href='student-management']");
	
	By AddNewStudent = By.xpath("//a[@class='btn btn-success btn-sm']");
	
	By EnterStudentName = By.xpath("//input[@name='stuname']");
	
	By EnterStudentEmail = By.xpath("(//input[@name='cemail']) [1]");
	
	By EnterParentMail = By.xpath("(//input[@name='pemail']) [1]");
	
	By EnterParentNo = By.xpath("(//input[@name='phone']) [1]");
	
	By StudentRollNo = By.xpath("(//input[@name='rollno']) [1]");
	
	By StudentAdmissionNo = By.xpath("(//input[@name='admsno']) [1]");
	
	By AddStudentConfirmButton = By.xpath("//button[@id='submitBtn']");
	
	
	//Teacher Applying for the leave Single & Multiple day 
	By MyLeaveApplication = By.xpath("(//a[@href='teacher-leave-application']) [5]");
	
	By ApplyforaLeave = By.cssSelector("a.btn.btn-success.btn-sm.mr-3.dpad-focusable");
	
	By EnterReason = By.xpath("//textarea[@name='reason']");
	
	By MultipleDay = By.xpath("//label[@class='radio ml-3']");
	
	By ChooseDate = By.xpath("(//input[@name='leavefrom'])");
	
	By ToDate = By.xpath("(//input[@name='leaveto'])");
	
	By ApplyButton = By.xpath("//button[@id='subbtn']");
	
	//TimeTable Setup
	By TimeTableIcon = By.xpath("//a[@href='view-timetable']");
	
	By SetTimeTableButton = By.xpath("//a[@href='create-timetable']");
	
	By MoreHorzIcon = By.xpath("//div[@class='dropdown dropdown-inline dropleft']/button");
	
	By CreateTiming = By.xpath("//div[@class='dropdown-menu show']/a[3]");
	
	By SaveTimingsButton = By.xpath("//input[@value='Save timings']");
	
	By AddPeriod = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	
	By AddPeriodSubmit = By.xpath("//button[@id='periodsubmitbtn']");
	
	//Exams Schedule
	By ExamScheduleTemplate = By.xpath("//a[@href='exam-management']");
	
	By ExamScheduleButton = By.cssSelector(".btn.btn-success.btn-sm.mr-3");
	
	By EnterAssignmentName = By.xpath("//input[@id='assgname']");
	
	By EnterAssignmentDate = By.xpath("(//input[@name='assgdate']) [2]");
	
	
	
	
	//Methods : New User Registration
	public WebElement WhatsYourNameSendKeys()
	{
		return driver.findElement(WhatsYourName);
	}
	
	public WebElement SecureWithaPasswordSendKeys()
	{
		return driver.findElement(SecureWithaPassword);
	}
	
	public WebElement ConfirmYourPasswordSendKeys()
	{
		return driver.findElement(ConfirmYourPassword);
	}
	
	public WebElement IAgreeCheckboxClick()
	{
		return driver.findElement(IAgreeCheckbox);
	}
	
	public WebElement GetStartedButtonClick()
	{
		return driver.findElement(GetStartedButton);
	}
	
	
	//Methods: Title page Validations of Dashboard (Student, Teacher & Institute)
	public WebElement LoginButtonClick()
	{
		return driver.findElement(LoginButton);
	}
	
	public WebElement Enteryourmail()
	{
		return driver.findElement(MailBar);
	}
	
	public WebElement Enteryourpassword()
	{
		return driver.findElement(PasswordBar);
	}
	
	public WebElement SignInButtonClick()
	{
		return driver.findElement(SignInButton);
	}
	
	public WebElement SchoolerTemplateClick()
	{
		return driver.findElement(SchoolerTemplate);
	}
	
	public WebElement UserProfileClick()
	{
		return driver.findElement(UserProfile);
	}
	
	public WebElement AccountsButtonClick()
	{
		return driver.findElement(AccountsButton);
	}
	
	/*public WebElement SettingsButtonClick()
	{
		return driver.findElement(SettingsButton);
	}*/  //settings button has been removed from teacher and replaced with Accounts button
	
	public WebElement TeachersAccountButtonClick()
	{
		return driver.findElement(TeachersAccountButton);
	}
	
	public WebElement StudentTeacherLogoutClick()
	{
		return driver.findElement(StudentTeacherLogout);
	}
	
	public WebElement STLogoutClick()
	{
		return driver.findElement(STLogout);
	}
	
	public WebElement ILogoutClick()
	{
		return driver.findElement(ILogout);
	}
	
	public WebElement YesLogoutClick()
	{
		return driver.findElement(YesLogout);
	}
	
	public WebElement InstituteLogoutClick()
	{
		return driver.findElement(InstituteLogout);
	}
	
	
	//METHODS: Broadcast Functionality (Institute to Staff & Student)
	public WebElement InstituteMessagesClick()
	{
		return driver.findElement(InstituteMessages);
	}
	
	public WebElement InstituteComposeClick()
	{
		return driver.findElement(InstituteCompose);
	}
	
	public WebElement InstituteBroadcastClick()
	{
		return driver.findElement(InstituteBroadcast);
	}
	
	public WebElement InstituteSubjectBarSendKeys()
	{
		return driver.findElement(InstituteSubjectBar);
	}
	
	public WebElement InstituteCompose2Click()
	{
		return driver.findElement(InstituteCompose2);
	}
	
	public WebElement InstituteTypeMessageSendKeys()
	{
		return driver.findElement(InstituteTypeMessage);
	}
	
	public WebElement InstituteSendClick()
	{
		return driver.findElement(InstituteSend);
	}
	
	//METHODS: Broadcast Functionality (Staff to Institute & Student)
	
	public WebElement StaffMessagesClick()
	{
		return driver.findElement(StaffMessages);
	}
	
	public WebElement StaffComposeClick()
	{
		return driver.findElement(StaffCompose);
	}
	
	public WebElement StaffCompose2Click()
	{
		return driver.findElement(StaffCompose2);
	}
	
	public WebElement StaffIndividualMessageClick()
	{
		return driver.findElement(StaffIndividualMessage);
	}
	
	public WebElement StaffAutoCompleteMailClick()
	{
		return driver.findElement(StaffAutoCompleteMail);
	}
	
	public WebElement StaffMultipleMessageClick()
	{
		return driver.findElement(StaffMultipleMessage);
	}
	
	public WebElement StaffToEnterMailSendKeys()
	{
		return driver.findElement(StaffToEnterMail);
	}
	
	public WebElement StaffSubjectBarSendkeys()
	{
		return driver.findElement(StaffSubjectBar);
	}
	
	public WebElement StaffTypeMessageSendKeys()
	{
		return driver.findElement(StaffTypeMessage);
	}
	
	public WebElement StaffSendClick()
	{
		return driver.findElement(StaffSend);
	}
	
	//Institute_Student Management_Add Student
	public WebElement SideBarButtonClick()
	{
		return driver.findElement(SideBarButton);
	}
	
	public WebElement InstituteSettingsDropdownClick()
	{
		return driver.findElement(InstituteSettingsDropdown);
	}
	
	public WebElement InstituteSettinsPageClick()
	{
		return driver.findElement(InstituteSettinsPage);
	}
	
	public WebElement StudentManagementClick()
	{
		return driver.findElement(StudentManagement);
	}
	
	public WebElement AddNewStudentButton()
	{
		return driver.findElement(AddNewStudent);
	}
	
	public WebElement EnterStudentNameSendKeys()
	{
		return driver.findElement(EnterStudentName);
	}
	
	public WebElement EnterStudentEmailSendKeys()
	{
		return driver.findElement(EnterStudentEmail);
	}
	
	public WebElement EnterParentMailSendKeys()
	{
		return driver.findElement(EnterParentMail);
	}
	
	public WebElement EnterParentNoSendKeys()
	{
		return driver.findElement(EnterParentNo);
	}
	
	public WebElement StudentRollNoSendKeys()
	{
		return driver.findElement(StudentRollNo);
	}
	
	public WebElement StudentAdmissionNoSendKeys()
	{
		return driver.findElement(StudentAdmissionNo);
	}
	
	public WebElement AddStudentConfirmButtonClick()
	{
		return driver.findElement(AddStudentConfirmButton);
	}
	
	//Methods for teacher applying for a leave (single & multiple days)
	public WebElement MyLeaveApplicationClick()
	{
		return driver.findElement(MyLeaveApplication);
	}
	
	public WebElement ApplyforaLeaveClick()
	{
		return driver.findElement(ApplyforaLeave);
	}
	
	public WebElement EnterReasonSendKeys()
	{
		return driver.findElement(EnterReason);
	}
	
	public WebElement MultipleDayClick()
	{
		return driver.findElement(MultipleDay);
	}
	
	public WebElement ChooseDateSendKeys()
	{
		return driver.findElement(ChooseDate);
	}
	
	public WebElement ToDateSendKeys()
	{
		return driver.findElement(ToDate);
	}
	
	public WebElement ApplyButtonClick()
	{
		return driver.findElement(ApplyButton);
	}
	
	// Institute TimeTable Setup
	public WebElement TimeTableIconClick()
	{
		return driver.findElement(TimeTableIcon);
	}
	
	public WebElement SetTimeTableButtonClick()
	{
		return driver.findElement(SetTimeTableButton);
	}
	
	public WebElement MoreHorzIconClick()
	{
		return driver.findElement(MoreHorzIcon);
	}
	
	public WebElement CreateTimingClick()
	{
		return driver.findElement(CreateTiming);
	}
	
	public WebElement SaveTimingsButtonClick()
	{
		return driver.findElement(SaveTimingsButton);
	}
	
	public WebElement AddPeriodClick()
	{
		return driver.findElement(AddPeriod);
	}
	
	public WebElement AddPeriodSubmitClick()
	{
		return driver.findElement(AddPeriodSubmit);
	}
	
	//ExamScheduleMethod
	
	public WebElement ExamScheduleTemplateClick()
	{
		return driver.findElement(ExamScheduleTemplate);
	}
	
	public WebElement ExamScheduleButtonClick()
	{
		return driver.findElement(ExamScheduleButton);
	}
	
	public WebElement EnterAssignmentNameSendKeys()
	{
		return driver.findElement(EnterAssignmentName);
	}
	
	public WebElement EnterAssignmentDateSendKeys()
	{
		return driver.findElement(EnterAssignmentDate);
	}
	

}
