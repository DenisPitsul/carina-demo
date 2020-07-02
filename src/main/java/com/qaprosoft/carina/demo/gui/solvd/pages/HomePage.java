package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HomePage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);

    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//ul[@class='l-anti-crisis']/li")
    private List<ExtendedWebElement> antiCrisisList;

    private final By getMVPInJustTwoMonthsLinkLocator = By.xpath("//a[@href='./services/minimum-viable-product.html']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MinimumViableProductPage openMinimumViableProductPage() {
        for (ExtendedWebElement antiCrisisItem: antiCrisisList) {
            ExtendedWebElement getMVPInJustTwoMonthsLink =
                    antiCrisisItem.findExtendedWebElement(getMVPInJustTwoMonthsLinkLocator);
            if (getMVPInJustTwoMonthsLink != null) {
                getMVPInJustTwoMonthsLink.click();
                return new MinimumViableProductPage(driver);
            }
        }
        LOGGER.info("Get MVP in just two months element wasn't found!");
        return null;
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }
}
