import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegPage {



    WebDriver driver;
    @FindBy (xpath = ".//*[@name ='firstname']" )
    public WebElement firstNameField;


    @FindBy (xpath = ".//*[@name='lastname']" )
    public WebElement lastNameField;


    @FindBy (xpath = ".//*[@name='reg_email__']" )
    public WebElement etEmail;



    @FindBy (name = "reg_email_confirmation__")
    public WebElement etEmailConfitm;


    @FindBy (xpath = ".//*[@name='reg_passwd__']")
    public WebElement etNewPassword;


    @FindBy (name = "birthday_month")
    WebElement monthDropdown;
            public void selectListMonth () {
                Select chooseMonth = new Select(monthDropdown);
                chooseMonth.selectByValue(String.valueOf(7));


            }

    @FindBy (name = "birthday_day" )
    public WebElement dayDropdown;
            public void selectListDay () {
                Select chooseDay = new Select(dayDropdown);
                chooseDay.selectByValue(String.valueOf(20));
            }


    @FindBy (name = "birthday_year")
    public WebElement yearDropdown;
            public void selectListYear ()  {
                Select chooseYear = new Select(yearDropdown);
                chooseYear.selectByValue(String.valueOf(1995));

            }

    @FindBy (xpath ="//input[@value='2']" )
    public WebElement gender;



    @FindBy (name = "websubmit")
    public WebElement confirmReg;


            public FacebookRegPage (WebDriver driver) {
                PageFactory.initElements(driver, this);
                this.driver = driver;
            }


            public void fillRegForm(DataUserReg userReg) {
                firstNameField.sendKeys(userReg.name);
                lastNameField.sendKeys(userReg.lastName);
                etEmail.sendKeys(userReg.email);
                etEmailConfitm.sendKeys(userReg.confirmEmail);
                etNewPassword.sendKeys(userReg.pass);
                selectListMonth();
                selectListDay ();
                selectListYear();
                gender.click();
            }



















}















//}
//firstNameField = driver.findElement(By.xpath(".//*[@name ='firstname']"));
//        firstNameField.click();
//        firstNameField.sendKeys("Roma");
//
//
//        lastNameField = driver.findElement(By.xpath(".//*[@name='lastname']"));
//        lastNameField.sendKeys("Kapur");
//
//        etMobileNumberEmail = driver.findElement(By.xpath(".//*[@name='reg_email__']"));
//        etMobileNumberEmail.sendKeys("tester@tester.tester");
//
//        etEmailConfitm = driver.findElement(By.name("reg_email_confirmation__"));
//        etEmailConfitm.sendKeys("tester@tester.tester");
//
//        etNewPassword = driver.findElement(By.xpath(".//*[@name='reg_passwd__']"));
//        etNewPassword.sendKeys("Kitzen18!");
//
//
//        drMonth = new Select(driver.findElement(By.name("birthday_month")));
//        drMonth.selectByValue("7");
//
//        drDay = new Select(driver.findElement(By.name("birthday_day")));
//        drDay.selectByValue("20");
//
//        drYear = new Select(driver.findElement(By.name("birthday_year")));
//        drYear.selectByValue("1995");
//
//
//        gender = driver.findElement(By.xpath("//input[@value='2']"));
//        gender.click();
//
//        Thread.sleep(4000);