package comtrello.genricutility;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {

	public Actions act;

	public WebDriverUtility(WebDriver driver)
	{
		act = new Actions(driver);
	}
	
	public void dragAndDrop(WebElement src, WebElement target)
	{
		act.dragAndDrop(src, target).perform();
	}
	
	public void mouseHoverOnElement(WebElement element)
	{
		act.moveToElement(element).perform();
	}
	
	public void clickAndHold(WebElement element)
	{
		act.moveToElement(element).perform();
	}
	
	public void switchTOWindowByUrl(WebDriver driver, String url)
	{
		Set<String> allid = driver.getWindowHandles();
		
		for (String id : allid)
		{
			String actUrl = driver.switchTo().window(id).getCurrentUrl();
			if(actUrl.contains(url))
			{
				driver.close();
			}
		}
	}
	
	public void switchTOWindowByTitle(WebDriver driver, String title)
	{
		Set<String> allid = driver.getWindowHandles();
		
		for (String id : allid)
		{
			String actTitle = driver.switchTo().window(id).getCurrentUrl();
			if(actTitle.contains(title))
			{
				driver.close();
			}
		}
	}
	
	public WebDriver switchToFrame(WebDriver driver, int index)
	{
		return driver.switchTo().frame(index);
	}
	
	public WebDriver switchToFrame(WebDriver driver, String nameOrId)
	{
		return driver.switchTo().frame(nameOrId);
	}
	
	public WebDriver switchToFrame(WebDriver driver, WebElement frameElement)
	{
		return driver.switchTo().frame(frameElement);
	}
	
	public  Alert switchToAlert(WebDriver driver)
	{
		return driver.switchTo().alert();
	}
	
	
	

}
