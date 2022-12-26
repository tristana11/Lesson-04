public class Lesson04task4 {
    public static void main(String[] args) {
        int[] num1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        int j = 0;
        int multi;
        while (i < 10) {
            while (j < 10) {
                multi = num1[i] * num1[j];
                System.out.printf("%d ", multi);
                j++;
            }
            j = 0;
            i++;
            System.out.println();

        }
    }
}
