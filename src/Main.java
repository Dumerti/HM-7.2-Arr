public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задание №1");

        int[] arr = {35000, 25000, 35000, 25000, 70000};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        System.out.println("Задание №2");

        int[] arr2 = {3459, 1959, 2490, 5903, 9032};
        int max = -1;
        int min = 99999999;
        for (int j : arr2) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println();
        System.out.println("Задача №3");

        int [] expenses = {3459, 1959, 2490, 5903, 9032};
        double total = 0;
        for (int i : expenses) {
            total += i;
        }
        total = total / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + total + " рублей");

        System.out.println();
        System.out.println("Задача №4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }













    }
}