package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.demo.gui.solvd.components.SubscribeDialog;
import com.qaprosoft.carina.demo.gui.solvd.helpers.TestData;
import com.qaprosoft.carina.demo.gui.solvd.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SolvdTest extends AbstractTest {

    @Test(description = "AUTO-0001")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P1)
    public void verificationFitnessCompany() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        WorkPage workPage = homePage.getHeaderMenu().openWorkPage();
        Assert.assertTrue(workPage.isPageOpened(), "Work page is not opened!");

        FitnessCompanyPage fitnessCompanyPage = workPage.openFitnessCompanyPage();
        Assert.assertTrue(fitnessCompanyPage.isPageOpened(), "Fitness company page is not opened!");

        Assert.assertEquals(fitnessCompanyPage.getTitleText(), "5 Quality solutions for APPs’ market dominance");
    }

    @Test(description = "AUTO-0002")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P3)
    public void watchSolvdIncClientReview() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        TestAutomationPage testAutomationPage = homePage.getHeaderMenu().openTestAutomationPage();
        Assert.assertTrue(testAutomationPage.isPageOpened(), "Test automation page is not opened!");

        testAutomationPage.playClientReviewVideo();
    }

    @Test(description = "AUTO-0003")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P2)
    public void openInstagramSolvdGlobal() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        InstagramSolvdGlobalPage instagramSolvdGlobalPage = homePage.getFooterMenu().openInstagramPage();
        Assert.assertTrue(instagramSolvdGlobalPage.isPageOpened(), "Instagram solvd global page is not opened!");

        Assert.assertEquals(instagramSolvdGlobalPage.getAccountNameText(), "solvd.global");
    }

    @Test(description = "AUTO-0004")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P1)
    public void verificationFirstVacancy() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        CareersPage careersPage = homePage.getHeaderMenu().openCareersPage();
        Assert.assertTrue(careersPage.isPageOpened(), "Careers page is not opened!");

        careersPage.openFirstVacancy();
        Assert.assertTrue(careersPage.isFirstVacancyDetailBlockVisible());
    }

    @Test(description = "AUTO-0005")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P2)
    public void verificationDoNotMarryTesterArticle() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        BlogPage blogPage = homePage.getHeaderMenu().openBlogPage();
        Assert.assertTrue(blogPage.isPageOpened(), "Blog page is not opened!");

        DoNotMarryTesterPage doNotMarryTesterPage = blogPage.openDoNotMarryTesterArticle();
        Assert.assertTrue(doNotMarryTesterPage.isPageOpened(), "Do not marry tester page is not opened!");

        Assert.assertEquals(doNotMarryTesterPage.getTitleText(), "\"Don't marry a tester!\"\nInterview with James Bach");
    }

    @Test(description = "AUTO-0006")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P2)
    public void verificationSubscriptionInBlog() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        BlogPage blogPage = homePage.getHeaderMenu().openBlogPage();
        Assert.assertTrue(blogPage.isPageOpened(), "Blog page is not opened!");

        SubscribeDialog subscribeDialog = blogPage.getBlogHeaderMenu().openSubscribe();
        subscribeDialog.typeEmail(TestData.EMAIL);
        subscribeDialog.subscribe();

        Assert.assertTrue(subscribeDialog.isSuccessMessageVisible(), "Subscription to blog failed!");
    }

    @Test(description = "AUTO-0007")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P2)
    public void verificationFinanceCompany() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        WorkPage workPage = homePage.getHeaderMenu().openWorkPage();
        Assert.assertTrue(workPage.isPageOpened(), "Work page is not opened!");

        FinanceCompanyPage financeCompanyPage = workPage.openFinanceCompanyPage();
        Assert.assertTrue(financeCompanyPage.isPageOpened(), "Finance company page is not opened!");

        Assert.assertEquals(financeCompanyPage.getTitleText(), "Automated QA in accuracy/critical FinTech environment");
    }

    @Test(description = "AUTO-0008")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P1)
    public void verificationContactUsToDiscussTheProjectForm() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        MobileApplicationDevelopmentPage mobileApplicationDevelopmentPage =
                homePage.getHeaderMenu().openMobileApplicationDevelopmentPage();
        Assert.assertTrue(mobileApplicationDevelopmentPage.isPageOpened(),
                "Mobile application development page is not opened!");

        ContactUsPage contactUsPage = mobileApplicationDevelopmentPage.openContactUsPage();
        Assert.assertTrue(contactUsPage.isPageOpened(), "Contact us page is not opened!");

        Assert.assertEquals(contactUsPage.getContactUsFormTitleText(), "Contact us to discuss the project");
    }

    @Test(description = "AUTO-0009")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P1)
    public void verificationAboutUs() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        AboutUsPage aboutUsPage = homePage.getHeaderMenu().openTeamPage();
        Assert.assertTrue(aboutUsPage.isPageOpened(), "About us page is not opened!");

        Assert.assertEquals(aboutUsPage.getSolvdTeamTitleText(), "Solvd team");
    }

    @Test(description = "AUTO-0010")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P2)
    public void openYoutubeSolvdInc() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        YoutubeSolvdIncPage youtubeSolvdIncPage = homePage.getFooterMenu().openYoutubePage();
        Assert.assertTrue(youtubeSolvdIncPage.isPageOpened(), "Youtube solvd inc page is not opened!");

        Assert.assertEquals(youtubeSolvdIncPage.getChannelNameText(), "Solvd, Inc.");
    }

    @Test(description = "AUTO-0012")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P2)
    public void verificationLearningManagementSystemWithMultiplayerForVrArArticle() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        VrArApplicationsDevelopmentPage vrArApplicationsDevelopmentPage =
                homePage.getHeaderMenu().openVrArApplicationsDevelopmentPage();
        Assert.assertTrue(vrArApplicationsDevelopmentPage.isPageOpened(),
                "Vr/Ar applications development page is not opened!");

        LearningManagementSystemWithMultiplayerForVrArPage learningManagementSystemWithMultiplayerForVrArPage
                = vrArApplicationsDevelopmentPage.openLearningManagementSystemWithMultiplayerPage();

        Assert.assertEquals(learningManagementSystemWithMultiplayerForVrArPage.getTitleText(),
                "Learning management system with multiplayer for VR & AR");
    }

    @Test(description = "AUTO-0013")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P2)
    public void verification10BestOpenSourceTestAutomationFrameworksOf2018Article() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        BlogPage blogPage = homePage.getHeaderMenu().openBlogPage();
        Assert.assertTrue(blogPage.isPageOpened(), "Blog page is not opened!");

        CarinaPage carinaPage = blogPage.openCarinaPage();
        Assert.assertTrue(blogPage.isPageOpened(), "Carina page is not opened!");

        BestAutomationFrameworksArticlePage bestAutomationFrameworksArticlePage =
                carinaPage.openBestAutomationFrameworksArticle();
        Assert.assertTrue(blogPage.isPageOpened(), "Best automation frameworks article page page is not opened!");

        Assert.assertEquals(bestAutomationFrameworksArticlePage.getTitleText(),
                "10 best open source test automation frameworks of 2018");
    }

    @Test(description = "AUTO-0014")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P2)
    public void verificationVisibilityTextOfGetMVPInJustTwoMonthsInAntiCrisisOfferBlock() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        MinimumViableProductPage minimumViableProductPage = homePage.openMinimumViableProductPage();
        Assert.assertTrue(minimumViableProductPage.isPageOpened(), "Minimum viable product page is not opened!");

        minimumViableProductPage.openTeamOfExpertsDetail();

        Assert.assertTrue(minimumViableProductPage.isTeamOfExpertsDetailFirstImageVisible(),
                "Team of experts detail first image isn't visible!");
    }

    @Test(description = "AUTO-0015")
    @MethodOwner(owner = "DenisPitsul")
    @TestPriority(Priority.P2)
    public void verificationTestAutomationTagsPageArticle() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");

        BlogPage blogPage = homePage.getHeaderMenu().openBlogPage();
        Assert.assertTrue(blogPage.isPageOpened(), "Blog page is not opened!");

        blogPage.typeTextToSearchInput(TestData.TEST_AUTOMATION_TAG);
        TestAutomationBlogPage testAutomationBlogPage = blogPage.openTestAutomationBlogPage();
        Assert.assertTrue(testAutomationBlogPage.isPageOpened(), "Test automation blog page is not opened!");

        Assert.assertEquals(testAutomationBlogPage.getSubTitleText(), "Something is wrong");
    }

}
