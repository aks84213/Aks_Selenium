package FreshPractise;

import org.openqa.selenium.By;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String t1="amazon.in";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan.s\\Desktop\\chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		// Open Google
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		System.out.println("I am completed ");
		//driver.get(t1);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		Thread.sleep(5000);
		//C:\Users\mohan.s\Desktop
		// Close browser
	}

}
