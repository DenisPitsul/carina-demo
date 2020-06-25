package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.BlogHeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoNotMarryTesterPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(DoNotMarryTesterPage.class);

    @FindBy(xpath = "//div[@class='t-header']")
    private BlogHeaderMenu blogHeaderMenu;

    @FindBy(xpath = "//h1[@field='title']")
    private ExtendedWebElement title;

    public DoNotMarryTesterPage(WebDriver driver) {
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
        return driver.getCurrentUrl().equals("https://blog.solvd.com/james_bach");
    }
}
