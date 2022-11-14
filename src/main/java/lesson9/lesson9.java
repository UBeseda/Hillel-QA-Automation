//Написать метод который принимает строку . Разбить строку по словам убрав все разделители (пробелы, запятые, точки).
// Сделать набор слов уникальным и вывести результат в консоль, привести первую букву каждого слова в заглавную.
//        Например меторд принял "масло, масло, колбаса, молоко". Вывод в консоль:
//        Масло
//        Колбаса
//        Молоко

package lesson9;

import java.util.*;

public class lesson9 {

    public static void main(String[] args) { //main
       String str = "oil, oil, milk, milk, sausage";
       printExclusive(str);
    } //end of main

    public static void printExclusive(String str){
        String[] words = str.split(", ");
        Set<String> set = new HashSet<String>(List.of(words));
        System.out.println(set);

        for (String test:set){
            System.out.println(test.substring(0, 1).toUpperCase() + test.substring(1));

        }
    }
}






