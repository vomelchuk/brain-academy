package labs;

import java.util.Arrays;

public class LabWork_1_6_1 {

    public static void main(String[] args) {

        final int MIN = 0, MAX = 30;
        int[] array;

        int count = 0;
        for (int i = MIN; i <= MAX; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        array = new int[count];

        int index = 0;
        for (int i = MIN; i <= MAX; i++) {
            if (i % 2 == 0) {
                array[index++] = i;
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
