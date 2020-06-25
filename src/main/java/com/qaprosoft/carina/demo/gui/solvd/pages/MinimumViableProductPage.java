package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinimumViableProductPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MinimumViableProductPage.class);

    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//ul[@class='s-mvp__features-list _hide']/li[2]/div")
    private ExtendedWebElement teamOfExpertsItem;
    @FindBy(xpath = "//img[@src='./images/mvp-yellow-1.jpg']")
    private ExtendedWebElement teamOfExpertsDetailFirstImage;

    public MinimumViableProductPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public void openTeamOfExpertsDetail() {
        teamOfExpertsItem.click();
    }

    public boolean isTeamOfExpertsDetailFirstImageVisible() {
        return teamOfExpertsDetailFirstImage.isVisible(2);
    }

    @Override
    public boolean isPageOpened() {
        return driver.getCurrentUrl().equals("https://www.solvd.com/services/minimum-viable-product.html");
    }
}
