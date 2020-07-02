package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MobileApplicationDevelopmentPage extends AbstractPage {
    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//p[@class='b-description__content-inner']")
    private ExtendedWebElement textInfo;
    @FindBy(xpath = "//div[@class='b-cta__actions']/a")
    private ExtendedWebElement getQuoteTodayButton;

    public MobileApplicationDevelopmentPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public ContactUsPage openContactUsPage() {
        getQuoteTodayButton.click();
        return new ContactUsPage(driver);
    }

    @Override
    public boolean isPageOpened() {
        return textInfo != null;
    }
}
