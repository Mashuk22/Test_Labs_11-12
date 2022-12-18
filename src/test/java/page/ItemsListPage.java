package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ItemsListPage extends AbstractPage{

    private final By cardButtonLocator = By.xpath("//*[@data-el-type='Hero']");

    private final By redFilterButtonLocator = By.xpath("//*[@aria-label='Filter for Red']");
    private final By purpleFilterButtonLocator = By.xpath("//*[@aria-label='Filter for Purple']");
    private final By menFilterButtonLocator = By.xpath("//*[@aria-label='Filter for Men']");

    private final By runningFilterButtonLocator = By.xpath("//*[@aria-label='Filter for Running']");

    protected ItemsListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public ItemsListPage setRunningFilter(){
        WebElement runningFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(runningFilterButtonLocator));
        runningFilterButton.click();
        logger.info("Filter running");
        return this;
    }

    public ItemsListPage setPurpleColorFilter(){
        WebElement purpleFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(purpleFilterButtonLocator));
        purpleFilterButton.click();
        logger.info("Filter purple color");
        return this;
    }
    public ItemsListPage setRedColorFilter(){
        WebElement redFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(redFilterButtonLocator));
        redFilterButton.click();
        logger.info("Filter red color");
        return this;
    }
    public ItemsListPage setMenFilter(){
        WebElement menFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(menFilterButtonLocator));
        menFilterButton.click();
        logger.info("Filter men");
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
