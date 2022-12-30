public class Lesson04task3 {
    // Используя while, вывести в Standard Output первых 10 чисел Фибоначчи.
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int numFibonacci;
        System.out.println("  10 Чисел Фибоначчи:");
        String textFib = "Число Фибоначчи";

        System.out.printf("1. %s  0 %n", textFib);
        System.out.printf("2. %s  1 %n", textFib);

        int n = 3;
        while (n < 11) {
            numFibonacci = i + j;
            i = j;
            j = numFibonacci;
            System.out.printf("%d. %s %d %n", n, textFib, numFibonacci);
            n++;
        }
    }
}
