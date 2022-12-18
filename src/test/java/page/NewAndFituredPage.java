package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewAndFituredPage extends AbstractPage{
    private final By cardButtonLocator = By.xpath("//*[@data-el-type='Hero']");
    private final By lifestyleFilterButtonLocator = By.xpath("//*[@aria-label='Filter for Lifestyle']");
    private final By wetConditionsFilterButtonLocator = By.xpath("//*[@aria-label='Filter for Wet Weather Conditions']");
    private final By greenFilterButtonLocator = By.xpath("//*[@aria-label='Filter for Green']");
    private final By pinkFilterButtonLocator = By.xpath("//*[@aria-label='Filter for Pink']");
    protected NewAndFituredPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        CustomDelay(2);
    }
    public NewAndFituredPage setLifestyleFilter(){
        WebElement lifestyleFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(lifestyleFilterButtonLocator));
        lifestyleFilterButton.click();
        logger.info("Filter lifestyle");
        CustomDelay(2);
        return this;
    }
    public NewAndFituredPage setPinkColorFilter(){
        WebElement pinkFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(pinkFilterButtonLocator));
        pinkFilterButton.click();
        logger.info("Filter pink color");
        CustomDelay(2);
        return this;
    }
    public NewAndFituredPage setGreenColorFilter(){
        WebElement greenFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(greenFilterButtonLocator));
        greenFilterButton.click();
        logger.info("Filter green color");
        CustomDelay(2);
        return this;
    }
    public NewAndFituredPage wetConditionsFilter(){
        WebElement wetConditionsButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(wetConditionsFilterButtonLocator));
        wetConditionsButton.click();
        logger.info("Filter wetConditions");
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
