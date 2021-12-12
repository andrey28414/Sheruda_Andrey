import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/andrey/Documents/c2/chromedriver");
        WebDriver driver = new ChromeDriver();

         String login = "Admin";
         String password = "admin123";

         driver.get("https://opensource-demo.orangehrmlive.com/");

         WebElement element1 = driver.findElement(By.id("txtUsername"));
         WebElement element2 = driver.findElement(By.id("txtPassword"));

         element1.sendKeys(login);
         element2.sendKeys(password);
         WebElement login_button = driver.findElement(By.id("btnLogin"));
         login_button.click();

         WebElement admin_button = driver.findElement(By.id("menu_admin_viewAdminModule"));
         admin_button.click();

         WebElement managment_button = driver.findElement(By.id("menu_admin_UserManagement"));
         managment_button.click();

         WebElement users_button = driver.findElement(By.id("menu_admin_viewSystemUsers"));
         users_button.click();

        WebElement add_button = driver.findElement(By.id("btnAdd"));
        add_button.click();

        Select user_role = new Select(driver.findElement(By.id("systemUser_userType")));
        user_role.selectByVisibleText("ESS");

        WebElement employer_name = driver.findElement(By.id("systemUser_employeeName_empName"));
        employer_name.sendKeys("Jordan Mathews");

        WebElement user_name = driver.findElement(By.id("systemUser_userName"));
        user_name.sendKeys("Jordan Martins");

        Select user_status = new Select(driver.findElement(By.id("systemUser_status")));
        user_status.selectByVisibleText("Enabled");

        WebElement pass = driver.findElement(By.id("systemUser_password"));
        pass.sendKeys(password);

        WebElement repass = driver.findElement(By.id("systemUser_confirmPassword"));
        repass.sendKeys(password);

        WebElement save_button = driver.findElement(By.id("btnSave"));
        save_button.click();

        admin_button.click();
        managment_button.click();
        users_button.click();

        WebElement reset_button = driver.findElement(By.id("resetBtn"));
        reset_button.click();

        WebElement search_user = driver.findElement(By.id("searchSystemUser_userName"));
        search_user.sendKeys("Jordan Martins");

        WebElement search_button = driver.findElement(By.id("searchBtn"));
        search_button.click();

        WebElement check_box = driver.findElement(By.id("ohrmList_chkSelectRecord_74"));
        check_box.click();

        WebElement delete_button = driver.findElement(By.id("btnDelete"));
        delete_button.click();


    }

}
