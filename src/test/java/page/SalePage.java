package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SalePage extends AbstractPage{
    private final By cardButtonLocator = By.xpath("//*[@data-el-type='Hero']");
    private final By sale40OffFilterButtonLocator = By.xpath("//*[@aria-label='Filter for 40% Off and Up']");
    private final By socksFilterButtonLocator = By.xpath("//*[@aria-label='Category for Socks']");
    private final By sortOptionsButtonLocator = By.xpath("//*[@aria-controls='sort-options']");
    private final By sortLowHighButtonLocator = By.xpath("//*[@aria-label='Price: Low-High']");
    private final By shoesButtonLocator = By.xpath("//*[@aria-label='Category for Shoes']");

    private final By sortHighLowButtonLocator = By.xpath("//*[@aria-label='Price: High-Low']");

    protected SalePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        CustomDelay(2);
    }

    public SalePage sortHighLow(){
        WebElement sortHighLowButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortHighLowButtonLocator));
        sortHighLowButton.click();
        logger.info("Sort HighLow");
        CustomDelay(2);
        return this;
    }

    public SalePage selectShoes(){
        WebElement shoesButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(shoesButtonLocator));
        shoesButton.click();
        logger.info("Shoes filter");
        return this;
    }
    public ItemPage openFirstItem(){
        WebElement cardButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(cardButtonLocator));
        cardButton.click();
        logger.info("Item page opened");
        return new ItemPage(driver);
    }
    public SalePage sortLowHigh(){
        WebElement sortLowHighButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortLowHighButtonLocator));
        sortLowHighButton.click();
        logger.info("Sort Low-High");
        CustomDelay(2);
        return this;
    }
    public SalePage sortOptions(){
        WebElement sortOptionsButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortOptionsButtonLocator));
        sortOptionsButton.click();
        logger.info("Sort options");
        return this;
    }
    public SalePage socksFilter(){
        WebElement socksFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(socksFilterButtonLocator));
        socksFilterButton.click();
        logger.info("Filter socks category");
        CustomDelay(2);
        return this;
    }

    public SalePage set40OffFilter(){
        WebElement sale40OffFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sale40OffFilterButtonLocator));
        sale40OffFilterButton.click();
        logger.info("Filter 40% Off");
        CustomDelay(2);
        return this;
    }

}
