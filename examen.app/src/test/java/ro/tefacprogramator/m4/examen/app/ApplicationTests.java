package ro.tefacprogramator.m4.examen.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

class ApplicationTests {

	@Test
	void TestSelenium() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().setPosition(new Point(1800, 0));
        driver.manage().window().setSize(new Dimension(1200, 720));
        driver.get("http://localhost:5173/");
        driver.findElement(By.cssSelector(".toy-name")).sendKeys("Selenium");
        driver.findElement(By.cssSelector(".toy-price")).sendKeys("12");
		driver.findElement(By.cssSelector(".toy-toy-kind")).sendKeys("1");
		driver.findElement(By.cssSelector(".toy-category")).sendKeys("1");
        driver.findElement(By.cssSelector(".add-button")).click();
		String status = driver.findElement(By.cssSelector(".toy-add-status")).getText();
		assertTrue(status.contains("Toy created"));
		int rowCount = driver.findElements(By.cssSelector("table tbody tr")).size();
		driver.quit();
		assertTrue(rowCount >= 3, "The toy table does not contain at least three rows.");
	}

}