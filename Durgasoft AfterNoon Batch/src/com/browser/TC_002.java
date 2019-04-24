package com.browser;

import org.apache.log4j.Logger;

public class TC_002 extends BaseTest
{
	
	private static final Logger log=Logger.getLogger(TC_002.class.getName());

	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("initializion of data & OR & LOg4j  in progress.....");
		
		launch("chromebrowser");
		log.info("Opened Browser :- "+ p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		log.info("Navigated to URL :- " + p.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id",10);
		log.info("Selected the item 10 By using Locator :- " + or.getProperty("amazondropdown_id"));
		
		type("amazonsearchtext_id","Harry Potter");
		log.info("Entered the text Harry Potter By Using Locator :- " + or.get("amazonsearchtext_id"));
		
		click("amazonsearchbutton_xpath");
		log.info("Clicked on amazon search Button By using Locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		
	}

}
