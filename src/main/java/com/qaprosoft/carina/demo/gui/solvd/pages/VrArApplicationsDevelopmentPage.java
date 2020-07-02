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

public class VrArApplicationsDevelopmentPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(VrArApplicationsDevelopmentPage.class);

    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//h4[contains(text(), 'VR/AR apps for various industries')]")
    private ExtendedWebElement vrArAppsTitle;

    @FindBy(xpath = "//ul[@class='l-projects _centered']/li")
    private List<ExtendedWebElement> projectsList;

    private final By learningManagementSystemWithMultiplayerLinkLocator = By.xpath("//a[contains(@href, 'tripointlab')]");

    public VrArApplicationsDevelopmentPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public LearningManagementSystemWithMultiplayerForVrArPage openLearningManagementSystemWithMultiplayerPage() {
        for (ExtendedWebElement projectItem: projectsList) {
            ExtendedWebElement learningManagementSystemWithMultiplayerLink =
                    projectItem.findExtendedWebElement(learningManagementSystemWithMultiplayerLinkLocator);
            if (learningManagementSystemWithMultiplayerLink != null) {
                learningManagementSystemWithMultiplayerLink.click();
                return new LearningManagementSystemWithMultiplayerForVrArPage(driver);
            }
        }
        LOGGER.info("Learning management system with multiplayer for VR / AR page wasn't found!");
        return null;
    }

    @Override
    public boolean isPageOpened() {
        return vrArAppsTitle != null;
    }
}
