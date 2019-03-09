package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class YahooLeftMenu extends YahooPage {
  private WebDriver wd;

  public YahooLeftMenu(WebDriver wd) {
    this.wd = wd;
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
}
