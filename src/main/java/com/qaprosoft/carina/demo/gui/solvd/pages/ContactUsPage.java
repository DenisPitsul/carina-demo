package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactUsPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactUsPage.class);

    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//section[@class='s-default s-contact__step _step-1 _lighter _pt70 _pb120']//h4[@class='s-default__title _primary _fwsemibold _centered']")
    private ExtendedWebElement contactUsFormTitle;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public String getContactUsFormTitleText() {
        return contactUsFormTitle.getText();
    }

    @Override
    public boolean isPageOpened() {
        return driver.getCurrentUrl().equals("https://www.solvd.com/contact-us.html");
    }
}
