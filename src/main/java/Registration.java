import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruten\\IdeaProjects\\NewToursdemo\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours");
        driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mitchel");

        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("svisveni");

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9889978998");

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("mitchel@gmail.com");

        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("adresss");

        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("joburg");

        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Gauteng");

        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("9");


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mitchel");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mmmmmm");

        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("mmmmmm");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

       if (driver.findElement(By.xpath("//b[contains(.,'Note: Your user name is mitchel.')]")).isDisplayed())
        {
            System.out.println("Your user name is mitchel");
        } else
          System.out.println("Registration failed");

        driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();

        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        if (driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed())
        {
            System.out.println("Login Successfully");
        } else
            System.out.println("Logged in failed");

    }
}
