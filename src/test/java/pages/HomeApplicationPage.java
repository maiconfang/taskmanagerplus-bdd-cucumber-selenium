package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: Maicon Fang
 * Date: 2024-09-27
 * Version: 1.0
 */
public class HomeApplicationPage {
    WebDriver driver;

    // Locator for the welcome message
    @FindBy(id = "application_welcome")
    private WebElement welcomeMessage;

    // Locator for the logged-in user
    @FindBy(id = "application_user_logged")
    private WebElement userLogged;

    /**
     * Constructor to initialize the WebDriver and page elements.
     *
     * <p>This constructor sets the WebDriver instance and initializes the web 
     * elements using the PageFactory.</p>
     *
     * @param driver the WebDriver instance to be used by this page object
     */
    public HomeApplicationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to get the text of the welcome message
    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    // Method to get the name of the logged-in user
    public String getUserLogged() {
        return userLogged.getText();
    }
}
