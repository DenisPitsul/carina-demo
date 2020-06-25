package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FitnessCompanyPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(FitnessCompanyPage.class);

    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//section[@class='s-intro']//h1")
    private ExtendedWebElement title;

    public FitnessCompanyPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public String getTitleText() {
        return title.getText();
    }

    @Override
    public boolean isPageOpened() {
        return driver.getCurrentUrl().equals("https://www.solvd.com/projects/fitness-company.html");
    }
}
