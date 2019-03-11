package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import yahoomodels.NewMessageData;

import static java.util.concurrent.TimeUnit.SECONDS;

public class YahooPage {

  public WebDriver wd;
  public YahooNewMessage yahooNewMessage;
  public YahooLeftMenu yahooLeftMenu;

  public void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(5, SECONDS);
    wd.manage().window().maximize();
    wd.get("https://www.yahoo.com/");
    authorize("ruslasib@yahoo.com", "2sinYcosH");
    yahooLeftMenu = new YahooLeftMenu(wd);
    yahooNewMessage = new YahooNewMessage(wd);
  }

  public void stop() {
    wd.quit();
  }

  protected void authorize(String login, String password) {
    click(By.id("uh-mail-link"));
    type(By.id("login-username"), login);
    pressEnterKey(By.id("login-signin"));
    type(By.id("login-passwd"), password);
    pressEnterKey(By.id("login-signin"));
  }

  private void pressEnterKey(By locator) {
    wd.findElement(locator).sendKeys(Keys.ENTER);
  }

  public void clickSentMailButton() {
    click(By.xpath("//*[@data-test-folder-name='Sent']"));
  }

  public void clickMoreMenuButton() {
    click(By.xpath("//*[@data-test-id='more-menu-button']"));
  }

  public void clickMarkAsUnreadButton() {
    click(By.xpath("//*[@name=\"mark-as-unread\"]"));
  }

  public void clickComposeButton() {
    click(By.xpath("//*[@data-test-id='compose-button']"));
  }

  public void clickIncomeMailButton() {
    click(By.xpath("//*[@data-test-folder-name='Inbox']"));
  }

  public void clickDraftButton() {
    click(By.xpath("//*[@data-test-id='folder-list-item']"));
    wd.manage().timeouts().implicitlyWait(5, SECONDS);
  }

  public void fillNewMessageFields(NewMessageData newMessage) {
    type(By.id("message-to-field"), newMessage.getRecipient());
    type(By.xpath("//input[@data-test-id='compose-subject']"), newMessage.getSubject());
    type(By.xpath("//*[@data-test-id='rte']"), newMessage.getMessage());
  }

  public void clickCloseAndSaveDraftButton() {
    click(By.xpath("//*[@data-test-id='icon-btn-close']"));
  }

  public void clickSendButton() {
    click(By.xpath("//button[@data-test-id='compose-send-button']"));
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void clickDeleteButton() {
    click(By.xpath("//*[@data-test-id='toolbar-delete']"));
  }

  public void clickSingleMessageCheckbox() {
    click(By.xpath("//*[@data-test-id='icon-btn-checkbox']"));
  }
}
