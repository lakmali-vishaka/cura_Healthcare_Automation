package cura_healthcare.cura_healthcare;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Make_Appoinment {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty ("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\First_project\\src\\main\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://katalon-demo-cura.herokuapp.com/");
			 
	        driver.manage().window().maximize();

	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	        
	        
	        //make appointment
	        driver.findElement(By.id("btn-make-appointment")).click();
	        Thread.sleep(2000);
	        
	        //login
	        driver.findElement(By.id("txt-username")).sendKeys("John Doe"); 
	        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
	        
	        driver.findElement(By.id("btn-login")).click();
	        
	        Thread.sleep(3000);
	        
	        
	       //find element in the selected dropDown using selectByIndex
	        WebElement dropdown = driver.findElement(By.id("combo_facility"));
			Select dropdownValue=new Select(dropdown);
			
			
			dropdownValue.selectByValue("Hongkong CURA Healthcare Center");
			Thread.sleep(3000);
			
			//checkBox
			driver.findElement(By.id("chk_hospotal_readmission")).click();
			
			//radio button
			driver.findElement(By.id("radio_program_none")).click();
			
			//pick the date
			driver.findElement(By.id("txt_visit_date")).click();
		    driver.findElement(By.xpath("//table[@class='table-condensed']//tr[2]//td[3]")).click();
		    
		    
		    //comment
		    driver.findElement(By.id("txt_comment")).sendKeys("testing the element");  
		    
		    //click book Appointment 
		    driver.findElement(By.id("btn-book-appointment")).click(); 
		    
		  //click home button
		    WebElement goToHomepage = driver.findElement(By.linkText("Go to Homepage"));
	        goToHomepage.click();
	        Thread.sleep(2000);
 
		    
		   //check history
	        driver.findElement(By.id("menu-toggle")).click();
	        driver.findElement(By.linkText("History")).click();
	        Thread.sleep(2000);
	        
	        //go to profile
	        driver.findElement(By.id("menu-toggle")).click();
	        driver.findElement(By.linkText("Profile")).click();
	        Thread.sleep(2000);
	        
	        
	        //logout
	        driver.findElement(By.linkText("Logout")).click();
	        Thread.sleep(3000);
	       
	       
	       
	        driver.close(); 
		

	}

}
