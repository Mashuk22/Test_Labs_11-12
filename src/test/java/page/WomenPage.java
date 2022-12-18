package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WomenPage extends AbstractPage{
    private final By cardButtonLocator = By.xpath("//*[@data-el-type='Hero']");
    private final By sortOptionsButtonLocator = By.xpath("//*[@aria-controls='sort-options']");
    private final By sortHighLowButtonLocator = By.xpath("//*[@aria-label='Price: High-Low']");
    private final By blackFilterButtonLocator = By.xpath("//*[@aria-label='Filter for Black']");

    protected WomenPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        CustomDelay(2);
    }

    public WomenPage setBlackColorFilter(){
        WebElement blackFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(blackFilterButtonLocator));
        blackFilterButton.click();
        logger.info("Filter black color");
        CustomDelay(2);
        return this;
    }
    public WomenPage sortHighLow(){
        WebElement sortHighLowButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortHighLowButtonLocator));
        sortHighLowButton.click();
        logger.info("Sort HighLow");
        CustomDelay(2);
        return this;
    }
    public WomenPage sortOptions(){
        WebElement sortOptionsButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortOptionsButtonLocator));
        sortOptionsButton.click();
        logger.info("Sort options");
        return this;
    }

    public ItemPage openFirstItem(){
        WebElement cardButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(cardButtonLocator));
        cardButton.click();
        logger.info("Item page opened");
        return new ItemPage(driver);
    }
}