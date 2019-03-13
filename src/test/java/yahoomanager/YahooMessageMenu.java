package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooMessageMenu extends YahooBase {

  public YahooMessageMenu(WebDriver wd) {
    super(wd);
  }
  public void clickMoreMenuButton() {
    click(By.xpath("//*[@data-test-id='more-menu-button']"));
  }

  public void clickMarkAsUnreadButton() {
    click(By.xpath("//*[@name=\"mark-as-unread\"]"));
  }

  public void clickDeleteButton() {
    click(By.xpath("//*[@data-test-id='toolbar-delete']"));
  }

  public void clickSingleMessageCheckbox() {
    click(By.xpath("//*[@data-test-id='icon-btn-checkbox']"));
  }
}
