package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.BlogHeaderMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlogPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(BlogPage.class);

    @FindBy(xpath = "//div[@class='t-header']")
    private BlogHeaderMenu blogHeaderMenu;

    @FindBy(xpath = "//div[@class='t838__blockinput']//input")
    private ExtendedWebElement searchInput;
    @FindBy(xpath = "//div[@class='t-site-search-dm__result'][1]")
    private ExtendedWebElement firstElementInDropDownAfterSearchInput;
    @FindBy(xpath = "//a[@class='tn-atom' and @href='/carina']")
    private ExtendedWebElement carinaItem;
    @FindBy(xpath = "//a[@href='/james_bach']//div[@class='t404__imgbox']")
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
        firstElementInDropDownAfterSearchInput.click();
        return new TestAutomationBlogPage(driver);
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
        return driver.getCurrentUrl().equals("https://blog.solvd.com/");
    }
}
