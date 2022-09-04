package glueCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	WebDriver driver;
	@Given("^Login page of zero Bank \"(.*)\"$")
	public void openBrowser(String Browser) {
		if(Browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/honey/selenium package/chromedriver");
		driver = new ChromeDriver();
		}
		
		else if(Browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/honey/selenium package/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.get("http://zero.webappsecurity.com/login.html");
	}
	
	@When("^Enter valid username \"(.*)\" and password \"(.*)\" ok$")
	public void enterCredentials(String LoginName, String LoginPassword) {
		driver.findElement(By.id("user_login")).sendKeys(LoginName);
		driver.findElement(By.id("user_password")).sendKeys(LoginPassword);
	}
	
	@And("^click on submit button$")
	public void submitDetail() {
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	
	@Then("^Login is successfull$")
	public void veryfyLogin() {
		driver.close();
		
		
	}

}
