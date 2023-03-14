package sel_handson1;

import static org.junit.Assert.*;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	WebDriver driver = new ChromeDriver();


	@BeforeClass
	public static void before() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/JE20362903/Downloads/Selenium/Drivers/chromedriver_mac64/chromedriver");

		//WebDriver driver = new ChromeDriver();
		
		
	}

	@Before
	public void beforemain() {
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Dismiss")).click();
		System.out.println("Executing the test case1::");
	
	}
@After
	public void aftertest() {
		driver.close();
		
		driver.quit();
	}
	@Test
	public void tc1() throws InterruptedException, IOException {
		
	
		driver.findElement(By.linkText("My Account")).click();

		driver.findElement(By.cssSelector("input#username")).sendKeys("jee@A1gmail.com");

		driver.findElement(By.id("password")).sendKeys("GFSSVGGSGGHYBSSY");

		driver.findElement(By.name("login")).click();
		

		driver.findElement(By.cssSelector("a.noo-search")).click();

		driver.findElement(By.xpath("//input[@name=\"s\"]")).sendKeys("Sandals");

		driver.findElement(By.xpath("//input[@name=\"s\"]")).submit();

		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//div[@class=\"owl-item active\"]//a[@href=\"https://shop.demoqa.com/product/brown-pom-pom-embroidered-gladiator-sandals/\"]"))
				.click();
		Thread.sleep(1000);
		WebElement color = driver.findElement(By.id("pa_color"));
		Select s = new Select(color);
		s.selectByIndex(1);

		WebElement size = driver.findElement(By.cssSelector("select[data-attribute_name=\"attribute_pa_size\"]"));
		Select s1 = new Select(size);
		s1.selectByValue("38");

		for (int i = 1; i < 10; i++) {
			driver.findElement(By.cssSelector("button.qty-increase")).click();
		}

		driver.findElement(By.cssSelector("button.single_add_to_cart_button")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div.woocommerce-message")).getText());

		driver.findElement(By.linkText("View cart")).click();
		Thread.sleep(1000);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);

		FileWriter fout = new FileWriter("/Users/JE20362903/eclipse-workspace/sel_handson1/price.txt");
		String total = driver.findElement(By.xpath("//td[@class=\"product-subtotal\"]//bdi")).getText();
		fout.write(total);
		System.out.println(total);
		fout.close();

		total = total.replaceAll("₹", "");
		total = total.replaceAll(",", "");
		System.out.println(total);

		float t = Float.parseFloat(total);
		System.out.println(t);

		int a = (int) t;
		System.out.println(a);

		Thread.sleep(1000);
		// double r=i.00;

		if (a > 200)
		{

			driver.findElement(By.xpath("//a[@class=\"checkout-button button alt wc-forward wp-element-button\"]")).click();
            Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='terms']")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("place_order")).click();

			Thread.sleep(1000);

			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,500)");

			Thread.sleep(1000);
			js2.executeScript("window.scrollBy(0,-500)");

			System.out.println(driver.findElement(By.cssSelector("div.entry-content")).getText());

			driver.findElement(By.cssSelector("span.cart-item")).click();

			Thread.sleep(1000);

			System.out.println("The cart status " + driver.findElement(By.cssSelector("p.cart-empty")).getText());

			driver.findElement(By.linkText("My Account")).click();

			Thread.sleep(1000);

			driver.findElement(By.partialLinkText("Ord")).click();

			Thread.sleep(1000);

			js2.executeScript("window.scrollBy(0,-500)");

			System.out.println("The order details "
					+ driver.findElement(By.cssSelector("div.woocommerce-MyAccount-content")).getText());

			driver.findElement(By.linkText("Logout")).click();
		}

		else {
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(2000);
			driver.findElement(By.className("continue"));
			//driver.findElement(By.linkText("continue shopping"));
			
		}
	}
}
