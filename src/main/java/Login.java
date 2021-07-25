import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruten\\IdeaProjects\\NewToursdemo\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours");
        driver.findElement(By.xpath("//a[@href='login.php'][contains(.,'SIGN-ON')]")).click();
        driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
        if (driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed())
        {
            System.out.println("PASSED");
        } else
            System.out.println("FAILED");
        //driver.close();


    }
}
