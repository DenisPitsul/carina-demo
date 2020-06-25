package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.SeniorAndroidDeveloperVacancyDetail;
import com.qaprosoft.carina.demo.gui.solvd.components.TestAutomationEngineerVacancyDetail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CareersPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(CareersPage.class);

    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//ul[@class='l-vacancies']/li[1]//button")
    private ExtendedWebElement testAutomationEngineerVacancyButton;
    @FindBy(xpath = "//ul[@class='l-vacancies']/li[1]//button//following-sibling::div[@class='l-vacancies__inner']")
    TestAutomationEngineerVacancyDetail testAutomationEngineerVacancyDetail;

    @FindBy(xpath = "//ul[@class='l-vacancies']/li[3]//button")
    private ExtendedWebElement seniorAndroidDeveloperVacancyButton;
    @FindBy(xpath = "//ul[@class='l-vacancies']/li[3]//button//following-sibling::div[@class='l-vacancies__inner']")
    SeniorAndroidDeveloperVacancyDetail seniorAndroidDeveloperVacancyDetail;

    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public SeniorAndroidDeveloperVacancyDetail openSeniorAndroidDeveloperVacancy() {
        seniorAndroidDeveloperVacancyButton.click();
        return seniorAndroidDeveloperVacancyDetail;
    }

    public TestAutomationEngineerVacancyDetail openTestAutomationEngineerVacancy() {
        testAutomationEngineerVacancyButton.click();
        return testAutomationEngineerVacancyDetail;
    }

    @Override
    public boolean isPageOpened() {
        return driver.getCurrentUrl().equals("https://www.solvd.com/careers.html");
    }
}
