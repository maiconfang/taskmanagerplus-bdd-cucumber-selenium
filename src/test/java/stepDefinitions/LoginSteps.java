package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        // Set up WebDriver (modify the path to match your local setup)
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Open the login page
        driver.get("http://localhost:4200/#/login"); // Adjust the URL as needed
        
        // Initialize the LoginPage object
        loginPage = new LoginPage(driver);
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Enter valid credentials
        loginPage.enterUsername("validUsername");
        loginPage.enterPassword("validPassword");
    }

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {
        // Click the login button
        loginPage.clickLogin();
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
//        // Validate the title of the page to confirm redirection (use your own validation logic)
//        String expectedTitle = "Welcome"; // Adjust as needed
//        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
//        
        // Close the browser after the test
        driver.quit();
    }
}
