package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import yahoomodels.NewMessageData;

import static java.util.concurrent.TimeUnit.SECONDS;

public class YahooPage {
  public WebDriver wd;
  int defaultWaitTime = 30;

  public void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(defaultWaitTime, SECONDS);
    wd.manage().window().maximize();
    wd.get("https://www.yahoo.com/");
    authorize("ruslasib@yahoo.com", "2sinYcosH");
  }

  public void fillNewMessageFields(NewMessageData newMessage) {
    wd.findElement(By.id("message-to-field")).click();
    wd.findElement(By.id("message-to-field")).sendKeys(newMessage.getRecipient());
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).click();
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys(newMessage.getSubject());
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).click();
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).sendKeys(newMessage.getMessage());
  }

  public void clickSendButton() {
    wd.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
  }

  public void clickComposeButton() {
    wd.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
  }

  public void stop() {
    wd.quit();
  }

  public void authorize(String login, String password) {
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

  public void clickDeleteButton() {
    wd.findElement(By.xpath("//*[@data-test-id='toolbar-delete']")).click();
  }

  public void clickSingleMessageCheckbox() {
    wd.findElement(By.xpath("//*[@data-test-id='icon-btn-checkbox']")).click();
  }

  public void clickIncomeMailButton() {
    wd.findElement(By.xpath("//*[@data-test-folder-name='Inbox']")).click();
  }

  public void fillSearchMailBarBasic(String simpleInput) {
    String MailSearchBarXpath = "//input[@role='combobox']";
    wd.findElement(By.xpath(MailSearchBarXpath)).click();
    wd.findElement(By.xpath(MailSearchBarXpath)).sendKeys(simpleInput);
  }

  public void clickSearchBasicBtn() {
    wd.findElement(By.xpath("//*[@data-test-id='search-basic-btn']")).click();
  }

  public boolean isElementPresent(String xpath) {
    wd.manage().timeouts().implicitlyWait(2, SECONDS);
    boolean result = wd.findElements(By.xpath(xpath)).size() > 0;
    wd.manage().timeouts().implicitlyWait(defaultWaitTime, SECONDS);
    return result;
  }
}