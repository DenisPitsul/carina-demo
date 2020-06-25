package com.qaprosoft.carina.demo.gui.solvd.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.solvd.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeaderMenu extends AbstractUIObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(HeaderMenu.class);

    @FindBy(xpath = "//a[@class='s-header__logo-link']")
    private ExtendedWebElement homeButton;
    @FindBy(xpath = "//ul[@class='m-primary__list']/li[1]/a")
    private ExtendedWebElement workItem;
    @FindBy(xpath = "//ul[@class='m-primary__list']/li[2]/div")
    private ExtendedWebElement servicesItem;
    @FindBy(xpath = "//ul[@class='m-primary__list']/li[3]/div")
    private ExtendedWebElement productsItem;
    @FindBy(xpath = "//ul[@class='m-primary__list']/li[4]/a")
    private ExtendedWebElement teamItem;
    @FindBy(xpath = "//ul[@class='m-primary__list']/li[5]/a")
    private ExtendedWebElement careersItem;
    @FindBy(xpath = "//ul[@class='m-primary__list']/li[6]/a")
    private ExtendedWebElement blogItem;
    @FindBy(xpath = "//div[@class='s-header__actions']")
    private ExtendedWebElement contactUsButton;

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
        servicesItem.hover();
        ExtendedWebElement serviceMobileApplicationDevelopment =
                servicesItem.findExtendedWebElement(By.xpath("//ul[@class='m-primary__dropdown-list']/li[3]/a"));
        serviceMobileApplicationDevelopment.click();
        return new MobileApplicationDevelopmentPage(driver);
    }

    public TestAutomationPage openTestAutomationPage() {
        servicesItem.hover();
        ExtendedWebElement serviceTestAutomation =
                servicesItem.findExtendedWebElement(By.xpath("//ul[@class='m-primary__dropdown-list']/li[4]/a"));
        serviceTestAutomation.click();
        return new TestAutomationPage(driver);
    }

    public VrArApplicationsDevelopmentPage openVrArApplicationsDevelopmentPage() {
        servicesItem.hover();
        ExtendedWebElement serviceVrArApplicationsDevelopment =
                servicesItem.findExtendedWebElement(By.xpath("//ul[@class='m-primary__dropdown-list']/li[5]/a"));
        serviceVrArApplicationsDevelopment.click();
        return new VrArApplicationsDevelopmentPage(driver);
    }
}
