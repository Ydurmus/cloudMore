package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CloudMorePage {


public CloudMorePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    //footer / solitions locate
    @FindBy (xpath ="//*[@id=\"hs_cos_wrapper_footer_nav\"]/div/div/div/div/div[1]/div/div")
    public WebElement footerSolitions;

    //footer / Products locate
    @FindBy (xpath = "//*[@id=\"hs_cos_wrapper_footer_nav\"]/div/div/div/div/div[2]/div/div")
    public WebElement footerProducts;

    //footer / Resources locate
    @FindBy (xpath = "//*[@id=\"hs_cos_wrapper_footer_nav\"]/div/div/div/div/div[3]/div/div")
    public WebElement footerResources;

    //footer / Company locate
    @FindBy (xpath = "//*[@id=\"hs_cos_wrapper_footer_nav\"]/div/div/div/div/div[4]/div/div")
    public WebElement footerCompany;

    //footer / Twitter locate
    @FindBy (xpath = "(//a[@href='https://twitter.com/cloudmore'])[2]")
    public WebElement footerTwitter;

    //footer / Linkedin locate
    @FindBy(xpath = "//*[@id=\"hs_cos_wrapper_footer_icons\"]/div/div/div/a[2]")
    public WebElement footerLinkedin;

    //footer / Youtube locate
    @FindBy (xpath="//*[@id=\"hs_cos_wrapper_footer_icons\"]/div/div/div/a[3]")
    public WebElement footerYoutube;

    //footer / Copyright locate
    @FindBy(xpath = "//*[@id=\"rtext__footer_copyright\"]")
    public WebElement footerCopyright;

}
