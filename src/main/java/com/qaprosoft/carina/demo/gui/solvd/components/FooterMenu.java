package com.qaprosoft.carina.demo.gui.solvd.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.solvd.pages.InstagramSolvdGlobalPage;
import com.qaprosoft.carina.demo.gui.solvd.pages.YoutubeSolvdIncPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterMenu extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='s-footer__socials _desktop']//a[contains(@href, 'instagram')]")
    private ExtendedWebElement instagramLink;
    @FindBy(xpath = "//div[@class='s-footer__socials _desktop']//a[contains(@href, 'youtube')]")
    private ExtendedWebElement youtubeLink;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public InstagramSolvdGlobalPage openInstagramPage() {
        instagramLink.click();
        return new InstagramSolvdGlobalPage(driver);
    }

    public YoutubeSolvdIncPage openYoutubePage() {
        youtubeLink.click();
        return new YoutubeSolvdIncPage(driver);
    }
}
