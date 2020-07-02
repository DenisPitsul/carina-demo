package com.qaprosoft.carina.demo.gui.solvd.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.solvd.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.solvd.components.HeaderMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareersPage extends AbstractPage {
    @FindBy(xpath = "//header[@class='s-header']")
    private HeaderMenu headerMenu;
    @FindBy(xpath = "//footer[@class='s-footer']")
    private FooterMenu footerMenu;

    @FindBy(xpath = "//h4[contains(text(), Current vacancies)]")
    private ExtendedWebElement bodyTitle;

    @FindBy(xpath = "//ul[@class='l-vacancies']/li")
    private List<ExtendedWebElement> vacanciesList;

    private final By vacancyButtonLocator = By.tagName("button");
    private final By vacancyDetailBlockLocator = By.xpath("//div[@class='l-vacancies__inner']");

    public CareersPage(WebDriver driver) {
        super(driver);
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

    public void openFirstVacancy() {
        ExtendedWebElement firstVacancyButton = vacanciesList.get(0).findExtendedWebElement(vacancyButtonLocator);
        if (firstVacancyButton != null) {
            firstVacancyButton.click();
        }
    }

    public boolean isFirstVacancyDetailBlockVisible() {
        ExtendedWebElement firstVacancyDetailBlock = vacanciesList.get(0).findExtendedWebElement(vacancyDetailBlockLocator);
        if (firstVacancyDetailBlock != null) {
            return firstVacancyDetailBlock.isVisible(2);
        }
        return false;
    }

    @Override
    public boolean isPageOpened() {
        return bodyTitle != null;
    }
}
