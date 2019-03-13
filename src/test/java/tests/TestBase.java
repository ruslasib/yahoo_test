package tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import yahoomanager.YahooManager;

public class TestBase {

  private String browser = BrowserType.FIREFOX;
  protected final YahooManager yahooManager = new YahooManager(browser);

  @BeforeMethod
  public void setUp() {
    yahooManager.init();
  }

  @AfterMethod
  public void tearDown() {
    yahooManager.stop();
  }

}
