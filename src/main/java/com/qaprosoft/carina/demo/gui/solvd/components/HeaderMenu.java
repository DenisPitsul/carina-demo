package com.qaprosoft.carina.demo.gui.solvd.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.solvd.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HeaderMenu extends AbstractUIObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(HeaderMenu.class);

    @FindBy(xpath = "//a[@class='s-header__logo-link']")
    private ExtendedWebElement homeButton;
    @FindBy(xpath = "//a[contains(@href, '/work.html')]")
    private ExtendedWebElement workItem;
    @FindBy(xpath = "//span[contains(@data-title, 'Services')]//parent::div")
    private ExtendedWebElement servicesItem;
    @FindBy(xpath = "//span[contains(@data-title, 'Products')]//parent::div")
    private ExtendedWebElement productsItem;
    @FindBy(xpath = "//a[contains(@data-title, 'Team')]")
    private ExtendedWebElement teamItem;
    @FindBy(xpath = "//a[contains(@href, 'careers')]")
    private ExtendedWebElement careersItem;
    @FindBy(xpath = "//a[contains(@href, 'blog')]")
    private ExtendedWebElement blogItem;
    @FindBy(xpath = "//a[contains(@href, 'contact-us')]")
    private ExtendedWebElement contactUsButton;

    private final By servicesSubItemsListLocator = By.xpath("//span[contains(@data-title, 'Services')]//following-sibling::div/ul/li");

    public HeaderMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public WorkPage openWorkPage() {
        workItem.click();
        return new WorkPage(driver);
    }

    public CareersPage openCareersPage() {
        careersItem.click();
        return new CareersPage(driver);
    }

    public AboutUsPage openTeamPage() {
        teamItem.click();
        return new AboutUsPage(driver);
    }

    public BlogPage openBlogPage() {
        blogItem.click();
        return new BlogPage(driver);
    }

    public MobileApplicationDevelopmentPage openMobileApplicationDevelopmentPage() {
        List<ExtendedWebElement> servicesSubItemsList = findExtendedWebElements(servicesSubItemsListLocator);
        servicesItem.hover();
        for (ExtendedWebElement servicesSubItem: servicesSubItemsList) {
            ExtendedWebElement serviceMobileApplicationDevelopment =
                    servicesSubItem.findExtendedWebElement(By.xpath("//a[contains(@href, 'mobile-applications-development')]"));
            if (serviceMobileApplicationDevelopment != null) {
                serviceMobileApplicationDevelopment.click();
                return new MobileApplicationDevelopmentPage(driver);
            }
        }
        LOGGER.info("Mobile applications development page wasn't found!");
        return null;
    }

    public TestAutomationPage openTestAutomationPage() {
        List<ExtendedWebElement> servicesSubItemsList = findExtendedWebElements(servicesSubItemsListLocator);
        servicesItem.hover();
        for (ExtendedWebElement servicesSubItem: servicesSubItemsList) {
            ExtendedWebElement serviceTestAutomation =
                    servicesSubItem.findExtendedWebElement(By.xpath("//a[contains(@href, 'test-automation')]"));
            if (serviceTestAutomation != null) {
                serviceTestAutomation.click();
                return new TestAutomationPage(driver);
            }
        }
        LOGGER.info("Test automation page wasn't found!");
        return null;
    }

    public VrArApplicationsDevelopmentPage openVrArApplicationsDevelopmentPage() {
        List<ExtendedWebElement> servicesSubItemsList = findExtendedWebElements(servicesSubItemsListLocator);
        servicesItem.hover();
        for (ExtendedWebElement servicesSubItem: servicesSubItemsList) {
            ExtendedWebElement serviceVrArApplicationsDevelopment =
                    servicesSubItem.findExtendedWebElement(By.xpath("//a[contains(@href, 'vr-ar-application-development')]"));
            if (serviceVrArApplicationsDevelopment != null) {
                serviceVrArApplicationsDevelopment.click();
                return new VrArApplicationsDevelopmentPage(driver);
            }
        }
        LOGGER.info("Vr / Ar application development page page wasn't found!");
        return null;
    }
}
