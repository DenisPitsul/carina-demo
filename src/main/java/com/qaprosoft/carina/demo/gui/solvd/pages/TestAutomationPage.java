package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestAutomationPage extends AbstractPage {
    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//section[@class='s-info']//p")
    private ExtendedWebElement textInfo;

    public TestAutomationPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public void playClientReviewVideo() {
        WebElement webElement = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/80TRe07Hyi0']"));
        getDriver().switchTo().frame(webElement).findElement(By.xpath("//div[@class='ytp-cued-thumbnail-overlay']/button")).click();
    }

    @Override
    public boolean isPageOpened() {
        return textInfo != null;
    }
}
