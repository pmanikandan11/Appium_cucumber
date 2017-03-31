package stepDefinition;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.Common_methods;
import functionLibrary.Main_methods;
import objectRepo.Hotels_page;


public class Steps_BookingHotel implements Hotels_page {
//	@Before
//	public void entryTest() throws Exception
//	{
//		Common_methods.stopServer();//if already running
//		Common_methods.startServer();
//	}
//	@After
//	public void exitTest() throws Exception
//	{
//		Main_methods.getDriver().removeApp(Common_methods.getBundleId());
//		Main_methods.getDriver().quit();
//		Common_methods.stopServer();
//	}
	@Given("^I have started the appium server on device$")
	public void i_have_started_the_appium_server() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Common_methods.stopServer();//if already running
		Common_methods.startServer();
	}
	@Given("^the \"([^\"]*)\" application is installed$")
		public void app_is_installed(String appname) throws Throwable {

			Main_methods.Config(appname);

		}

		@Given("^environment is setup$")
		public void environment_is_setup() throws Throwable {
		    
			Main_methods.SetEnvironment();
			
		}

		@When("^Login to app$")
		public void login_to_app() throws Throwable {
			
			String Uname = Common_methods.Authentication()[0][1].toString();
			String passwd = Common_methods.Authentication()[0][2].toString();
			Main_methods.Login( Uname, passwd);

		}

		@Then("^search for hotel$")
		public void search_for_hotel() throws Throwable {
			//tap on hotels LOB
			
				Common_methods.clickElement(hotels_lob_path);
				
			
			//enter search place and tap on first suggested location
			System.out.println("get search name: "+Common_methods.getPlace(0));
			
			Common_methods.webElement(srchtxtbx).sendKeys(Common_methods.getPlace(0));
			Main_methods.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("get search name: "+Common_methods.getPlace(2));
			Common_methods.containsText(placeSugstn, Common_methods.getPlace(2));
			Common_methods.clickElement(placeSugstn);
			
			
			//select dates
			Common_methods.clickElement(randomDate);
			Thread.sleep(2000);
		 
			//click on search button
			Common_methods.clickElement(srchBtn);
			if(Common_methods.isPageLoaded(chkSortBtn,30)==true)
			{
			
				System.out.println("hotel srp screen is visible");
			
			}
				
			else 

			{
				Common_methods.reporting("error at searching hotel");
			}
				}
			
			
		

		@Then("^Select the hotel and room$")
		public void select_the_hotel_and_room() throws Throwable {
		    
		    //search for hotel
			Common_methods.webElement(selhotl).click();
			System.out.println("Selecting hotel.. ");
		
			Common_methods.clickElement(selectroomBtn);
		     //tap on select room option on hotel infosite
//			Common_methods.htlinfosite(Main_methods.getDriver());

			//select room 
			Thread.sleep(5000);
		     if(Common_methods.isPageLoaded(selRoom, 15)==true)
		    {	
		    	 System.out.println("Selecting room.. ");
		    	 Main_methods.getDriver().findElementByXPath(selRoom).click();
		    }

		     else 
		     {// error occurred	 
		    	 Common_methods.reporting("Execution failed while selecting room");
		     }
		     Thread.sleep(5000);
//		    Thread.sleep(6000);
//		     if(Common_methods.isPageLoaded(TotalTax,20)==true)
//				{
		    	 Common_methods.clickElement(paymntdtlpath);
					
//				}
//				else 
//			     {
//					
//					Common_methods.reporting("error during loading cko");
//			     }
							
			
		}

		@Then("^Make payment through card$")
		public void make_payment_through_card() throws Throwable {
		   
				Common_methods.enterCreditcard("Hotels");
				Thread.sleep(9000);
				Common_methods.SlideToPurchase("Hotels");
				Thread.sleep(2000);
				Common_methods.EnterCVV();
				Main_methods.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     if(Common_methods.isElementExists(getitin)==true)
		     {
		    	 String itin= Common_methods.webElement(getitin).getText();
		    	 System.out.println("itin : "+itin);
		    	 String numberOnly= itin.replaceAll("[^0-9]", "");
		    	 System.out.println("itin no: "+numberOnly);
		    	 Common_methods.takeScreenShot("Hotel Booked");
		    	 if(Common_methods.isElementExists(doneBtn)==true)
			     {
		    	 Common_methods.webElement(doneBtn).click();
		    	 
		    	 Common_methods.webElement(shop_tab_buttonpath).click();
			     }
		     }
		     else 
		    	 {
		    	 if(Common_methods.isAlertPresent(10)==true)
		     {
		    		 Common_methods.reporting("error during payment");
		    	
		     }
		    	 }

		}
		@Then("^at last I stop appium server$")
		public void at_last_I_stop_appium_server() throws Throwable {
			Main_methods.getDriver().removeApp(Common_methods.getBundleId());
//			Main_methods.getDriver().closeApp();
			Main_methods.getDriver().quit();
			Common_methods.stopServer();
			
		}
		

	}

