package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KidsPage extends AbstractPage{
    private final By cardButtonLocator = By.xpath("//*[@data-el-type='Hero']");
    private final By bucketFilterButtonLocator = By.xpath("//*[@aria-label='Category for Bucket Hats']");

    protected KidsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
        CustomDelay(2);
    }

    public KidsPage setBucketFilter(){
        WebElement bucketFilterButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(bucketFilterButtonLocator));
        bucketFilterButton.click();
        logger.info("Filter green color");
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
