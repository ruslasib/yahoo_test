import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
  WebDriver wd;

  @BeforeMethod
  public void setUp() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.manage().window().maximize();
  }

  protected void fillNewMessageFields(NewMessageData newMessage) {
    wd.findElement(By.id("message-to-field")).click();
    wd.findElement(By.id("message-to-field")).sendKeys(newMessage.getRecipient());
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).click();
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys(newMessage.getSubject());
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).click();
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).sendKeys(newMessage.getMessage());
  }

  protected void clickSendButton() {
    wd.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
  }

  protected void clickComposeButton() {
    wd.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
  }

  @AfterMethod
  public void tearDown() {
    wd.findElement(By.xpath("//*[@id=\"ybar\"]/div[3]/div[1]/div/label")).click();
    wd.findElement(By.xpath("//*[@id=\"ybarAccountMenuBody\"]/a[3]"));
    wd.quit();
  }

  protected void authorize(String login, String password) {
    wd.get("https://www.yahoo.com/");
    wd.findElement(By.id("uh-mail-link")).click();
    wd.findElement(By.id("login-username")).click();
    wd.findElement(By.id("login-username")).clear();
    wd.findElement(By.id("login-username")).sendKeys(login);
    wd.findElement(By.id("login-signin")).sendKeys(Keys.ENTER);
    wd.findElement(By.id("login-passwd")).click();
    wd.findElement(By.id("login-passwd")).clear();
    wd.findElement(By.id("login-passwd")).sendKeys(password);
    wd.findElement(By.id("login-signin")).sendKeys(Keys.ENTER);
  }
}
