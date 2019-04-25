package com.browser;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_002 extends BaseTest
{
	
	private static final Logger log=Logger.getLogger(TC_002.class.getName());

	public static void main(String[] args) throws Exception 
	{
		test=e.startTest("TC_002");
		
		init();
		log.info("initializion of data & OR & LOg4j  in progress.....");
		test.log(LogStatus.INFO, "initializion of data & OR & LOg4j  in progress.....");
		
		
		launch("chromebrowser");
		log.info("Opened Browser :- "+ p.getProperty("chromebrowser"));
		test.log(LogStatus.INFO, "Opened Browser :- "+ p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigated to URL :- " + p.getProperty("amazonurl"));
		test.log(LogStatus.INFO, "Navigated to URL :- " + p.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id",10);
		log.info("Selected the item 10 By using Locator :- " + or.getProperty("amazondropdown_id"));
		test.log(LogStatus.INFO, "Selected the item 10 By using Locator :- " + or.getProperty("amazondropdown_id"));
		
		type("amazonsearchtext_id","Harry Potter");
		log.info("Entered the text Harry Potter By Using Locator :- " + or.get("amazonsearchtext_id"));
		test.log(LogStatus.INFO, "Entered the text Harry Potter By Using Locator :- " + or.get("amazonsearchtext_id"));
		
		click("amazonsearchbutton_xpath");
		log.info("Clicked on amazon search Button By using Locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		test.log(LogStatus.INFO, "Clicked on amazon search Button By using Locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		
		e.endTest(test);
		e.flush();
		
	}

}
