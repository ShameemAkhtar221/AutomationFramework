package main.pageEvents.ADMIN;

import main.utils.FetchElement;
import main.utils.Locator;
import org.openqa.selenium.WebDriver;

import static main.pageObjects.ADMIN.DashboardElements.sideVenues;

public class DashboardEvents {

    public WebDriver driver;
    FetchElement fetchElement;

    public DashboardEvents(WebDriver driver) {
        this.driver = driver;
        fetchElement = new FetchElement(driver);
    }

    public void clickOnVenuesModule() {
        fetchElement.getWebElement(Locator.XPath, sideVenues).click();
    }
}
