//написать тест который:
//зайдет на страничку https://demoqa.com/automation-practice-form
//заполнит поля :
//Name
//Email
//Mobile
//Subjects
package lesson12;

import сonfig.BaseClass;
import data.User;
import org.openqa.selenium.By;

public class SecondTest extends BaseClass {
    static {
        BaseClass.createDriver();
    }

    public static void main(String[] args) {
        openPage(); // Run first test
        prefillForm(); //Run second test
        BaseClass.closeDriver(); // Don't forget to close driver in the end of all tests
    }

    //The First test that opens page
    public static void openPage() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    //The Second test that prefill form
    private static void prefillForm() {
        User user = new User();
        By inputNameLocator = By.id("firstName");
        By inputEmailLocator = By.id("userEmail");
        By inputMobileLocator = By.id("userNumber");
        By inputSubjectsLocator = By.id("subjectsInput");
        driver.findElement(inputNameLocator).sendKeys(user.getName());
        driver.findElement(inputEmailLocator).sendKeys(user.getEmail());
        driver.findElement(inputMobileLocator).sendKeys(user.getMobile());
        driver.findElement(inputSubjectsLocator).sendKeys(user.getSubjects());
    }
}


