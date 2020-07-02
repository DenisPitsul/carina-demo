package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.BlogHeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BestAutomationFrameworksArticlePage extends AbstractPage {
    @FindBy(xpath = "//div[@class='t-header']")
    private BlogHeaderMenu blogHeaderMenu;

    @FindBy(xpath = "//h1[@field='title']")
    private ExtendedWebElement title;

    public BestAutomationFrameworksArticlePage(WebDriver driver) {
        super(driver);
    }

    public BlogHeaderMenu getBlogHeaderMenu() {
        return blogHeaderMenu;
    }

    public String getTitleText() {
        return title.getText();
    }

    @Override
    public boolean isPageOpened() {
        return title != null;
    }
}
