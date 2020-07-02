package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.BlogHeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CarinaPage extends AbstractPage {
    @FindBy(xpath = "//div[@class='t-header']")
    private BlogHeaderMenu blogHeaderMenu;

    @FindBy(xpath = "//a[contains(@href, '10-best-open-source-test-automation-frameworks-for-every-purpose')]")
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
        return bestAutomationFrameworksArticle != null;
    }

}
