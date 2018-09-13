import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticlePage {

    WebDriver driver;

    @FindBy(id = "firstHeading")
    WebElement title;

    //constructeur
    public ArticlePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitleArticle()
    {
        return this.title.getText();
    }
}