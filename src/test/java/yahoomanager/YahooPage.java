package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

public class YahooPage {

  public YahooNewMessage yahooNewMessage;
  public WebDriver wd;
  private YahooLeftMenu yahooLeftMenu;

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

  public YahooLeftMenu getYahooLeftMenu() {
    return yahooLeftMenu;
  }

  public YahooNewMessage getYahooNewMessage() {
    return yahooNewMessage;
  }
}
