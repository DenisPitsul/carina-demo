package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.BlogHeaderMenu;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends AbstractPage {
    private static final Logger LOGGER = Logger.getLogger(BlogPage.class);

    @FindBy(xpath = "//div[@class='t-header']")
    private BlogHeaderMenu blogHeaderMenu;

    @FindBy(xpath = "//div[@class='t838__blockinput']//input")
    private ExtendedWebElement searchInput;
    @FindBy(xpath = "//div[@class='t-site-search-dm__result'][1]")
    private ExtendedWebElement firstElementInDropDownAfterSearchInput;
    @FindBy(xpath = "//a[@href='/carina']")
    private ExtendedWebElement carinaItem;
    @FindBy(xpath = "//a[@href='/james_bach']")
    private ExtendedWebElement doNotMarryTesterLink;

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public BlogHeaderMenu getBlogHeaderMenu() {
        return blogHeaderMenu;
    }

    public void typeTextToSearchInput(String text) {
        searchInput.type(text);
    }

    public TestAutomationBlogPage openTestAutomationBlogPage() {
        if (firstElementInDropDownAfterSearchInput.isVisible(2)) {
            firstElementInDropDownAfterSearchInput.click();
            return new TestAutomationBlogPage(driver);
        }
        LOGGER.info("Test automation blog page wasn't found!");
        return null;
    }

    public CarinaPage openCarinaPage() {
        carinaItem.click();
        return new CarinaPage(driver);
    }

    public DoNotMarryTesterPage openDoNotMarryTesterArticle() {
        doNotMarryTesterLink.click();
        return new DoNotMarryTesterPage(driver);
    }

    @Override
    public boolean isPageOpened() {
        return searchInput != null;
    }
}
