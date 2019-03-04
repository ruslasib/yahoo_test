package yahoomanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java
<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java

public class YahooManager {

  public YahooManager (ChromeDriver wd) {
    this.wd = wd;
  }
=======
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java
=======
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java

  public WebDriver wd;
<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java
<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java
<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java
  private final YahooMessageCreating yahooMessageCreating = new YahooMessageCreating();
  private int defaultWaitTime = 30;
  private YahooLeftMenu yahooLeftMenu = new YahooLeftMenu();

  YahooMessageCreating yahooMessageCreating = new YahooMessageCreating(wd);
=======
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java
=======
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java
=======
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java

  public void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.manage().window().maximize();
    wd.get("https://www.yahoo.com/");
    authorize("ruslasib@yahoo.com", "2sinYcosH");
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

<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java
<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java
<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java
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

  public YahooLeftMenu getYahooLeftMenu() {
    return yahooLeftMenu;
  }

  public YahooMessageCreating getYahooMessageCreating() {
    return yahooMessageCreating;
  }
}
=======
=======
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java
=======
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java
  public void clickIncomeMailButton() {
    wd.findElement(By.xpath("//*[@data-test-folder-name='Inbox']")).click();
  }
}
<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java
<<<<<<< HEAD:src/test/java/yahoomanager/YahooManager.java
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java
=======
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java
=======
>>>>>>> parent of a0d3a35... Создан тест для проверки базового поиска писем:src/test/java/yahoomanager/YahooPage.java
