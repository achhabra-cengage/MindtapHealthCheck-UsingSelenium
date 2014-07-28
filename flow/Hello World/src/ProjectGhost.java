import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProjectGhost{ 
    public static void main(String[] args) throws Exception {
    	
    	try
    	{
    		
    	System.setProperty("webdriver.chrome.driver", "//Users/mindtap/Desktop/Selenium1/chromedriver");
   	
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("-incognito");
    	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    	WebDriver driver = new ChromeDriver(capabilities);
    	driver.get("https://login.cengage.com/");
        
        System.out.println("LOGIN PAGE LOADING -- ");
        
// ----------------------------------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------------------------------------
             
//      								       					NAVIGATION TIMING API:
        
        System.out.println("NAVIGATION TIMING API:");
        System.out.println(((JavascriptExecutor)driver).executeScript("var performance = window.performance || {};" + 
                "var startTiming0 = performance.timing.navigationStart;"+
                "var endTiming0 = performance.timing.loadEventEnd;"+
                "return 'TotalTime: ' + (endTiming0 - startTiming0) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming1 = performance.timing.navigationStart;"+
                "var endTiming1 = performance.timing.redirectStart;"+
                "return 'StartToRedirectTime: ' + (endTiming1 - startTiming1) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming2 = performance.timing.redirectStart;"+
        		"var endTiming2 = performance.timing.redirectEnd;"+
        		"return 'redirectTiming: ' + (endTiming2 - startTiming2) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming3 = performance.timing.fetchStart;"+
        		"var endTiming3 = performance.timing.domainLookupStart;"+
        		"return 'fetchStart: ' + (endTiming3 - startTiming3) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming4 = performance.timing.domainLookupStart;"+
        		"var endTiming4 = performance.timing.domainLookupEnd;"+
        		"return 'DNS LookupTime: ' + (endTiming4 - startTiming4) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming5 = performance.timing.connectStart;"+
        		"var endTiming5 = performance.timing.connectEnd;"+
        		"return 'connectTime: ' + (endTiming5 - startTiming5) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming6 = performance.timing.requestStart;"+
                "var endTiming6 = performance.timing.responseStart;"+
                "return 'requestTime: ' + (endTiming6 - startTiming6) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming7 = performance.timing.responseStart;"+
                "var endTiming7 = performance.timing.responseEnd;"+
                "return 'responseTime: ' + (endTiming7 - startTiming7) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming8 = performance.timing.domLoading;"+
                "var endTiming8 = performance.timing.domComplete;"+
                "return 'domLoading ' + (endTiming8 - startTiming8) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming9 = performance.timing.loadEventStart;"+
                "var endTiming9 = performance.timing.loadEventEnd;"+
                "return 'Load Event: ' + (endTiming9 - startTiming9) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming10 = performance.timing.domContentLoadedEventStart;"+
                "var endTiming10 = performance.timing.domContentLoadedEventEnd;"+
                "return 'domContentLoaded: ' + (endTiming10 - startTiming10) + 'ms';"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var startTiming11 = performance.timing.unloadEventStart;"+
                "var endTiming11 = performance.timing.unloadEventEnd;"+
                "return 'Unload Event: ' + (endTiming11 - startTiming11) + 'ms';"));
        
// ----------------------------------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------------------------------------------------------------------------------------------------------
        
// 								       					RESOURCE TIMING API:

        
        System.out.println("\nRESOURCE TIMING API:");
        System.out.println(((JavascriptExecutor)driver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
        		"var startTiming0 = resourceList[0].redirectStart;"+
        		"var endTiming0 = resourceList[0].redirectEnd;"+
        		"return 'Redirect Time: ' + (endTiming0 - startTiming0) + 'ms'"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
        		"var startTiming1 = resourceList[0].fetchStart;"+
        		"var endTiming1 = resourceList[0].domainLookupStart;"+
        		"return 'App Cache Time: ' + (endTiming1 - startTiming1) + 'ms'"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
        		"var startTiming2 = resourceList[0].domainLookupStart;"+
        		"var endTiming2 = resourceList[0].domainLookupEnd;"+
        		"return 'DNS Time: ' + (endTiming2 - startTiming2) + 'ms'"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
        		"var startTiming3 = resourceList[0].connectStart;"+
        		"var endTiming3 = resourceList[0].connectEnd;"+
        		"return 'TCP Time: ' + (endTiming3 - startTiming3) + 'ms'"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
        		"var startTiming4 = resourceList[0].requestStart;"+
        		"var endTiming4 = resourceList[0].responseStart;"+
        		"return 'Request Time: ' + ((endTiming4 - startTiming4).toFixed(2)) + 'ms'"));
        System.out.println(((JavascriptExecutor)driver).executeScript("var resourceList = window.performance.getEntriesByType('resource') || {};"+
        		"var startTiming5 = resourceList[0].responseStart;"+
        		"var endTiming5 = resourceList[0].responseEnd;"+
        		"return 'Response Time: ' + ((endTiming5 - startTiming5).toFixed(2)) + 'ms'"));
        
        Thread.sleep(5000);
        
        //Query and fill Username
        WebElement usernameQuery = driver.findElement(By.xpath(".//*[@id='emailId']"));
        usernameQuery.sendKeys("mockgeyser.slave@gmail.com");
        
        //Query and fill Password
        WebElement passwordQuery = driver.findElement(By.xpath(".//*[@id='password']"));
        passwordQuery.sendKeys("DASHBOARD1234");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}

