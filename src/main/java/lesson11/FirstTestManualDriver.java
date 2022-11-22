package lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestManualDriver {
        static WebDriver driver = new ChromeDriver(); // Прописываем драйвер вручную, без общего класса, где хранятся все настройки дравера

        public static void main(String[] args) {
            test1(); // Run first test
            driver.quit(); // Закрываем драйвер вручную, без общего класса, где хранятся все настройки дравера
        }

        //The First test that shows the page's title
        public static void test1() {
            driver.get("https://ithillel.ua/");
            System.out.println(driver.getTitle());

            try { // The beginning of delay (обычно выносится в общие настройки драйвера)
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }   // The end of delay (обычно выносится в общие настройки драйвера)

            if (!driver.getTitle().equals("Комп'ютерна школа Hillel у Києві: Курси IT-технологій")) { // Check if Title is right
                System.err.println("Test1 is Failed");
            }
        }
    }
