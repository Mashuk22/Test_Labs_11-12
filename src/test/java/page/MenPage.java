package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MenPage extends AbstractPage{
    private final By cardButtonLocator = By.xpath("//*[@data-el-type='Hero']");
    private final By watchFilterButtonLocator = By.xpath("//*[@aria-label='Category for Watches']");

    private final By sortOptionsButtonLocator = By.xpath("//*[@aria-controls='sort-options']");
    private final By sortNewestButtonLocator = By.xpath("//*[@aria-label='Newest']");

    protected MenPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        CustomDelay(2);
    }
    public MenPage sortNewest(){
        WebElement sortNewestButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortNewestButtonLocator));
        sortNewestButton.click();
        logger.info("Sort Newest");
        CustomDelay(2);
        return this;
    }
    public MenPage sortOptions(){
        WebElement sortOptionsButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sortOptionsButtonLocator));
        sortOptionsButton.click();
        logger.info("Sort options");
        return this;
    }

    public MenPage setWatchFilter(){
        WebElement watchFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(watchFilterButtonLocator));
        watchFilterButton.click();
        logger.info("Filter watch");
        CustomDelay(2);
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