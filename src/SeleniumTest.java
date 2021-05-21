// Oumaima Mannai , 2 IDL 2

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
	private WebDriver driver; 
	private Page page;
	
	@Before
	public void init() {
		String chromeDriverPath = "E:\\chromedriver.exe" ; 
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");		 
		System.setProperty("webdriver.chrome.driver",chromeDriverPath); 
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--disable-gpu", "--window-size=1920,1200","--ignorecertificate-errors"); 
		//WebDriver driver; 
		driver = new ChromeDriver(options);
		page = new Page(driver);
	}
	
	@Test
	public void script() {		
		if (driver != null) {			
			page.site();			
			page.devise("devise-depart", "EUR");
			page.devise("devise-arrivee", "USD");				
			page.resultDepart("25");
			Assert.assertEquals(30.5696, page.resultArrivee(), 0.0001);	
		}else {
			System.out.println("error");
		}
	}	
	
	@After
	public void quit() {		
		if (driver != null) {
			driver.quit();
		}		
	}

	public SeleniumTest() {
		super();
	}

}
