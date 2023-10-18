package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class regform {
WebDriver driver;
 @Given("user on the registration form")
public void user_on_the_registration_form() {
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\Desktop\\\\Automation\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	 
    
}

@When("user enter the registration form page")
public void user_enter_the_registration_form_page() {
	driver = new ChromeDriver();
	driver.get("https://stqatools.com/demo/Register.php");
    
}

@When("user enter name")
public void user_enter_name() {
	WebElement name = driver.findElement(By.id("name"));
	name.sendKeys("Filda");
}
@When("user enter address")
public void user_enter_address() {
	WebElement address= driver.findElement(By.id("address"));
	address.sendKeys("Rosevila,Kochi,Pincode-682506");
}
@When("user select gender")
public void user_select_gender() {
	WebElement gender = driver.findElement(By.id("female"));
	gender.click();
    
  
}

@When("user select hobbies")
public void user_select_hobbies() {
	WebElement reading = driver.findElement(By.id("reading"));
	reading.click();
	WebElement music = driver.findElement(By.id("music"));
	music.click();
    
}

@When("user select country")
public void user_select_country() {
	Select country = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
	country.selectByValue("Canada");
    
}

@When("user select city")
public void user_select_city() {
	Select city = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/select[2]")));
	city.selectByVisibleText("Toronto");  
}

@When("user enter dob")
public void user_enter_dob() {
    
}

@Then("user click on submit button it should be successful")
public void user_click_on_submit_button_it_should_be_successful() {

	WebElement submit = driver.findElement(By.xpath("//*[@id=\"registration-form\"]/button"));
	submit.click();
  
}
}