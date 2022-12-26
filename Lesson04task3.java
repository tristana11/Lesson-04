public class Lesson04task3 {
    // Используя while, вывести в Standard Output первых 10 чисел Фибоначчи.
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int n = 3;
        int numNext;
        System.out.println("1 число Фибоначчи  0");
        System.out.println("2 число Фибоначчи  1");
        while (n < 11) {
            numNext = i + j;
            i = j;
            j = numNext;
            System.out.printf("%d число Фибоначчи  %d %n", n, numNext);
            n++;
        }
    }
}
