package pages;

import org.openqa.selenium.WebDriver;

/**
 * @author Maicon Fang
 * @version 1.0
 * @Description: Managing page objects for a web system
 */
public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}


}
