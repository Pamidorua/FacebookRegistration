import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class TestFacebook {

    DataUserReg userReg = new DataUserReg( "Roma","MyPass101!", "romka_kapur@icloud.com","romka_kapur@icloud.com","Kapur","20", "7","1995", "2");

    WebDriver driver;


    @BeforeTest
    public void before () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test (priority = 0)
    public void goToRegistrationPage () throws InterruptedException {
        driver.get("https://www.facebook.com/reg/");


        //WebElement addAccount = driver.findElement(By.xpath(".//*[@data-testid='open-registration-form-button']"));
        //addAccount.click();
        Thread.sleep(5000);
    }

    @Test (priority = 1)
    public void enterNameField () {
        FacebookRegPage regPage = new FacebookRegPage(driver);
        regPage.fillRegForm(userReg);
//    regPage.enterName(userReg.name);
//    regPage.enterLastName("Kapur");
//    regPage.enterEmail("romka_kapur@icloud.com");
//    regPage.enterEmailConfirm("romka_kapur@icloud.com");
//    regPage.enterPass(userReg.pass);
//    regPage.selectListDay(String.valueOf(20));
//    regPage.selectListMonth(String.valueOf(7));
//    regPage.selectListYear(String.valueOf(1995));
//    regPage.genderClick(String.valueOf(2));
    }


    @Test (priority = 2)
    public void checkFields () throws InterruptedException {
        FacebookRegPage regPage = new FacebookRegPage(driver);
        Assert.assertEquals(regPage.firstNameField.getAttribute("value" ), userReg.name);
        Assert.assertEquals(regPage.lastNameField.getAttribute("value"), userReg.lastName);
        Assert.assertEquals(regPage.etEmail.getAttribute("value"), userReg.email);
        Assert.assertEquals(regPage.etEmailConfitm.getAttribute("value"), userReg.confirmEmail);
        Assert.assertEquals(regPage.etNewPassword.getAttribute("value"), userReg.pass);
        Assert.assertEquals(regPage.dayDropdown.getAttribute("value"), userReg.dayBirth);
        Assert.assertEquals(regPage.monthDropdown.getAttribute("value"), userReg.mounthBirth);
        Assert.assertEquals(regPage.yearDropdown.getAttribute("value"), userReg.yearBirth);
        Assert.assertEquals(regPage.gender.getAttribute("value"), userReg.choosenGender);
    }

    @Test (priority = 3)
    public void checkButton () {
        FacebookRegPage regPage = new FacebookRegPage(driver);
        regPage.confirmReg.isDisplayed();
    }

    @AfterTest
    public void finishTest () {
        driver.quit();


    }




//    @Test (priority = 2)
//    public void checkFields () throws InterruptedException {
//        Assert.assertEquals( firstNameField.getAttribute("value"), name);
//        Assert.assertEquals(lastNameField.getAttribute("value"), lastname);
//        Assert.assertEquals(etMobileNumberEmail.getAttribute("value"), mobileNumberEmail);
//        Assert.assertEquals(etEmailConfitm.getAttribute("value"), emailConfirm);
//        Assert.assertEquals(etNewPassword.getAttribute("value"), passwrordCheck);
//        Assert.assertEquals(drMonth.getFirstSelectedOption().getText(), "июл");
//        Assert.assertEquals(drDay.getFirstSelectedOption().getText(), "20");
//        Assert.assertEquals(drYear.getFirstSelectedOption().getText(), "1995");
//        Assert.assertEquals(gender.getAttribute("value"),"2");

































    }

