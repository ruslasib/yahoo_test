package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchMailTest extends TestBase {

  @Test
  public void testSearchMailExists() {
    yahooManager.fillSearchMailBarBasic("vizhevske");
    yahooManager.clickSearchBasicBtn();
    Assert.assertTrue(yahooManager.isElementPresent("//*[@data-test-id='icon-btn-checkbox']"));
  }

  @Test
  public void testSearchMailNotExists() {
    yahooManager.fillSearchMailBarBasic("posdjhfsjkdsu");
    yahooManager.clickSearchBasicBtn();
    Assert.assertFalse(yahooManager.isElementPresent("//*[@data-test-id='icon-btn-checkbox']"));
  }
}