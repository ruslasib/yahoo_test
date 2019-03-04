package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import yahoomanager.YahooManager;

public class TestBase {

  protected final YahooManager yahooManager = new YahooManager();

  @BeforeMethod
  public void setUp() {
    yahooManager.init();
  }

  @AfterMethod
  public void tearDown() {
    yahooManager.stop();
  }

}
