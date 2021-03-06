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

public class MindAppTesting{ 
	public static void main(String[] args) throws Exception {

		try
		{

			System.setProperty("webdriver.chrome.driver", "//Users/mindtap/Desktop/Selenium1/chromedriver");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("-incognito");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			WebDriver ghostdriver = new ChromeDriver(capabilities);
			
			ghostdriver.get("https://login.cengage.com/");
			WebElement usernameQuery = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='emailId']")));
			usernameQuery.sendKeys("mockgeyser.slave@gmail.com");
			WebElement passwordQuery = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='password']")));
			passwordQuery.sendKeys("DASHBOARD1234");
			WebElement loginButton = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='loginFormId']/input[3]")));
			loginButton.click();
		
			
			Thread.sleep(3000);
			List<WebElement> courseLinks = ghostdriver.findElements(By.className("viewDetailsBtn"));
			courseLinks.get(0).click();	
			Thread.sleep(3000);
			ArrayList<String> tabs = new ArrayList<String> (ghostdriver.getWindowHandles());
			ghostdriver.switchTo().window(tabs.get(1));
			Thread.sleep(4000);
			
			List<WebElement> chapterLinks  = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("lpn_thumbTitle")));
			Random randomChapter = new Random();	
			chapterLinks.get(randomChapter.nextInt(chapterLinks.size())).click();
			Thread.sleep(3000);
			List<WebElement> subChapterLinks  = (new WebDriverWait(ghostdriver, 15)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("lpn_thumbTitle")));
			Random randomSubChapter = new Random();
			subChapterLinks.get(randomSubChapter.nextInt(subChapterLinks.size())).click();
			
			Thread.sleep(3000);
			List <WebElement> mindapps = ghostdriver.findElements(By.className("nb_dockItem"));
			//System.out.println(mindapps.size());
			String iframeId, mindappElement;

			//String idSearchApp = mindapps.get(0).getAttribute("id");

			//mindapps.get(0).click();


			for(int i=0;i < mindapps.size(); i++)
			{
				String idWebElement = mindapps.get(i).getAttribute("id");
				//System.out.println(idWebElement);
				if(idWebElement.equals(new String("app_Search")))  //fooString1.equals(fooString2);
				{
					mindappElement="Search ";
					iframeId = "none";
					mindapps.get(i).click();
					Thread.sleep(3000);
					//System.out.println("clicked search!!");
				}

				if(idWebElement.equals(new String("app_full_book")))
				{
					try
					{
						mindappElement="Full Book ";
						iframeId = "16_NB_Dock_IFrame";
						long startTime = System.currentTimeMillis();
						mindapps.get(i).click();
						WebDriverWait wait = new WebDriverWait(ghostdriver, 15);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("16_NB_App_DockItem")));
						//System.out.println(driver.findElement(By.id("37_NB_Dock_IFrame")));
						//driver.switchTo().defaultContent();
						ghostdriver.switchTo().frame("16_NB_Dock_IFrame");//"37_NB_Dock_IFrame"
						//		        		System.out.println(driver.getTitle());

						wait.until(ExpectedConditions.elementToBeClickable(By.id("help")));
						WebElement e = ghostdriver.findElement(By.id("help"));
						long endTime = System.currentTimeMillis();
						System.out.println("Full Book load time," + (endTime-startTime));
						e.click();
						ghostdriver.switchTo().defaultContent();
						Thread.sleep(3000);
					}
					catch(Exception e)
					{
						System.out.println("Full Book Load Time, 15+");
					}

				}

				if(idWebElement.equals(new String("app_glossary")))
				{
					try
					{
						mindappElement="Glossary";
						iframeId = "299_NB_Dock_IFrame";
						long startTime = System.currentTimeMillis();
						mindapps.get(i).click();
						WebDriverWait wait = new WebDriverWait(ghostdriver, 15);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("299_NB_App_DockItem")));
						//System.out.println(driver.findElement(By.id("37_NB_Dock_IFrame")));

						ghostdriver.switchTo().frame("299_NB_Dock_IFrame");//"37_NB_Dock_IFrame"
						//		        		System.out.println(driver.getTitle());

						wait.until(ExpectedConditions.elementToBeClickable(By.id("A")));
						WebElement e = ghostdriver.findElement(By.id("A"));
						long endTime = System.currentTimeMillis();
						System.out.println("Glossary load time," + (endTime-startTime));
						e.click();
						ghostdriver.switchTo().defaultContent();
						Thread.sleep(3000);
					}
					catch(Exception e)
					{
						System.out.println("Glossary load time, 15+");
					}

				}


				if(idWebElement.equals(new String("app_view_flash_cards")))
				{
					try
					{
						mindappElement="Flash Cards";
						iframeId = "18_NB_Dock_IFrame";
						long startTime = System.currentTimeMillis();
						mindapps.get(i).click();
						WebDriverWait wait = new WebDriverWait(ghostdriver, 15);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("18_NB_App_DockItem")));
						//System.out.println(driver.findElement(By.id("37_NB_Dock_IFrame")));

						ghostdriver.switchTo().frame("18_NB_Dock_IFrame");//"37_NB_Dock_IFrame"
						//		        		System.out.println(driver.getTitle());

						wait.until(ExpectedConditions.elementToBeClickable(By.id("next-card")));
						WebElement e = ghostdriver.findElement(By.id("next-card"));
						long endTime = System.currentTimeMillis();
						System.out.println("Flashcards load time," + (endTime-startTime));
						e.click();
						ghostdriver.switchTo().defaultContent();
						Thread.sleep(3000);
					}
					catch(Exception e)
					{
						System.out.println("Flashcards load time, 15+");
					}

				}

				if(idWebElement.equals(new String("app_selected_text")))
				{
					try
					{
						mindappElement="Merriam-Webster's Dictionary";
						iframeId = "165_NB_Dock_IFrame";
						long startTime = System.currentTimeMillis();
						mindapps.get(i).click();
						WebDriverWait wait = new WebDriverWait(ghostdriver, 15);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("165_NB_App_DockItem")));
						//System.out.println(driver.findElement(By.id("37_NB_Dock_IFrame")));

						ghostdriver.switchTo().frame("165_NB_Dock_IFrame");//"37_NB_Dock_IFrame"
						//		        		System.out.println(driver.getTitle());

						wait.until(ExpectedConditions.elementToBeClickable(By.id("mtdict-logo")));
						WebElement e = ghostdriver.findElement(By.id("mtdict-logo"));
						long endTime = System.currentTimeMillis();
						System.out.println("Dictionary load time," + (endTime-startTime));
						e.click();
						ghostdriver.switchTo().defaultContent();
						Thread.sleep(3000);
					}
					catch(Exception e)
					{
						System.out.println("Dictionary load time, 15+");
					}

				}

				if(idWebElement.equals(new String("app_MyNotes")))
				{
					try
					{
						mindappElement="My Notes";
						iframeId = "2380_NB_Dock_IFrame";
						long startTime = System.currentTimeMillis();
						mindapps.get(i).click();
						WebDriverWait wait = new WebDriverWait(ghostdriver, 15);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("2380_NB_App_DockItem")));
						//System.out.println(driver.findElement(By.id("37_NB_Dock_IFrame")));

						ghostdriver.switchTo().frame("2380_NB_Dock_IFrame");//"37_NB_Dock_IFrame"
						//		        		System.out.println(driver.getTitle());

						wait.until(ExpectedConditions.elementToBeClickable(By.id("203")));
						WebElement e = ghostdriver.findElement(By.id("203"));
						long endTime = System.currentTimeMillis();
						System.out.println("My Notes load time," + (endTime-startTime));
						e.click();
						ghostdriver.switchTo().defaultContent();
						Thread.sleep(3000);
					}
					catch(Exception e)
					{
						System.out.println("My Notes load time, 15+");
					}

				}

			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}