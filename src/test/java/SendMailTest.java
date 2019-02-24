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
    sendMail("vizhevske@mail.ru");
  }

  @AfterTest
  public void tearDown() {
    wd.findElement(By.xpath("//*[@id=\"ybar\"]/div[3]/div[1]/div/label")).click();
    wd.findElement(By.xpath("//*[@id=\"ybarAccountMenuBody\"]/a[3]"));
    wd.quit();
  }

  private void authorize(String login, String password) {
    wd.get("https://www.yahoo.com/");
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

  private void sendMail(String recipient) {
    wd.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
    wd.findElement(By.id("message-to-field")).click();
    wd.findElement(By.id("message-to-field")).sendKeys(recipient);
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).click();
    wd.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("A cup of tea?");
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).click();
    wd.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).sendKeys("I'm not a robot. Let's drink tea, guy!");
    wd.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
  }
}
