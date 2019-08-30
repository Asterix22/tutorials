package com.baeldung;

import static org.junit.Assert.*;

import org.junit.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumUnitTest {
	
	@Test
	public void runDriver() {
		 ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
		    ChromeOptions chromeOptions = new ChromeOptions();

		    chromeOptions.addArguments("--headless");
		    WebDriver driver = new ChromeDriver(chromeOptions);
		    
		    String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        
	        System.out.println("The observed title is: "+ actualTitle);
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
		
		
	}
	
	

}
