package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Author: Maicon Fang
 * Date: 2024-09-26
 * Version: 1.0
 */
public class LoginPage {
    WebDriver driver;

    // Element locators using @FindBy
    @FindBy(id = "login_username")
    WebElement usernameField;

    @FindBy(id = "login_password")
    WebElement passwordField;

    @FindBy(id = "login_submit")
    WebElement submitButton;

    @FindBy(id = "login_page_title_label")
    WebElement pageTitle;

    /**
     * Constructor to initialize the WebDriver and page elements.
     *
     * <p>This constructor sets the WebDriver instance and initializes the web 
     * elements using the PageFactory.</p>
     *
     * @param driver the WebDriver instance to be used by this page object
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        submitButton.click();
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    // Method to log in
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
