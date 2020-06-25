package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.BlogHeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class TestAutomationBlogPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlogPage.class);

    @FindBy(xpath = "//div[@class='t-header']")
    private BlogHeaderMenu blogHeaderMenu;

    @FindBy(xpath = "//h2[@class='s-404__subtitle _primary _fwlight']")
    private ExtendedWebElement subTitle;

    public TestAutomationBlogPage(WebDriver driver) {
        super(driver);
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
    }

    public BlogHeaderMenu getBlogHeaderMenu() {
        return blogHeaderMenu;
    }

    public String getSubTitleText() {
        return subTitle.getText();
    }

    @Override
    public boolean isPageOpened() {
        return driver.getCurrentUrl().equals("https://www.solvd.com/test-automation");
    }
}
