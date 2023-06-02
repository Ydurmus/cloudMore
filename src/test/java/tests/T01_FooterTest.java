package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CloudMorePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class T01_FooterTest extends TestBaseRapor {


    @Test
    public  void FooterTest(){
        CloudMorePage cloudMorePage=new CloudMorePage();
        extentTest =extentReports.createTest("Cloudmore Footer test","Footer Test Completede");
        Driver.getDriver().get(ConfigReader.getProperty("siteUrl"));
        extentTest.info("Cloudmore Website has been reached");
        Assert.assertTrue(cloudMorePage.footerSolitions.isDisplayed(),"Solution Column is Displayed");
        extentTest.info("Solution Column is Displayed");
        Assert.assertTrue(cloudMorePage.footerProducts.isDisplayed(),"Products Column is Displayed");
        extentTest.info("Products Column is Displayed");
        Assert.assertTrue(cloudMorePage.footerResources.isDisplayed(),"Resources Column is Displayed");
        extentTest.info("Resources Column is Displayed");
        Assert.assertTrue(cloudMorePage.footerCompany.isDisplayed(),"Company Column is Displayed");
        extentTest.info("Company Column is Displaye");
        Assert.assertTrue(cloudMorePage.footerTwitter.isDisplayed(),"Twitter Link is Displayed");
        extentTest.info("Twitter Link is Displayedd");
        Assert.assertTrue(cloudMorePage.footerLinkedin.isDisplayed());
        extentTest.info("Linkedin Link is Displayed");
        Assert.assertTrue(cloudMorePage.footerYoutube.isDisplayed());
        extentTest.info("Youtube Link is Displayed");
        Assert.assertTrue(cloudMorePage.footerCopyright.isDisplayed(),"Copyright Text is Displayed");
        extentTest.info("Copyright Text is Displayed");
        Driver.closeDriver();
    }

}
