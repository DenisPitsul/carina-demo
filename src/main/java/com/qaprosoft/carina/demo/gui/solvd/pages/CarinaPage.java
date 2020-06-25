package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.BlogHeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarinaPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(CarinaPage.class);

    @FindBy(xpath = "//div[@class='t-header']")
    private BlogHeaderMenu blogHeaderMenu;

    @FindBy(xpath = "//div[@class='t-container']//div[1]/a/div[@class='t404__imgbox']")
    private ExtendedWebElement bestAutomationFrameworksArticle;

    public CarinaPage(WebDriver driver) {
        super(driver);
    }

    public BestAutomationFrameworksArticlePage openBestAutomationFrameworksArticle() {
        bestAutomationFrameworksArticle.click();
        return new BestAutomationFrameworksArticlePage(driver);
    }

    public BlogHeaderMenu getBlogHeaderMenu() {
        return blogHeaderMenu;
    }

    @Override
    public boolean isPageOpened() {
        return driver.getCurrentUrl().equals("https://blog.solvd.com/carina");
    }

}
