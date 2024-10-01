package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomeApplicationPage;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomeApplicationPage homeApplicationPage;
    private Wait<WebDriver> wait; // Declare the wait variable here

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        // Set up WebDriver (modify the path to match your local setup)
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Initialize the WebDriverWait with a timeout of 2 seconds
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        
        // Open the login page
        driver.get("http://localhost:4200/#/login"); // Adjust the URL as needed
        
        // Initialize the LoginPage and HomeApplicationPage object
        loginPage = new LoginPage(driver);
        homeApplicationPage = new HomeApplicationPage(driver);
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Enter valid credentials
        loginPage.enterUsername("luna.moon@maif.com");
        loginPage.enterPassword("123");
    }

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {
        // Click the login button
        loginPage.clickLogin();
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        // Use the wait to check for the welcome message
        boolean isTextPresent = wait.until(d -> homeApplicationPage.getWelcomeMessage().contains("Welcome to the System!"));
        Assert.assertTrue(isTextPresent, "The welcome message was not displayed as expected.");

        // Close the browser after the test
        driver.quit();
    }
}
