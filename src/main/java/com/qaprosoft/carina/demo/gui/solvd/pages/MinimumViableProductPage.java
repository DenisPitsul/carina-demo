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

public class MinimumViableProductPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MinimumViableProductPage.class);

    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//div[@class='s-intro__badge']")
    private ExtendedWebElement topLabel;
    @FindBy(xpath = "//ul[@class='s-mvp__features-list _hide']/li")
    private List<ExtendedWebElement> possibilitiesList;
    @FindBy(xpath = "//img[@src='./images/mvp-yellow-1.jpg']")
    private ExtendedWebElement teamOfExpertsDetailFirstImage;

    private final By teamOfExpertsItemLocator = By.xpath("//p[contains(text(), 'A team of experts')]//parent::div");

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
        for (ExtendedWebElement possibilityItem: possibilitiesList) {
            ExtendedWebElement teamOfExpertsItem = possibilityItem.findExtendedWebElement(teamOfExpertsItemLocator);
            if (teamOfExpertsItem != null) {
                teamOfExpertsItem.click();
                break;
            }
        }
        LOGGER.info("Team of expert item wasn't found!");
    }

    public boolean isTeamOfExpertsDetailFirstImageVisible() {
        return teamOfExpertsDetailFirstImage.isVisible(2);
    }

    @Override
    public boolean isPageOpened() {
        return topLabel != null;
    }
}
