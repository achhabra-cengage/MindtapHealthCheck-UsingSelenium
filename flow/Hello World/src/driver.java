import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driver{ 
	public static void main(String[] args) throws Exception {

		try
		{

			System.setProperty("webdriver.chrome.driver", "//Users/mindtap/Desktop/Selenium1/chromedriver");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("-incognito");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			WebDriver ghostdriver = new ChromeDriver(capabilities);

			// ------------------------------------------------------------------------------------------------------------------------------
			// ------------------------------------------------------------------------------------------------------------------------------

			System.out.println("LOGIN PAGE TIMINGS: \n");
			ghostdriver.get("https://login.cengage.com/");

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	      								         NAVIGATION TIMING API:

			System.out.println("NAVIGATION TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var performance = window.performance || {};" + 
					"var startTiming0 = performance.timing.navigationStart;"+
					"var endTiming0 = performance.timing.loadEventEnd;"+
					"return 'TotalTime: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming2 = performance.timing.redirectStart;"+
					"var endTiming2 = performance.timing.redirectEnd;"+
					"return 'redirectTiming: ' + (endTiming2 - startTiming2);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming3 = performance.timing.fetchStart;"+
					"var endTiming3 = performance.timing.domainLookupStart;"+
					"return 'fetchStart: ' + (endTiming3 - startTiming3);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming4 = performance.timing.domainLookupStart;"+
					"var endTiming4 = performance.timing.domainLookupEnd;"+
					"return 'DNS LookupTime: ' + (endTiming4 - startTiming4);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming5 = performance.timing.connectStart;"+
					"var endTiming5 = performance.timing.connectEnd;"+
					"return 'connectTime: ' + (endTiming5 - startTiming5);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming6 = performance.timing.requestStart;"+
					"var endTiming6 = performance.timing.responseStart;"+
					"return 'requestTime: ' + (endTiming6 - startTiming6);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming7 = performance.timing.responseStart;"+
					"var endTiming7 = performance.timing.responseEnd;"+
					"return 'responseTime: ' + (endTiming7 - startTiming7);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming8 = performance.timing.domLoading;"+
					"var endTiming8 = performance.timing.domComplete;"+
					"return 'domLoading ' + (endTiming8 - startTiming8);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming9 = performance.timing.loadEventStart;"+
					"var endTiming9 = performance.timing.loadEventEnd;"+
					"return 'Load Event: ' + (endTiming9 - startTiming9);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming10 = performance.timing.domContentLoadedEventStart;"+
					"var endTiming10 = performance.timing.domContentLoadedEventEnd;"+
					"return 'domContentLoaded: ' + (endTiming10 - startTiming10);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming11 = performance.timing.unloadEventStart;"+
					"var endTiming11 = performance.timing.unloadEventEnd;"+
					"return 'Unload Event: ' + (endTiming11 - startTiming11);"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	 								       			RESOURCE TIMING API:


			System.out.println("\nRESOURCE TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].startTime;"+
					"var endTiming0 = resourceList[0].responseEnd;"+
					"return 'Total Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].redirectStart;"+
					"var endTiming0 = resourceList[0].redirectEnd;"+
					"return 'Redirect Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming1 = resourceList[0].fetchStart;"+
					"var endTiming1 = resourceList[0].domainLookupStart;"+
					"return 'App Cache Time: ' + (endTiming1 - startTiming1)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming2 = resourceList[0].domainLookupStart;"+
					"var endTiming2 = resourceList[0].domainLookupEnd;"+
					"return 'DNS Time: ' + (endTiming2 - startTiming2)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming3 = resourceList[0].connectStart;"+
					"var endTiming3 = resourceList[0].connectEnd;"+
					"return 'TCP Time: ' + (endTiming3 - startTiming3)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming4 = resourceList[0].requestStart;"+
					"var endTiming4 = resourceList[0].responseStart;"+
					"return 'Request Time: ' + ((endTiming4 - startTiming4).toFixed(2))"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming5 = resourceList[0].responseStart;"+
					"var endTiming5 = resourceList[0].responseEnd;"+
					"return 'Response Time: ' + ((endTiming5 - startTiming5).toFixed(2))"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------

			//Query and fill Username
			WebElement usernameQuery = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='emailId']")));
			usernameQuery.sendKeys("mockgeyser.slave@gmail.com");

			//Query and fill Password
			WebElement passwordQuery = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='password']")));
			passwordQuery.sendKeys("DASHBOARD1234");

			WebElement loginButton = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='loginFormId']/input[3]")));
			loginButton.click();
			System.out.println("------------------------------------------------------------------------------------------------ \n");

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			// ----------------------------------------------------------------------------------------------------------------------------------------------

			System.out.println("COURSE PAGE TIMINGS: \n");
			Thread.sleep(5000);

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	      								         NAVIGATION TIMING API:

			System.out.println("NAVIGATION TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var performance = window.performance || {};" + 
					"var startTiming0 = performance.timing.navigationStart;"+
					"var endTiming0 = performance.timing.loadEventEnd;"+
					"return 'TotalTime: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming2 = performance.timing.redirectStart;"+
					"var endTiming2 = performance.timing.redirectEnd;"+
					"return 'redirectTiming: ' + (endTiming2 - startTiming2);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming3 = performance.timing.fetchStart;"+
					"var endTiming3 = performance.timing.domainLookupStart;"+
					"return 'fetchStart: ' + (endTiming3 - startTiming3);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming4 = performance.timing.domainLookupStart;"+
					"var endTiming4 = performance.timing.domainLookupEnd;"+
					"return 'DNS LookupTime: ' + (endTiming4 - startTiming4);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming5 = performance.timing.connectStart;"+
					"var endTiming5 = performance.timing.connectEnd;"+
					"return 'connectTime: ' + (endTiming5 - startTiming5);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming6 = performance.timing.requestStart;"+
					"var endTiming6 = performance.timing.responseStart;"+
					"return 'requestTime: ' + (endTiming6 - startTiming6);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming7 = performance.timing.responseStart;"+
					"var endTiming7 = performance.timing.responseEnd;"+
					"return 'responseTime: ' + (endTiming7 - startTiming7);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming8 = performance.timing.domLoading;"+
					"var endTiming8 = performance.timing.domComplete;"+
					"return 'domLoading ' + (endTiming8 - startTiming8);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming9 = performance.timing.loadEventStart;"+
					"var endTiming9 = performance.timing.loadEventEnd;"+
					"return 'Load Event: ' + (endTiming9 - startTiming9);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming10 = performance.timing.domContentLoadedEventStart;"+
					"var endTiming10 = performance.timing.domContentLoadedEventEnd;"+
					"return 'domContentLoaded: ' + (endTiming10 - startTiming10);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming11 = performance.timing.unloadEventStart;"+
					"var endTiming11 = performance.timing.unloadEventEnd;"+
					"return 'Unload Event: ' + (endTiming11 - startTiming11);"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	 								       			RESOURCE TIMING API:


			System.out.println("\nRESOURCE TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].startTime;"+
					"var endTiming0 = resourceList[0].responseEnd;"+
					"return 'Total Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].redirectStart;"+
					"var endTiming0 = resourceList[0].redirectEnd;"+
					"return 'Redirect Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming1 = resourceList[0].fetchStart;"+
					"var endTiming1 = resourceList[0].domainLookupStart;"+
					"return 'App Cache Time: ' + (endTiming1 - startTiming1)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming2 = resourceList[0].domainLookupStart;"+
					"var endTiming2 = resourceList[0].domainLookupEnd;"+
					"return 'DNS Time: ' + (endTiming2 - startTiming2)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming3 = resourceList[0].connectStart;"+
					"var endTiming3 = resourceList[0].connectEnd;"+
					"return 'TCP Time: ' + (endTiming3 - startTiming3)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming4 = resourceList[0].requestStart;"+
					"var endTiming4 = resourceList[0].responseStart;"+
					"return 'Request Time: ' + ((endTiming4 - startTiming4).toFixed(2))"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming5 = resourceList[0].responseStart;"+
					"var endTiming5 = resourceList[0].responseEnd;"+
					"return 'Response Time: ' + ((endTiming5 - startTiming5).toFixed(2))"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			
			List<WebElement> courseLinks = ghostdriver.findElements(By.className("viewDetailsBtn"));
			courseLinks.get(0).click();	
			System.out.println("------------------------------------------------------------------------------------------------ \n");

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			// ----------------------------------------------------------------------------------------------------------------------------------------------

			System.out.println("OPEN BOOK TIMINGS: \n");
			ArrayList<String> tabs = new ArrayList<String> (ghostdriver.getWindowHandles());
			ghostdriver.switchTo().window(tabs.get(1));
			Thread.sleep(5000);

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	      								         NAVIGATION TIMING API:

			System.out.println("NAVIGATION TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var performance = window.performance || {};" + 
					"var startTiming0 = performance.timing.navigationStart;"+
					"var endTiming0 = performance.timing.loadEventEnd;"+
					"return 'TotalTime: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming2 = performance.timing.redirectStart;"+
					"var endTiming2 = performance.timing.redirectEnd;"+
					"return 'redirectTiming: ' + (endTiming2 - startTiming2);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming3 = performance.timing.fetchStart;"+
					"var endTiming3 = performance.timing.domainLookupStart;"+
					"return 'fetchStart: ' + (endTiming3 - startTiming3);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming4 = performance.timing.domainLookupStart;"+
					"var endTiming4 = performance.timing.domainLookupEnd;"+
					"return 'DNS LookupTime: ' + (endTiming4 - startTiming4);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming5 = performance.timing.connectStart;"+
					"var endTiming5 = performance.timing.connectEnd;"+
					"return 'connectTime: ' + (endTiming5 - startTiming5);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming6 = performance.timing.requestStart;"+
					"var endTiming6 = performance.timing.responseStart;"+
					"return 'requestTime: ' + (endTiming6 - startTiming6);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming7 = performance.timing.responseStart;"+
					"var endTiming7 = performance.timing.responseEnd;"+
					"return 'responseTime: ' + (endTiming7 - startTiming7);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming8 = performance.timing.domLoading;"+
					"var endTiming8 = performance.timing.domComplete;"+
					"return 'domLoading ' + (endTiming8 - startTiming8);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming9 = performance.timing.loadEventStart;"+
					"var endTiming9 = performance.timing.loadEventEnd;"+
					"return 'Load Event: ' + (endTiming9 - startTiming9);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming10 = performance.timing.domContentLoadedEventStart;"+
					"var endTiming10 = performance.timing.domContentLoadedEventEnd;"+
					"return 'domContentLoaded: ' + (endTiming10 - startTiming10);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming11 = performance.timing.unloadEventStart;"+
					"var endTiming11 = performance.timing.unloadEventEnd;"+
					"return 'Unload Event: ' + (endTiming11 - startTiming11);"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	 								       			RESOURCE TIMING API:


			System.out.println("\nRESOURCE TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].startTime;"+
					"var endTiming0 = resourceList[0].responseEnd;"+
					"return 'Total Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].redirectStart;"+
					"var endTiming0 = resourceList[0].redirectEnd;"+
					"return 'Redirect Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming1 = resourceList[0].fetchStart;"+
					"var endTiming1 = resourceList[0].domainLookupStart;"+
					"return 'App Cache Time: ' + (endTiming1 - startTiming1)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming2 = resourceList[0].domainLookupStart;"+
					"var endTiming2 = resourceList[0].domainLookupEnd;"+
					"return 'DNS Time: ' + (endTiming2 - startTiming2)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming3 = resourceList[0].connectStart;"+
					"var endTiming3 = resourceList[0].connectEnd;"+
					"return 'TCP Time: ' + (endTiming3 - startTiming3)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming4 = resourceList[0].requestStart;"+
					"var endTiming4 = resourceList[0].responseStart;"+
					"return 'Request Time: ' + ((endTiming4 - startTiming4).toFixed(2))"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming5 = resourceList[0].responseStart;"+
					"var endTiming5 = resourceList[0].responseEnd;"+
					"return 'Response Time: ' + ((endTiming5 - startTiming5).toFixed(2))"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			
			List<WebElement> chapterLinks  = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("lpn_thumbTitle")));
			System.out.println(chapterLinks);
			Random randomChapter = new Random();
			chapterLinks.get(randomChapter.nextInt((chapterLinks.size()))).click();
			System.out.println("------------------------------------------------------------------------------------------------ \n");

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			// ----------------------------------------------------------------------------------------------------------------------------------------------

			System.out.println("CHAPTER OPEN TIMINGS: \n");
			Thread.sleep(5000);

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	      								         NAVIGATION TIMING API:

			System.out.println("NAVIGATION TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var performance = window.performance || {};" + 
					"var startTiming0 = performance.timing.navigationStart;"+
					"var endTiming0 = performance.timing.loadEventEnd;"+
					"return 'TotalTime: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming2 = performance.timing.redirectStart;"+
					"var endTiming2 = performance.timing.redirectEnd;"+
					"return 'redirectTiming: ' + (endTiming2 - startTiming2);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming3 = performance.timing.fetchStart;"+
					"var endTiming3 = performance.timing.domainLookupStart;"+
					"return 'fetchStart: ' + (endTiming3 - startTiming3);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming4 = performance.timing.domainLookupStart;"+
					"var endTiming4 = performance.timing.domainLookupEnd;"+
					"return 'DNS LookupTime: ' + (endTiming4 - startTiming4);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming5 = performance.timing.connectStart;"+
					"var endTiming5 = performance.timing.connectEnd;"+
					"return 'connectTime: ' + (endTiming5 - startTiming5);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming6 = performance.timing.requestStart;"+
					"var endTiming6 = performance.timing.responseStart;"+
					"return 'requestTime: ' + (endTiming6 - startTiming6);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming7 = performance.timing.responseStart;"+
					"var endTiming7 = performance.timing.responseEnd;"+
					"return 'responseTime: ' + (endTiming7 - startTiming7);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming8 = performance.timing.domLoading;"+
					"var endTiming8 = performance.timing.domComplete;"+
					"return 'domLoading ' + (endTiming8 - startTiming8);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming9 = performance.timing.loadEventStart;"+
					"var endTiming9 = performance.timing.loadEventEnd;"+
					"return 'Load Event: ' + (endTiming9 - startTiming9);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming10 = performance.timing.domContentLoadedEventStart;"+
					"var endTiming10 = performance.timing.domContentLoadedEventEnd;"+
					"return 'domContentLoaded: ' + (endTiming10 - startTiming10);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming11 = performance.timing.unloadEventStart;"+
					"var endTiming11 = performance.timing.unloadEventEnd;"+
					"return 'Unload Event: ' + (endTiming11 - startTiming11);"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	 								       			RESOURCE TIMING API:


			System.out.println("\nRESOURCE TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].startTime;"+
					"var endTiming0 = resourceList[0].responseEnd;"+
					"return 'Total Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].redirectStart;"+
					"var endTiming0 = resourceList[0].redirectEnd;"+
					"return 'Redirect Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming1 = resourceList[0].fetchStart;"+
					"var endTiming1 = resourceList[0].domainLookupStart;"+
					"return 'App Cache Time: ' + (endTiming1 - startTiming1)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming2 = resourceList[0].domainLookupStart;"+
					"var endTiming2 = resourceList[0].domainLookupEnd;"+
					"return 'DNS Time: ' + (endTiming2 - startTiming2)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming3 = resourceList[0].connectStart;"+
					"var endTiming3 = resourceList[0].connectEnd;"+
					"return 'TCP Time: ' + (endTiming3 - startTiming3)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming4 = resourceList[0].requestStart;"+
					"var endTiming4 = resourceList[0].responseStart;"+
					"return 'Request Time: ' + ((endTiming4 - startTiming4).toFixed(2))"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming5 = resourceList[0].responseStart;"+
					"var endTiming5 = resourceList[0].responseEnd;"+
					"return 'Response Time: ' + ((endTiming5 - startTiming5).toFixed(2))"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------

			List<WebElement> subChapterLinks  = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("lpn_thumbTitle")));
			Random randomSubChapter = new Random();
			subChapterLinks.get(randomSubChapter.nextInt(subChapterLinks.size())).click();
			System.out.println("------------------------------------------------------------------------------------------------ \n");

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			// ----------------------------------------------------------------------------------------------------------------------------------------------

			System.out.println("ENTER BOOK TIMINGS: \n");
			Thread.sleep(5000);

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	      								         NAVIGATION TIMING API:

			System.out.println("NAVIGATION TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var performance = window.performance || {};" + 
					"var startTiming0 = performance.timing.navigationStart;"+
					"var endTiming0 = performance.timing.loadEventEnd;"+
					"return 'TotalTime: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming2 = performance.timing.redirectStart;"+
					"var endTiming2 = performance.timing.redirectEnd;"+
					"return 'redirectTiming: ' + (endTiming2 - startTiming2);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming3 = performance.timing.fetchStart;"+
					"var endTiming3 = performance.timing.domainLookupStart;"+
					"return 'fetchStart: ' + (endTiming3 - startTiming3);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming4 = performance.timing.domainLookupStart;"+
					"var endTiming4 = performance.timing.domainLookupEnd;"+
					"return 'DNS LookupTime: ' + (endTiming4 - startTiming4);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming5 = performance.timing.connectStart;"+
					"var endTiming5 = performance.timing.connectEnd;"+
					"return 'connectTime: ' + (endTiming5 - startTiming5);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming6 = performance.timing.requestStart;"+
					"var endTiming6 = performance.timing.responseStart;"+
					"return 'requestTime: ' + (endTiming6 - startTiming6);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming7 = performance.timing.responseStart;"+
					"var endTiming7 = performance.timing.responseEnd;"+
					"return 'responseTime: ' + (endTiming7 - startTiming7);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming8 = performance.timing.domLoading;"+
					"var endTiming8 = performance.timing.domComplete;"+
					"return 'domLoading ' + (endTiming8 - startTiming8);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming9 = performance.timing.loadEventStart;"+
					"var endTiming9 = performance.timing.loadEventEnd;"+
					"return 'Load Event: ' + (endTiming9 - startTiming9);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming10 = performance.timing.domContentLoadedEventStart;"+
					"var endTiming10 = performance.timing.domContentLoadedEventEnd;"+
					"return 'domContentLoaded: ' + (endTiming10 - startTiming10);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming11 = performance.timing.unloadEventStart;"+
					"var endTiming11 = performance.timing.unloadEventEnd;"+
					"return 'Unload Event: ' + (endTiming11 - startTiming11);"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	 								       			RESOURCE TIMING API:


			System.out.println("\nRESOURCE TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].startTime;"+
					"var endTiming0 = resourceList[0].responseEnd;"+
					"return 'Total Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].redirectStart;"+
					"var endTiming0 = resourceList[0].redirectEnd;"+
					"return 'Redirect Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming1 = resourceList[0].fetchStart;"+
					"var endTiming1 = resourceList[0].domainLookupStart;"+
					"return 'App Cache Time: ' + (endTiming1 - startTiming1)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming2 = resourceList[0].domainLookupStart;"+
					"var endTiming2 = resourceList[0].domainLookupEnd;"+
					"return 'DNS Time: ' + (endTiming2 - startTiming2)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming3 = resourceList[0].connectStart;"+
					"var endTiming3 = resourceList[0].connectEnd;"+
					"return 'TCP Time: ' + (endTiming3 - startTiming3)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming4 = resourceList[0].requestStart;"+
					"var endTiming4 = resourceList[0].responseStart;"+
					"return 'Request Time: ' + ((endTiming4 - startTiming4).toFixed(2))"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming5 = resourceList[0].responseStart;"+
					"var endTiming5 = resourceList[0].responseEnd;"+
					"return 'Response Time: ' + ((endTiming5 - startTiming5).toFixed(2))"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------

			WebElement flashcardOpen = ghostdriver.findElement(By.id("app_view_flash_cards"));
			flashcardOpen.click();
			System.out.println("------------------------------------------------------------------------------------------------ \n");
			// ----------------------------------------------------------------------------------------------------------------------------------------------
			// ----------------------------------------------------------------------------------------------------------------------------------------------

			System.out.println("OPEN FLASHCARDS: \n");
			Thread.sleep(4000);
			ghostdriver.switchTo().frame(ghostdriver.findElement(By.id("29_NB_Dock_IFrame")));
			Thread.sleep(2000);

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	      								         NAVIGATION TIMING API:

			System.out.println("NAVIGATION TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var performance = window.performance || {};" + 
					"var startTiming0 = performance.timing.navigationStart;"+
					"var endTiming0 = performance.timing.loadEventEnd;"+
					"return 'TotalTime: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming2 = performance.timing.redirectStart;"+
					"var endTiming2 = performance.timing.redirectEnd;"+
					"return 'redirectTiming: ' + (endTiming2 - startTiming2);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming3 = performance.timing.fetchStart;"+
					"var endTiming3 = performance.timing.domainLookupStart;"+
					"return 'fetchStart: ' + (endTiming3 - startTiming3);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming4 = performance.timing.domainLookupStart;"+
					"var endTiming4 = performance.timing.domainLookupEnd;"+
					"return 'DNS LookupTime: ' + (endTiming4 - startTiming4);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming5 = performance.timing.connectStart;"+
					"var endTiming5 = performance.timing.connectEnd;"+
					"return 'connectTime: ' + (endTiming5 - startTiming5);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming6 = performance.timing.requestStart;"+
					"var endTiming6 = performance.timing.responseStart;"+
					"return 'requestTime: ' + (endTiming6 - startTiming6);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming7 = performance.timing.responseStart;"+
					"var endTiming7 = performance.timing.responseEnd;"+
					"return 'responseTime: ' + (endTiming7 - startTiming7);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming8 = performance.timing.domLoading;"+
					"var endTiming8 = performance.timing.domComplete;"+
					"return 'domLoading ' + (endTiming8 - startTiming8);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming9 = performance.timing.loadEventStart;"+
					"var endTiming9 = performance.timing.loadEventEnd;"+
					"return 'Load Event: ' + (endTiming9 - startTiming9);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming10 = performance.timing.domContentLoadedEventStart;"+
					"var endTiming10 = performance.timing.domContentLoadedEventEnd;"+
					"return 'domContentLoaded: ' + (endTiming10 - startTiming10);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming11 = performance.timing.unloadEventStart;"+
					"var endTiming11 = performance.timing.unloadEventEnd;"+
					"return 'Unload Event: ' + (endTiming11 - startTiming11);"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	 								       			RESOURCE TIMING API:


			System.out.println("\nRESOURCE TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].startTime;"+
					"var endTiming0 = resourceList[0].responseEnd;"+
					"return 'Total Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].redirectStart;"+
					"var endTiming0 = resourceList[0].redirectEnd;"+
					"return 'Redirect Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming1 = resourceList[0].fetchStart;"+
					"var endTiming1 = resourceList[0].domainLookupStart;"+
					"return 'App Cache Time: ' + (endTiming1 - startTiming1)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming2 = resourceList[0].domainLookupStart;"+
					"var endTiming2 = resourceList[0].domainLookupEnd;"+
					"return 'DNS Time: ' + (endTiming2 - startTiming2)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming3 = resourceList[0].connectStart;"+
					"var endTiming3 = resourceList[0].connectEnd;"+
					"return 'TCP Time: ' + (endTiming3 - startTiming3)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming4 = resourceList[0].requestStart;"+
					"var endTiming4 = resourceList[0].responseStart;"+
					"return 'Request Time: ' + ((endTiming4 - startTiming4).toFixed(2))"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming5 = resourceList[0].responseStart;"+
					"var endTiming5 = resourceList[0].responseEnd;"+
					"return 'Response Time: ' + ((endTiming5 - startTiming5).toFixed(2))"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------

			WebElement nextFlashcard = ghostdriver.findElement(By.id("next-card"));
			nextFlashcard.click();
			System.out.println("------------------------------------------------------------------------------------------------ \n");
			// ----------------------------------------------------------------------------------------------------------------------------------------------
			// ----------------------------------------------------------------------------------------------------------------------------------------------

			System.out.println("OPEN NEXT FLASHCARD: \n");
			Thread.sleep(3000);

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	      								         NAVIGATION TIMING API:

			System.out.println("NAVIGATION TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var performance = window.performance || {};" + 
					"var startTiming0 = performance.timing.navigationStart;"+
					"var endTiming0 = performance.timing.loadEventEnd;"+
					"return 'TotalTime: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming2 = performance.timing.redirectStart;"+
					"var endTiming2 = performance.timing.redirectEnd;"+
					"return 'redirectTiming: ' + (endTiming2 - startTiming2);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming3 = performance.timing.fetchStart;"+
					"var endTiming3 = performance.timing.domainLookupStart;"+
					"return 'fetchStart: ' + (endTiming3 - startTiming3);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming4 = performance.timing.domainLookupStart;"+
					"var endTiming4 = performance.timing.domainLookupEnd;"+
					"return 'DNS LookupTime: ' + (endTiming4 - startTiming4);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming5 = performance.timing.connectStart;"+
					"var endTiming5 = performance.timing.connectEnd;"+
					"return 'connectTime: ' + (endTiming5 - startTiming5);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming6 = performance.timing.requestStart;"+
					"var endTiming6 = performance.timing.responseStart;"+
					"return 'requestTime: ' + (endTiming6 - startTiming6);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming7 = performance.timing.responseStart;"+
					"var endTiming7 = performance.timing.responseEnd;"+
					"return 'responseTime: ' + (endTiming7 - startTiming7);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming8 = performance.timing.domLoading;"+
					"var endTiming8 = performance.timing.domComplete;"+
					"return 'domLoading ' + (endTiming8 - startTiming8);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming9 = performance.timing.loadEventStart;"+
					"var endTiming9 = performance.timing.loadEventEnd;"+
					"return 'Load Event: ' + (endTiming9 - startTiming9);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming10 = performance.timing.domContentLoadedEventStart;"+
					"var endTiming10 = performance.timing.domContentLoadedEventEnd;"+
					"return 'domContentLoaded: ' + (endTiming10 - startTiming10);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var startTiming11 = performance.timing.unloadEventStart;"+
					"var endTiming11 = performance.timing.unloadEventEnd;"+
					"return 'Unload Event: ' + (endTiming11 - startTiming11);"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			//    	 								       			RESOURCE TIMING API:


			System.out.println("\nRESOURCE TIMING API:");
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].startTime;"+
					"var endTiming0 = resourceList[0].responseEnd;"+
					"return 'Total Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming0 = resourceList[0].redirectStart;"+
					"var endTiming0 = resourceList[0].redirectEnd;"+
					"return 'Redirect Time: ' + (endTiming0 - startTiming0);"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming1 = resourceList[0].fetchStart;"+
					"var endTiming1 = resourceList[0].domainLookupStart;"+
					"return 'App Cache Time: ' + (endTiming1 - startTiming1)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming2 = resourceList[0].domainLookupStart;"+
					"var endTiming2 = resourceList[0].domainLookupEnd;"+
					"return 'DNS Time: ' + (endTiming2 - startTiming2)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming3 = resourceList[0].connectStart;"+
					"var endTiming3 = resourceList[0].connectEnd;"+
					"return 'TCP Time: ' + (endTiming3 - startTiming3)"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming4 = resourceList[0].requestStart;"+
					"var endTiming4 = resourceList[0].responseStart;"+
					"return 'Request Time: ' + ((endTiming4 - startTiming4).toFixed(2))"));
			System.out.println(((JavascriptExecutor)ghostdriver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
					"var startTiming5 = resourceList[0].responseStart;"+
					"var endTiming5 = resourceList[0].responseEnd;"+
					"return 'Response Time: ' + ((endTiming5 - startTiming5).toFixed(2))"));

			// ----------------------------------------------------------------------------------------------------------------------------------------------
			System.out.println("--------------------------------------**COMPLETED**-----------------------------------");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}