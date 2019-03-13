package tests;

import org.testng.annotations.Test;

public class MarkAsUnreadSentMailTest extends TestBase{

  @Test
  public void testMoveToArchiveSentMail() {
    yahooManager.getYahooLeftMenu().clickSentMailButton();
    yahooManager.getYahooMessageMenu().clickSingleMessageCheckbox();
    yahooManager.getYahooMessageMenu().clickMoreMenuButton();
    yahooManager.getYahooMessageMenu().clickMarkAsUnreadButton();
  }
}
