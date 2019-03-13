package tests;

import org.testng.annotations.Test;

public class DeleteIncomeMailTest extends TestBase {

  @Test
  public void testDeleteIncomeMail() {
    yahooManager.getYahooLeftMenu().clickIncomeMailButton();
    yahooManager.getYahooMessageMenu().clickSingleMessageCheckbox();
    yahooManager.getYahooMessageMenu().clickDeleteButton();
  }
}
