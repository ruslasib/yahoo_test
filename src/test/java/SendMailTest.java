import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SendMailTest {

  WebDriver wd;

  @BeforeTest
  public void setUp() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.manage().window().maximize();
  }

  @Test
  public void testSendMail() {
    authorize("ruslasib@yahoo.com", "2sinYcosH");
    //sendMail("vizhevske@mail.ru");
  }

  @AfterTest
  public void tearDown() {
    wd.quit();
  }

  private void authorize(String login, String password) {
    wd.get("https://www.yahoo.com/");
    wd.findElement(By.id("uh-mail-link")).click();
    wd.findElement(By.id("login-username")).clear();
    wd.findElement(By.id("login-username")).click();
    wd.findElement(By.id("login-username")).sendKeys(login);
    wd.findElement(By.id("login-signin")).sendKeys(Keys.ENTER);

    wd.findElement(By.id("login-passwd")).clear();
    wd.findElement(By.id("login-passwd")).click();
    wd.findElement(By.id("login-passwd")).sendKeys(password);
    wd.findElement(By.id("login-signin")).sendKeys(Keys.ENTER);
  }
}
