package com.qaprosoft.carina.demo.gui.solvd.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.solvd.pages.CareersApplyPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SeniorAndroidDeveloperVacancyDetail extends AbstractUIObject {

    @FindBy(xpath = "//li[3]//div[@class='l-vacancies__apply']")
    private ExtendedWebElement applyButton;

    public SeniorAndroidDeveloperVacancyDetail(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CareersApplyPage openCareersApply() {
        applyButton.click();
        return new CareersApplyPage(driver);
    }
}
