package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends AbstractPage {

    public static final String HOMEPAGE_URL = "https://www.nike.com/";
    private final By womenButtonLocator = By.xpath("//*[@aria-label='Women']");
    private final By womenTennisButtonLocator = By.xpath("//*[@aria-label='main-menu, Women, Shoes, Tennis']");
    private final By womenSocksButtonLocator = By.xpath("//*[@aria-label='main-menu, Women, Clothing, Socks']");
    private final By menButtonLocator = By.xpath("//*[@aria-label='Men']");
    private final By menWatchButtonLocator = By.xpath("//*[@aria-label='main-menu, Men, Accessories & Equipment, Apple Watch Nike']");
    private final By kidsButtonLocator = By.xpath("//*[@aria-label='Kids']");
    private final By kidsHatsButtonLocator = By.xpath("//*[@aria-label='main-menu, Kids, Accessories & Equipment, Hats ']");
    private final By newAndFituredButtonLocator = By.xpath("//*[@aria-label='New & Featured']");
    private final By newButtonLocator = By.xpath("//*[@aria-label='main-menu, New & Featured, New For Men, Shop All New']");
    private final By saleButtonLocator = By.xpath("//*[@aria-label='Sale']");
    private final By acceptCookieButtonLocator = By.xpath("//Button[@class='ncss-btn-primary-dark pt3-sm pb3-sm pt2-lg pb2-lg ta-sm-c u-full-width']");
    private final By searchInputLocator = By.xpath("//input[@name='search']");
    private final By chooseUSACountryButton = By.xpath("//a[@class='hf-language-menu-item ncss-col-sm-12 ncss-col-md-4 ncss-col-lg-3 selected']");

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public HomePage selectWomenCategory(){
        WebElement womenButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(womenButtonLocator));
        new Actions(driver)
                .moveToElement(womenButton)
                .perform();
        logger.info("Select Women Category");
        return this;
    }
    public WomenPage openWomenTennisPage(){
        WebElement womenTennisButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(womenSocksButtonLocator));
        womenTennisButton.click();
        logger.info("Open women page");
        return new WomenPage (driver);
    }
    public WomenPage openWomenSocksPage(){
        WebElement womenSocksButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(womenSocksButtonLocator));
        womenSocksButton.click();
        logger.info("Open women socks page");
        return new WomenPage (driver);
    }

    public HomePage selectMenCategory(){
        WebElement menButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(menButtonLocator));
        new Actions(driver)
                .moveToElement(menButton)
                .perform();
        logger.info("Select Men Category");
        return this;
    }
    public MenPage openMenPage(){
        WebElement menWatchButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(menWatchButtonLocator));
        menWatchButton.click();
        logger.info("Open Men page");
        return new MenPage(driver);
    }

    public HomePage selectKidsCategory(){
        WebElement kidsButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(kidsButtonLocator));
        new Actions(driver)
                .moveToElement(kidsButton)
                .perform();
        logger.info("Select Kids Category");
        return this;
    }
    public KidsPage openKidsPage(){
        WebElement kidsHatsButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(kidsHatsButtonLocator));
        kidsHatsButton.click();
        logger.info("Open Kids page");
        return new KidsPage(driver);
    }

    public HomePage selectNewAndFituredPage(){
        WebElement newButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(newAndFituredButtonLocator));
        newButton.click();
        logger.info("Select New and Fitured");
        return this;
    }
    public NewAndFituredPage openNewPage(){
        WebElement newButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(newButtonLocator));
        newButton.click();
        logger.info("Open New and Fitured page");
        return new NewAndFituredPage(driver);
    }

    public SalePage openSalePage(){
        WebElement searchInput = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(saleButtonLocator));
        searchInput.click();
        logger.info("Open Sale page");
        return new SalePage(driver);
    }

    public ItemsListPage searchQuery(String query){
        WebElement searchInput = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(searchInputLocator));
        searchInput.sendKeys(query);
        searchInput.sendKeys(Keys.ENTER);
        logger.info("Search query");
        return new ItemsListPage(driver);
    }

    public HomePage acceptCookie(){
        WebElement acceptCookieButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(acceptCookieButtonLocator));
        acceptCookieButton.click();
        return this;
    }

    public HomePage chooseUSACountryChoosePopUp(){
        WebElement closeButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(chooseUSACountryButton));
        closeButton.click();
        return this;
    }

    public HomePage openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }

}
