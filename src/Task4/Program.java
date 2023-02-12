/*
ДОМАШНЕЕ ЗАДАНИЕ
Создайте класс Телевизор. Он должен хранить информацию о названии модели, год выпуска, цена, диагональ, производитель. Нужно создать набор телевизоров
и выполнить следующие задачи:
■ Показать все телевизоры;
■ Показать телевизоры с заданной диагональю;
■ Показать все телевизоры одного производителя;
■ Показать все телевизоры текущего года;
■ Показать все телевизоры дороже заданной цены;
■ Показать все телевизоры, отсортированные по цене
по возрастанию;
■ Показать все телевизоры, отсортированные по цене
по убыванию.
Практические задания
2
■ Показать все телевизоры, отсортированные по диагонали по возрастанию;
■ Показать все телевизоры, отсортированные по диагонали по убыванию.
 */
package Task4;
import Task3.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program{
    public static void main(String[] args) {
        //Здесь ваша реализация ДЗ

        List<Tv> TvShop = new ArrayList<>(List.of(
                new Tv("Sony XR-55A95K", 2023, 250000, 55, "Sony"),
                new Tv("LG OLED65C2RLA", 2022, 180000, 65, "LG"),
                new Tv("Samsung QN90A", 2021, 190000, 65, "Samsung"),
                new Tv(" LG OLED65G2", 2021, 265000, 65, "LG"),
                new Tv("Samsung QE65S95B", 2020, 257900, 65, "Samsung"),
                new Tv("Philips 48OLED806", 2020, 147600, 65, "Philips"),
                new Tv("Samsung Q90T", 2021, 196990, 85, "Samsung"),
                new Tv("Samsung Q80A", 2021,81990, 50, "Samsung"),
                new Tv("Thomson T43USL7010 ", 2022,28402 , 43, "Thomson"),
                new Tv("Hisense 55A6BG", 2022, 8545, 32, "Hisense")
        ));
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Все телевизоры:");
        TvShop.forEach(System.out::println);
        System.out.println("Введите диагональ:");
        int diagonal = scanner.nextInt();
        System.out.println("Все телевизоры с диагональю " + diagonal + ":");
        TvShop.stream()      //Stream<Tv>
                .filter(Tv -> Tv.getDiagonal()==diagonal)
                .forEach(System.out::println);
        System.out.println("Введите производителя:");
        String company = scanner1.nextLine();
        System.out.println("Все телевизоры  производителя:" + company + ":");
        TvShop.stream()      //Stream<Tv>
                .filter(car -> car.getCompany().equals(company))
                .forEach(System.out::println);
        int now=2022;
        System.out.println("Все телевизоры текущего года " + now + ":");
        TvShop.stream()      //Stream<Tv>
                .filter(Tv -> Tv.getYear()==now)
                .forEach(System.out::println);
        System.out.println("Введите цену:");
        int price= scanner.nextInt();
        System.out.println("Все телевизоры дороже " + price + ":");
        TvShop.stream()      //Stream<Tv>
                .filter(Tv -> Tv.getPrice()>price)
                .forEach(System.out::println);
        System.out.println("все телевизоры, отсортированные по цене\n" +
                " возрастанию " + ":");
        List<Tv> sortedList = TvShop.stream()
                .sorted(Comparator.comparingInt(Tv::getPrice))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
        System.out.println("все телевизоры, отсортированные по цене\n" +
                " убыванию" +":");
        List<Tv> sortedListmin = TvShop.stream()
                .sorted(Comparator.comparingInt(Tv::getPrice)
                .reversed())
                .collect(Collectors.toList());

        sortedListmin.forEach(System.out::println);
        System.out.println("все телевизоры, отсортированные по диагонали\n" +
                " возрастанию " +  ":");
        List<Tv> sortedListbyDiagonal = TvShop.stream()
                .sorted(Comparator.comparingInt(Tv::getDiagonal))
                .collect(Collectors.toList());
        sortedListbyDiagonal.forEach(System.out::println);
        System.out.println("все телевизоры, отсортированные по диагонали\n" +
                " убыванию" + now + ":");
        List<Tv> sortedListbyDiagonalmin = TvShop.stream()
                .sorted(Comparator.comparingInt(Tv::getDiagonal)
                        .reversed())
                .collect(Collectors.toList());
        sortedListbyDiagonalmin.forEach(System.out::println);
    }
}
