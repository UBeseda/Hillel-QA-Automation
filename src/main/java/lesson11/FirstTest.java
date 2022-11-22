// Написать метод который открывает страницу https://ithillel.ua/ и печатает в консоль тайтл страницы

package lesson11;

import сonfig.BaseClass;

public class FirstTest extends BaseClass {

    static {
        BaseClass.createDriver();
    }

    public static void main(String[] args) {
        test1(); // Run first test
        BaseClass.closeDriver(); // Don't forget to close driver in the end of test
    }

    //The First test that shows the page's title
    public static void test1() {
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());

        if (!driver.getTitle().equals("Комп'ютерна школа Hillel у Києві: Курси IT-технологій")) { // Check if Title is right
            System.err.println("Test1 is Failed");
        }
    }
}
