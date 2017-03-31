package objectRepo;

public interface Hotels_page extends Common_objects {
	


//	tap on hotels 	
	String hotels_lob_path="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]";
	
	String crossicon="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]/XCUIElementTypeButton[1]";
	
	String srchtxtbx="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]";
	
	String placeSugstn="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
	
	String getdatePath="//UIAApplication[1]/UIAWindow[1]/UIAElement[1]/UIAScrollView[1]/UIAButton[1]";
	String randomDate="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]";

//	choose no. of guests-2 adults
	String guesticon = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]";
	String addAdult = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]";
//	click on search button	
	String srchBtn= "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]";
	String selhotl="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]";
//select room	
	String back_infosite="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[2]";
	String back_srp="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]";
	String chkselroom="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]";
	String selectroomBtn="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
//	String selectroomBtn_2="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[4]";
	String chkSortBtn="//UIAApplication[1]/UIAWindow[1]/UIAToolbar[2]/UIAButton[2]";
	String selRoom="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAButton[1]";
	
	
//search error	
	String srchErr="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]";
	String srchErr_OK="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]";
	
	String SelectRoom="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAStaticText[1]";
//check for soldout alert
	String Soldout="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]";
	
//check unknown error occured	
	String unknwnErr="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[2]";
	String unknwnErr_OK="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]";
	String cko_unknErr="//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]";
	
//    going to checkout	
	String next_button="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
	String Overview="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
	String TotalTax="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[10]";
	String Htl_slidBtn="//UIAApplication[1]/UIAWindow[1]/UIAElement[2]/UIAButton[1]";
	
	
	
//	check all details are filled	
	String guestDtlpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]";

	String paymntdtlpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[3]";
	

// guest details
	String guestdtloptn="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[2]";
	String guestnamePth="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]";
	String FrstNamePth="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]";
	String FrstName="Test";
	String LastNamePth="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]";
	String LastName="Orbitz";
	String phnoPth="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]";
	String phno="8237482388";
	String GuestdoneBtn="done_button";
	
//payment details
	String pymntDtlPth="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]";
	
	String postalCode="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAElement[3]/UIATextField[1]";
	
	
	

	
}
