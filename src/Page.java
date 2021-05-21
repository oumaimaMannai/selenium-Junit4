import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Page {
	private WebDriver driver;

	public Page(WebDriver driver) {
		super();
		this.driver = driver;
	} 
	
	public void site() {
		driver.get("http://www.stb.com.tn/en/site/bourse-change/convertisseur-de-devises/");
	}
		
	public void devise(String id, String txt) {
		Select select = new Select(driver.findElement(By.id(id)));					
		select.selectByVisibleText(txt);
	}
	
	public void resultDepart(String nb) {
		driver.findElement(By.id("result-depart")).clear();
		driver.findElement(By.id("result-depart")).sendKeys(nb);			
		driver.findElement(By.id("result-depart")).sendKeys(Keys.ENTER);
	}
	
	public double resultArrivee() {
		return( Double.parseDouble(driver.findElement(By.id("result-arrivee")).getAttribute("value")) );
	}
}