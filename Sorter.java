import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку #" + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        Arrays.sort(strings, Comparator.comparingInt(String::length).thenComparing(String::valueOf));

        System.out.println("Отсортированные строки:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
