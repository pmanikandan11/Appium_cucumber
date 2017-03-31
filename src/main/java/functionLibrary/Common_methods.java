package functionLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


import dataReader.Xls_reader;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import objectRepo.Flights_page;
import objectRepo.Hotels_page;


public class Common_methods implements Flights_page,Hotels_page {
	
	public static void SlideToPurchase(String lob) throws Exception //perform slide to purchase
	{
		
//	switch(Main_methods.tempAppName)
//    {
//       case "MrJet" :
//		
//		System.out.println("app name matched as MrJet...");
//		webElement(Iaccept).click();
//		break;
//	}
	if(lob=="Hotels")
	{
		sliding(Htl_slidBtn);
	}
	else
	{
		sliding(flyt_slidBtn);
	}
		
	}
	
	public static void sliding(String slide)// sliding action according to lob
	{
		if(Common_methods.isElementExists(slide)==true)
		{
		WebElement slid=webElement(slide);    
	     System.out.println("Swiping Now...");
    
	     TouchAction slider = new TouchAction(Main_methods.getDriver());
	     slider.press(slid, 15, 21);
	     slider.waitAction();
	     slider.moveTo(slid, 336, 21);
	     slider.release();
	     slider.perform();
	     System.out.println("Swipped....!");
		}
	}
	public static void EnterCVV() throws Exception
	{
		String cvvNum=Common_methods.readCard(1);
		
		System.out.println("cvvNum : "+cvvNum);
		if(webElement(cvvTxt).isDisplayed())
	     {
	     webElement(cvvTxt).sendKeys(cvvNum);
	     webElement(cvvDone).click();
	     }
	}

	@SuppressWarnings("rawtypes")
	public static void htlinfosite(IOSDriver driver) throws InterruptedException
	{
		
		if(webElement(selectroomBtn).isDisplayed())
	     {
	    	 webElement(selectroomBtn).click();
	     }
		
	     else if(isAlertPresent(40)==true)
	     {//check for sold out
	     
		 System.out.println("Execution failed at select room option on hotel infosite-sold out");
		 
	     }
	}

	public static void takeScreenShot(String name) {
		DateFormat dateFormat;
		String destDir;
		  // Set folder name to store screenshots.
		  destDir = ssPath;

		  File scrFile = ((TakesScreenshot) Main_methods.getDriver()).getScreenshotAs(OutputType.FILE);
		  // Set date format to set It as screenshot file name.
		  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		  // Create folder under project with name "screenshots" provided to destDir.
		  new File(destDir).mkdirs();
		  // Set file name using current date time.
		  String destFile = dateFormat.format(new Date()) + "_"+name +".png";

		  try {
		   // Copy paste file at destination folder location
		   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		  } catch (IOException e) {
		   e.printStackTrace();

		  }
		 }

	public static boolean isElementExists(String path)
	{

		boolean f = false;
		try
		{	

			webElement(path).isDisplayed();
			f=true;

		}
		catch(NoSuchElementException ex)
		{
			f=false;
		}
		return f;
		
		
	}
	public static boolean isPageLoaded(String path,int maxT)
	{
		int t=1;
		boolean flag=false;
		while(t++<maxT)
		   {
			if(isElementExists(path)==true)
			{
				flag=true;
				break;
			}
		   }
		 if(isAlertPresent(1)==true)
			{
				flag=false;
				
			}
			
			
		return flag;
	}
	public static boolean isAlertPresent(int maxT) 
	{ 
		int tim=1;
		boolean flag = false;
		
		while(tim++<=maxT)
		   {
				try 
		    { 
			Main_methods.getDriver().switchTo().alert(); 
	        flag= true;
	        break;
		   }
	    catch (NoAlertPresentException Ex) 
	    { 
	    	flag= false;
	    } 
			}
		return flag;
	}

	public static void enterCreditcard(String lob) throws Exception
	{	
//		Main_methods.getDriver().findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAButton[1]")).click();
		
//		for(int m=1;m<=10;m++)
			int i=2;
		while(i<=10){
			if(Main_methods.getDriver().findElement(By.xpath(("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+i+"]/UIAButton[1]"))).getText().contains("Enter"))
			{
				Main_methods.getDriver().findElement(By.xpath(("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell["+i+"]/UIAButton[1]"))).click();
				break;
			}
			i++;
		}
		
		if(lob=="flights")
		{
			Main_methods.getDriver().findElementByXPath(address).sendKeys(getaddress("address"));
			Main_methods.getDriver().findElementByXPath(city).sendKeys(getaddress("city"));
			Main_methods.getDriver().findElementByXPath(state).sendKeys(getaddress("state"));
			Main_methods.getDriver().findElementByXPath(postal).sendKeys(getaddress("zipcode"));
			Main_methods.getDriver().findElementByXPath(next_btn).click();
			
		}
		String cardNum=Common_methods.readCard(0);
		System.out.println("cardNum : "+cardNum);
		Main_methods.getDriver().findElementByXPath(cc_field).sendKeys(cardNum);
		Main_methods.getDriver().findElementByXPath(expirydate).click();
		if(lob=="Hotels")
		{
		chkforZipcode();
		}
		Main_methods.getDriver().findElementByXPath(done_button).click();
		
		Main_methods.getDriver().findElementByXPath(alert_save_btn).click();
	}
	
	public static void chkforZipcode() throws Exception
	{
		Main_methods.getDriver().findElementByXPath(postalCode).sendKeys(getaddress("zipcode"));
        System.out.println("entered zipcode");
//		switch(Main_methods.tempAppName)
//	      {
//	         case "CheapTickets" :
//	        	
//	        	 Main_methods.getDriver().findElementByXPath(postalCode).sendKeys(getaddress("zipcode"));
//	            System.out.println("entered zipcode for CheapTickets"); 
//	            break;
//	        	 
//	         case "Orbitz" :
//	        	 Main_methods.getDriver().findElementByXPath(postalCode).sendKeys(getaddress("zipcode"));
//		            System.out.println("entered zipcode for Orbitz"); 
//		        break;
//	         case "Ebookers" :
//	        	 Main_methods.getDriver().findElementByXPath(postalCode).sendKeys(getaddress("zipcode"));
//		            System.out.println("entered zipcode for Ebookers"); 
//	            break;
//	         case "MrJet" :
//	        	 break; 
//	         case "LM" :
//	        	 break; 
//	         case "Wotif" :
//	        	 break; 
//	         
//	      }
		
	}
	public static void reporting(String msg)
	{
		System.out.println(msg);
		Common_methods.takeScreenShot(msg);
		Assert.fail("Stopping TestNG due to "+msg);
	}
	public static Object[][] Authentication() throws Exception{

		String sTestCaseName=Main_methods.tempAppName;
		 
		int iTestCaseRow;
			Xls_reader.setExcelFile(excelPath,"Credentials");
			
		 	iTestCaseRow = Xls_reader.getRowContains(sTestCaseName,0);
	 
		    Object[][] testObjArray = Xls_reader.getTableArray(excelPath,"Credentials",iTestCaseRow);
	 
		    	return (testObjArray);
	 
			}
	
	public static String readCard(int flag) throws Exception{

	String sTestCaseName=Main_methods.tempAppName+"_Card";
	 
	int iTestCaseRow;
		Xls_reader.setExcelFile(excelPath,"CreditCard");
		
	 	iTestCaseRow = Xls_reader.getRowContains(sTestCaseName,0);
 
	    Object[][] testObjArray = Xls_reader.getTableArray(excelPath,"CreditCard",iTestCaseRow);
	    if(flag==0)
	    
	    	return (testObjArray[0][1].toString());
	    
	    else 
	    
	    	return (testObjArray[0][2].toString());
	    
 
		}
	public static String getBundleId() throws Exception
	{
		int iTestCaseRow;
		Xls_reader.setExcelFile(excelPath,"BundleIdentifier");
		
	 	iTestCaseRow = Xls_reader.getRowContains(Main_methods.tempAppName,0);
 
	    Object[][] testObjArray = Xls_reader.getTableArray(excelPath,"BundleIdentifier",iTestCaseRow);
	    return (testObjArray[0][1].toString());
	}
	public static String getPlace(int flag) throws Exception{
		
		int iTestCaseRow;
		Xls_reader.setExcelFile(excelPath,"Search");
		
	 	iTestCaseRow = Xls_reader.getRowContains(Main_methods.tempAppName,0);
 
	    Object[][] testObjArray = Xls_reader.getTableArray(excelPath,"Search",iTestCaseRow);
	    
	    if(flag==0)
		    
	    	return (testObjArray[0][1].toString());
	    
	    else if(flag==1)
	    
	    	return (testObjArray[0][2].toString());
	    else
	    	return (testObjArray[0][3].toString());

	    }
	public static String GetEnv() throws IOException {

		Properties CONFIG = new Properties();
		FileInputStream config = new FileInputStream(envPath);
		CONFIG.load(config);
		String user = CONFIG.getProperty("Env");
		return user;
	}
	public static String getaddress(String field_value) throws Exception{

	int iTestCaseRow;
		Xls_reader.setExcelFile(excelPath,"Address");
		
	 	iTestCaseRow = Xls_reader.getRowContains(field_value,0);
 
	    Object[][] testObjArray = Xls_reader.getTableArray(excelPath,"Address",iTestCaseRow);
	    
	    
	    	return (testObjArray[0][1].toString());
	    }
	
		public static void startServer() throws IOException {
			
		CommandLine command = new CommandLine(
				"/usr/local/bin/node");
		command.addArgument(
				"/Users/ponramanmanikandan/appium/build/lib/main.js",
//				/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js",
				///Users/ponramanmanikandan/Documents/Appium/appium/build/lib/main.js",
				
				false);

		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		try {
			executor.execute(command, resultHandler);
			Thread.sleep(5000);
			System.out.println("Appium server started.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	public static void stopServer() {
		String[] command = { "/usr/bin/killall", "-KILL", "node" };
		try {
			Runtime.getRuntime().exec(command);
			System.out.println("Appium server stopped.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static WebElement webElement(String xpath)
	{
		
		return Main_methods.getDriver().findElement(By.xpath(xpath));
		
	}
	public static void clickElement(String xpath)
	{	
		if(webElement(xpath).isDisplayed());
		webElement(xpath).click();
	}
	public static boolean containsText(String xpath,String text)
	{
		if(webElement(xpath).getText().contains(text))
			return true;
		return false;
				
	}
	public static String getAppFilepath(String path)
	{
		try
		{
			return new File(".").getCanonicalPath() + path;			
		}
		catch(IOException e)
		{
			return " ";
		}
	}
	
	
}

