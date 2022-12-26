public class Lesson04task3 {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int n = 3;
        int numNext;
        System.out.println("1 исло Фибоначчи  0");
        System.out.println("2 исло Фибоначчи  1");
        while (n < 11) {
            numNext = i + j;
            i = j;
            j = numNext;
            System.out.printf("%d исло Фибоначчи  %d %n", n, numNext);
            n++;
        }
    }
}
