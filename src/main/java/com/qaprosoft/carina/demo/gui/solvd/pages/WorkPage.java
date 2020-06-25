package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WorkPage extends AbstractPage {
    private static final Logger LOGGER = Logger.getLogger(WorkPage.class);

    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//ul[@class='l-projects']/li[1]/a")
    private ExtendedWebElement fiveQualitySolutionsForAppsMarketDominanceArticle;
    @FindBy(xpath = "//ul[@class='l-projects']/li[5]/a")
    private ExtendedWebElement automatedQAInAccuracyAndCriticalFinTechEnvironmentArticle;

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
        fiveQualitySolutionsForAppsMarketDominanceArticle.click();
        return new FitnessCompanyPage(driver);
    }

    public FinanceCompanyPage openFinanceCompanyPage() {
        automatedQAInAccuracyAndCriticalFinTechEnvironmentArticle.click();
        return new FinanceCompanyPage(driver);
    }

    @Override
    public boolean isPageOpened() {
        return driver.getCurrentUrl().equals("https://www.solvd.com/work.html");
    }
}
