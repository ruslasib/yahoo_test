package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class YahooLeftMenu {
  private WebDriver wd;

  public YahooLeftMenu(WebDriver wd) {
    this.wd = wd;
  }

  public void clickComposeButton() {
    wd.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
  }

  public void clickIncomeMailButton() {
    wd.findElement(By.xpath("//*[@data-test-folder-name='Inbox']")).click();
  }

  public void clickDraftButton() {
    wd.findElement(By.xpath("//*[@data-test-id='folder-list-item']"));
    wd.manage().timeouts().implicitlyWait(5, SECONDS);
  }
}
