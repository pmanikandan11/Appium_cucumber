package functionLibrary;

import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.ios.IOSDriver;
import objectRepo.Flights_page;
import objectRepo.Hotels_page;


public class Main_methods implements Hotels_page,Flights_page{
	
	@SuppressWarnings("rawtypes")
	private static IOSDriver driver;
	public static String tempAppName;
	@SuppressWarnings("rawtypes")
	
	public static void Config(String AppName) throws Exception //Configuration-initializing driver and app
	{

	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("platformName", "iOS");
	caps.setCapability("platformVersion", "10.2"); 
	caps.setCapability("deviceName", "iPhone 7");
	caps.setCapability("app", Common_methods.getAppFilepath("/Apps/"+AppName+".app")); 
	setDriver(new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps));
	getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	tempAppName=AppName;
	
	}
	
	@SuppressWarnings("rawtypes")
	public static IOSDriver getDriver() {
		return driver;
	}
	@SuppressWarnings("rawtypes")
	public static void setDriver(IOSDriver driver) {
		Main_methods.driver = driver;
	}
	
	 public static void SetEnvironment() throws Exception //Setting environment to trunk/int
		{
//			click on allow button

			if(Common_methods.isAlertPresent(1)==true)
			getDriver().switchTo().alert().accept();
			
			if(Common_methods.isElementExists(accmenu)==true)
			
			Common_methods.webElement(accmenu).click();

			if(Common_methods.webElement(BookingServer).getText().contains("Debug"))
			{
				Common_methods.webElement(BookingServer).click();
			}
			else if(Common_methods.webElement(BookingServer_2).getText().contains("Debug"))
			{
				Common_methods.webElement(BookingServer_2).click();
			}
			
//			WebElement upperPt=Common_methods.webElement("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]");
//			WebElement lowerPt=Common_methods.webElement("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[9]/UIAStaticText[1]");
//			TouchAction act = new TouchAction(getDriver());
//			act.press(lowerPt ).moveTo(upperPt).release().perform();
//			getDriver().execute_script("mobile: scroll", {"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]": "", "toVisible": True});
			String targetCell = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[11]/XCUIElementTypeStaticText[1]";
			RemoteWebElement cellWithText = (RemoteWebElement)getDriver().findElement(By.xpath(targetCell));
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("element", cellWithText.getId());
			scrollObject.put("toVisible", "true");
			getDriver().executeScript("mobile: scroll", scrollObject);
			
			
			Common_methods.clickElement(chooseServer);
			
			String envi=Common_methods.GetEnv();
			System.out.println("envi "+envi);
			if(envi.contentEquals("trunk"))
			{
				if(Common_methods.containsText(trunk,"Trunk")==true)
			Common_methods.clickElement(trunk);
			}
			else if(envi.contentEquals("integration"))
			{
				if(Common_methods.containsText(integration,"Integration")==true)
					Common_methods.clickElement(integration);
			}
			Common_methods.webElement(serverBackBtn).click();
		
		}
	
	
	public static void Login( String Uname,String passwd) throws Exception //logging into app with respective creds
	{
		
		Common_methods.clickElement(shop_tab_buttonpath);
		Common_methods.clickElement(signinBtnHp); //tap on sign in link on homepage

		System.out.println("Uname "+Uname);
		Common_methods.webElement(emailfield).sendKeys(Uname);//enter email id
		Common_methods.webElement(pwdfield).sendKeys(passwd);//enter pwd
//		if(Common_methods.containsText(signinpage_button,"Sign In"))
		Common_methods.clickElement(signinpage_button);//tap on sign in button
		
			
		
			if(Common_methods.isAlertPresent(50)==true)
			{
			System.out.println("accepting notifications alert");
			getDriver().switchTo().alert().accept();//accept notifications alert
	     }
		else
		{
			System.out.println("no notifications alert");
		}
		
		
	}

}
