import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
/**
 * Created by davitpilishvili on 9/8/16.
 */
public class updateProfile {
    public static void main (String[] args) throws InterruptedException {

        WebDriver fx = new FirefoxDriver();

        //fx.manage().window().maximize();
        fx.get("http://www.dice.com/");
        fx.findElement(By.id("Login_1")).click();
        fx.findElement(By.id("Email_1")).sendKeys("davidphilishvili@gmail.com");
        fx.findElement(By.id("Password_1")).sendKeys("Qondari144");
        fx.findElement(By.id("LoginBtn_1")).click();
        Thread.sleep(20000);
        fx.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[2]/div/div/button")).click();
        fx.findElement(By.id("contactLastNameInput")).clear();
        fx.findElement(By.id("contactLastNameInput")).sendKeys("Pilishvil QA Mobile Web Tester");
        fx.findElement(By.xpath("html/body/div[6]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[2]/div/button")).click();
        Thread.sleep(20000);
        fx.findElement(By.id("dice-customer-name")).click();
        Thread.sleep(10000);
        fx.findElement(By.xpath("html/body/div[2]/div/div[2]/div[2]/ul[2]/li[3]/ul/li[5]/form/button")).click();

        fx.close();
    }
}
