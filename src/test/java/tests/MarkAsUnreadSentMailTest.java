package tests;

import org.testng.annotations.Test;

public class MarkAsUnreadSentMailTest extends TestBase{

  @Test
  public void testMoveToArchiveSentMail() {
    yahooPage.clickSentMailButton();
    yahooPage.clickSingleMessageCheckbox();
    yahooPage.clickMoreMenuButton();
    yahooPage.clickMarkAsUnreadButton();
  }
}
