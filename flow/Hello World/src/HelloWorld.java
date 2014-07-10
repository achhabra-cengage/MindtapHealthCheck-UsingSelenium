
import java.io.*;
import java.util.*;

import javax.script.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
    	
    	// The Firefox driver supports javascript 
        WebDriver driver = new FirefoxDriver();
    		
        // Go to the Google Suggest home page
        driver.get("http://qae-ng.cengage.com/static/nb/login.html");
        
        // Enter the query string "Cheese"
        WebElement usernameQuery = driver.findElement(By.id("_username_id"));
        usernameQuery.sendKeys("sanat.chugh@cengage.com");
        
        // Entry into Username
        WebElement passwordQuery = driver.findElement(By.id("_password_id"));
        passwordQuery.sendKeys("Cengage1");
        
        System.out.println(((JavascriptExecutor)driver).executeScript("var performance = window.performance || {};" + 
                "var startTiming = performance.timing.navigationStart;"+
                "var endTiming = performance.timing.loadEventEnd;"+
                "return (endTiming - startTiming) + 'ms';"));
        
        // Entry into Password
        WebElement searchButton = driver.findElement(By.className("goButton"));
        searchButton.click();
        
        System.out.println(((JavascriptExecutor)driver).executeScript("var performance = window.performance || {};" + 
                "var startTiming = performance.timing.navigationStart;"+
                "var endTiming = performance.timing.loadEventEnd;"+
                "return (endTiming - startTiming) + 'ms';"));
        
        Thread.sleep(5000);
        
        WebElement bookOneLink = driver.findElement(By.xpath(".//*[@id='masters']/div[5]/div[3]/ul[1]/li[1]/div/div[4]/a"));
        bookOneLink.click();
        
        System.out.println(((JavascriptExecutor)driver).executeScript("var performance = window.performance || {};" + 
                "var startTiming = performance.timing.navigationStart;"+
                "var endTiming = performance.timing.loadEventEnd;"+
                "return (endTiming - startTiming) + 'ms';"));
        
    }
}

