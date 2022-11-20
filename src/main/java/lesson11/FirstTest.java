package lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        test1(); // визвати перший тест
        driver.quit(); // не забувати завжди закривати драйвер в кінці
    }

    //Перший тест, який виводить тайтл сторінки
    public static void test1() {
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());

        try { // Початок метода затримки
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }   // Кінець метода затримки

        if (!driver.getTitle().equals("Комп'ютерна школа Hillel у Києві: Курси IT-технологій")) { // Перевірка чи равен тайтл
            System.err.println("Test1 is Failed");
        }
    }
}
