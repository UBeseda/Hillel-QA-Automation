// Написать метод который открывает страницу https://ithillel.ua/ и печатает в консоль тайтл страницы

package lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        test1(); // run first test
        driver.quit(); // don't forget to close driver in the end of test
    }

    //The First test witch shows the page's title
    public static void test1() {
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());

        try { // The beginning of delay
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }   // The end of delay

        if (!driver.getTitle().equals("Комп'ютерна школа Hillel у Києві: Курси IT-технологій")) { // Check if Title is right
            System.err.println("Test1 is Failed");
        }
    }
}
