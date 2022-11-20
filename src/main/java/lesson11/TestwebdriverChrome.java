package lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestwebdriverChrome {
    public static void main(String[] args) throws InterruptedException {
  //      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Julia\\driversweb\\chromedriver.exe"); // можно НЕ писать єту строку
        //      - а в системных переменных компьютера (Advanced system settings) в Path указать путь, где лежит Драйвер
        WebDriver driver = new ChromeDriver();
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
        try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
                driver.quit();
    }
}


