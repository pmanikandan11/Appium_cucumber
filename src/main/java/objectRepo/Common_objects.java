package objectRepo;

public interface Common_objects {
	
	//	choose trunk from settings
	String accmenu="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeButton[1]";
	String BookingServer="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
	String BookingServer_2="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]";
	String chooseServer="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[11]/XCUIElementTypeStaticText[1]";
	String trunk="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]";
	String integration="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]";
	String serverBackBtn="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]";

//	click sign in option on settings
	String signinlinkBtn="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAButton[1]";
	String signinBtnHp="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]";
	String emailfield="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]";
	String pwdfield="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField[1]";
	String signinpage_button="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]";
//	validate the user name and email
	String unamepath="//UIAApplication[1]/UIAWindow[1]/UIAElement[1]/UIAStaticText[1]";
	String emailpath="//UIAApplication[1]/UIAWindow[1]/UIAElement[1]/UIAStaticText[2]";
	
	String timeout="//UIAApplication[1]/UIAWindow[2]/UIAStaticText[1]";
	String login_fail="//UIAApplication[1]/UIAWindow[2]/UIAStaticText[1]";
	String signin_fail="Sign in failed. Please confirm that your email and password are correct.";

//	tap on shop menu
	String shop_tab_buttonpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]";
	
	//enter card details
		
		String cc_field="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]";
		
		String expirydate="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAElement[1]";

		String cc_done_btn="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[4]";
		String alert_save_btn="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]";
								
		
		
//	    going to cvv screen	
		String cvvTxt="//UIAApplication[1]/UIAWindow[1]/UIATextField[1]";
		
		
		String cvvDone="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
		String done_button="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[4]";
		
//	    booking confirmation	
		String doneBtn="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
		String getitin="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAStaticText[1]";
		
		String cnfrmDneBtn="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
		String bookdHTLname="//UIAApplication[1]/UIAWindow[1]/UIAElement[1]/UIAStaticText[1]";
		
		String pymntErr="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]";
		
		String soryErr="We’re sorry, but we were unable to process your payment. Please verify that you entered your information correctly.";
		
		String soryErr_ok="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]";

		//Signout
		String signout_btn="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIAButton[6]";
		String signout_alert="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]";
		
		//menu options
		String acc_menu="//UIAApplication[1]/UIAWindow[1]/UIAButton[4]";
		
		String Iaccept="//UIAApplication[1]/UIAWindow[1]/UIAButton[1]";
		//card names
		String visa="Visa_1";
		String amex="AmericanExpress";
		
		//your trips
		String trips="//UIAApplication[1]/UIAWindow[1]/UIAImage[1]";
		//paths of all files to read
		String excelPath="/Users/ponramanmanikandan/Documents/Workspace/com.appium.cucumber/TestData/TestData.xlsx";
		String envPath="/Users/ponramanmanikandan/Documents/Workspace/com.appium.cucumber/src/main/java/functionLibrary/Env.properties";
		String ssPath="/Users/ponramanmanikandan/Documents/Workspace/com.appium.cucumber/App_screenshots";
		
		

}
