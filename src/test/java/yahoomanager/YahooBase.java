package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooBase {

  public WebDriver wd;

  public YahooBase(WebDriver wd) {
    this.wd = wd;
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

}
