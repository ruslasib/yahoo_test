package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import yahoomodels.NewMessageData;

import java.util.concurrent.TimeUnit;

public class YahooPage {

  private YahooLeftMenu yahooLeftMenu;
  public YahooNewMessage yahooNewMessage;
  public WebDriver wd;

  public void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.manage().window().maximize();
    wd.get("https://www.yahoo.com/");
    authorize("ruslasib@yahoo.com", "2sinYcosH");
    yahooLeftMenu = new YahooLeftMenu(wd);
    yahooNewMessage = new YahooNewMessage(wd);
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

  public YahooLeftMenu getYahooLeftMenu() {
    return yahooLeftMenu;
  }

  public YahooNewMessage getYahooNewMessage() {
    return yahooNewMessage;
  }
}
