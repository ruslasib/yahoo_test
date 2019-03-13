package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class YahooSession extends YahooBase {

  public YahooSession(WebDriver wd) {
    super(wd);
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
}
