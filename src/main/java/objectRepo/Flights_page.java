package objectRepo;

public interface Flights_page extends Common_objects{


	//tap on flights
String flights_lob_path="//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIAButton[5]";
	
	String depfield="//UIAApplication[1]/UIAWindow[1]/UIAElement[1]/UIATextField[1]";
	String arrfield="//UIAApplication[1]/UIAWindow[1]/UIAElement[2]/UIATextField[1]";
	String dep="par";
	String arr="rom";
	String sugstn_place="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]";
	String select_date="//UIAApplication[1]/UIAWindow[1]/UIAElement[4]/UIAScrollView[1]/UIAButton[60]";
	String search_btn="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
	String sort_price="//UIAApplication[1]/UIAWindow[1]/UIAToolbar[3]/UIASegmentedControl[1]/UIAButton[1]";
	String choose_flight="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]";
	String select_btn="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
	String checking_price="//UIAApplication[1]/UIAWindow[1]/UIAStaticText[7]";
	String trip_total="//UIAApplication[1]/UIAWindow[1]/UIAStaticText[3]";
	String cko_btn="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
	String cko_loader="//UIAApplication[1]/UIAWindow[3]/UIAStatusBar[1]/UIAElement[3]";
	String payment_tab="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATableView[1]/UIATableCell[3]/UIAStaticText[1]";
	String address="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]";
	String ryt_address="test 123";
	String ryt_city="testcity";
	String ryt_state="Test";
	String ryt_postal="11010";
	String city="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]";
	String state="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]";
	String postal="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]";
	String next_btn="//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[3]";
	String flyt_slidBtn="//UIAApplication[1]/UIAWindow[1]/UIAElement[1]/UIAButton[1]";
	
	String no_flights="//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]";
	
}
