package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkPage extends AbstractPage {
    private static final Logger LOGGER = Logger.getLogger(WorkPage.class);

    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//ul[@class='l-projects']/li")
    private List<ExtendedWebElement> projectsList;

    public WorkPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public FitnessCompanyPage openFitnessCompanyPage() {
        for (ExtendedWebElement projectItem: projectsList) {
            ExtendedWebElement fiveQualitySolutionsForAppsMarketDominanceArticle =
                    projectItem.findExtendedWebElement(By.xpath("//a[contains(@href, 'fitness-company')]"));
            if (fiveQualitySolutionsForAppsMarketDominanceArticle != null) {
                fiveQualitySolutionsForAppsMarketDominanceArticle.click();
                return new FitnessCompanyPage(getDriver());
            }
        }
        LOGGER.info("Fitness company page wasn't found!");
        return null;
    }

    public FinanceCompanyPage openFinanceCompanyPage() {
        for (ExtendedWebElement projectItem: projectsList) {
            ExtendedWebElement automatedQAInAccuracyAndCriticalFinTechEnvironmentArticle =
                    projectItem.findExtendedWebElement(By.xpath("//a[contains(@href, 'finance-company')]"));
            if (automatedQAInAccuracyAndCriticalFinTechEnvironmentArticle != null) {
                automatedQAInAccuracyAndCriticalFinTechEnvironmentArticle.click();
                return new FinanceCompanyPage(getDriver());
            }
        }
        LOGGER.info("Finance company page wasn't found!");
        return null;
    }

    @Override
    public boolean isPageOpened() {
        return driver.getCurrentUrl().equals("https://www.solvd.com/work.html");
    }
}
