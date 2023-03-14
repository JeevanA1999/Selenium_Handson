package com.wipro;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/JE20362903/Downloads/Selenium/Drivers/chromedriver_mac64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "/Users/JE20362903/Downloads/Selenium/Drivers/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.get("https://shop.demoqa.com/");

		driver.findElement(By.linkText("Dismiss")).click(); 
		
		// Registering an account

		driver.findElement(By.linkText("My Account")).click();

		Thread.sleep(1000);
//
//		driver.findElement(By.id("reg_username")).sendKeys("JeeA2");
//
//		driver.findElement(By.cssSelector("input#reg_email")).sendKeys("jee@A2gmail.com");
//
//		driver.findElement(By.id("reg_password")).sendKeys("GFSSVGGSGGHYBSSY");
//
//		driver.findElement(By.cssSelector("button[value=\"Register\"]")).click();
//
//		driver.findElement(By.partialLinkText("Logo")).click();
		
     // Login to an Account
		driver.findElement(By.cssSelector("input#username")).sendKeys("jee@A2gmail.com");

		driver.findElement(By.id("password")).sendKeys("GFSSVGGSGGHYBSSY");

		driver.findElement(By.name("login")).click();
		

		//Enter the key word (DRESS) in search text box

		driver.findElement(By.cssSelector("a.noo-search")).click();

		driver.findElement(By.xpath("//input[@name=\"s\"]")).sendKeys("Dress");

		driver.findElement(By.xpath("//input[@name=\"s\"]")).submit();
		
		//set grid to list

		WebElement filter_list = driver.findElement(
				By.xpath("//div[@class=\"pull-right noo_woocommerce-catalog\"]//select[@name=\"filter_style\"]"));
		
		Select f1 = new Select(filter_list);

		f1.selectByValue("list");
		
		//select dropdown orderby -- low to high

		WebElement filter2 = driver.findElement(By.className("orderby"));

		Select s1 = new Select(filter2);

		s1.selectByIndex(4);

		Thread.sleep(1000);
		
		//select first image
		

		driver.findElement(By.cssSelector("a[aria-label=\"Select options for “Black Cross Back Maxi Dress”\"]"))
				.click();

		
		FileWriter fw= new FileWriter("/Users/JE20362903/eclipse-workspace/sel_handson1/description.txt");
		String des=driver.findElement(By.className("product-essential__description")).getText();	
		fw.write(des);
		System.out.println("This is product description and it will store in a flat file -- "+ des);
	    fw.close();
		
		Thread.sleep(1000);

		
		// select color dropdown and set black color
		WebElement color = driver.findElement(By.cssSelector("select[data-attribute_name=\"attribute_pa_color\"]"));
		

		Select s2 = new Select(color);

		s2.selectByValue("black");
		// set size to M

		WebElement size = driver.findElement(By.xpath("//select[@data-attribute_name=\"attribute_pa_size\"]"));

		Select s3 = new Select(size);

		s3.selectByVisibleText("Medium");

		Thread.sleep(1000);
		
		//increasing quantity.

		for (int i = 0; i < 2; i++) {
			driver.findElement(By.className("qty-increase")).click();
		}

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.single_add_to_cart_button")).click();

		driver.findElement(By.linkText("View cart")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class=\"checkout-button button alt wc-forward wp-element-button\"]")).click();

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#billing_first_name")).clear();
		driver.findElement(By.cssSelector("input#billing_first_name")).sendKeys("Jeevan");


		driver.findElement(By.name("billing_last_name")).clear();
		driver.findElement(By.name("billing_last_name")).sendKeys("A");
		
		driver.findElement(By.cssSelector("input#billing_address_1")).clear();
		driver.findElement(By.cssSelector("input#billing_address_1"))
				.sendKeys("#1-150 Bantwal Navoor Post and Village");

		driver.findElement(By.name("billing_city")).clear();
		driver.findElement(By.name("billing_city")).sendKeys("Bantwal");

		driver.findElement(By.id("select2-billing_state-container")).click();

		driver.findElement(By.cssSelector("input.select2-search__field")).clear();
		driver.findElement(By.cssSelector("input.select2-search__field")).sendKeys("Karnataka");

		driver.findElement(By.cssSelector("input.select2-search__field")).sendKeys(Keys.ARROW_DOWN);

		driver.findElement(By.cssSelector("input.select2-search__field")).sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input#billing_postcode")).clear();
		driver.findElement(By.cssSelector("input#billing_postcode")).sendKeys("574211");

		driver.findElement(By.xpath("//input[@type=\"tel\"]")).clear();
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("1234567890");

	   driver.findElement(By.name("terms")).click();
		
		//driver.findElement(By.xpath("//input[@id='terms']")).click();

	   

		Thread.sleep(2000);

		driver.findElement(By.id("place_order")).click();

		Thread.sleep(1000);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)");

		Thread.sleep(1000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,-500)");

		System.out.println(driver.findElement(By.cssSelector("div.entry-content")).getText());

		driver.findElement(By.cssSelector("span.cart-item")).click();

		Thread.sleep(1000);

		System.out.println("The cart status " + driver.findElement(By.cssSelector("p.cart-empty")).getText());

		driver.findElement(By.linkText("My Account")).click();

		Thread.sleep(1000);

		driver.findElement(By.partialLinkText("Ord")).click();

		Thread.sleep(1000);

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,-500)");

		System.out.println("The order details "
				+ driver.findElement(By.cssSelector("div.woocommerce-MyAccount-content")).getText());

		driver.findElement(By.linkText("Logout")).click();
		
		
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
