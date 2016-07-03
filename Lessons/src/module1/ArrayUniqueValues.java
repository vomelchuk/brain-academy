package module1;
import java.util.Arrays;


public class ArrayUniqueValues {

    public static void main(String[] args) {
        task4();
    }

    private static void task4() {

        int[] arr1 = {1, 1, 3, 3, 5};
        int[] arr2 = {5, 9, 5, 67, 2, 2, 7};
        int[] arr3;

        int size = 0;

        int[] biggerArray = arr1.length < arr2.length ? arr2 : arr1;
        int[] lessArray = arr1.length < arr2.length ? arr1 : arr2;
        // found size of result array
        for (int i = 0; i < biggerArray.length; i++) {

            int biggerElem = biggerArray[i];
            int lessElem = i < lessArray.length ? lessArray[i] : 0;

            // biggerArray
            int repeated = 0;
            for (int j = 0, j2 = 0; j < biggerArray.length; j++) {

                if (i != j && biggerElem == biggerArray[j] ||
                        (j < lessArray.length && biggerElem == lessArray[j2++])) {
                    repeated++;
                    break;
                }
            }
            if (repeated == 0) {
                size++;
            }

            // lessArray
            repeated = 0;
            if (i < lessArray.length) {
                for (int j = 0; j < biggerArray.length; j++) {
                    if (lessElem == biggerArray[j] ||
                            (i != j && j < lessArray.length && lessElem == lessArray[j])) {
                        repeated++;
                        break;
                    }
                }
                if (repeated == 0) {
                    size++;
                }
            }

        }

        arr3 = new int[size];

        // push unique values to result array
        size = 0;
        for (int i = 0; i < biggerArray.length; i++) {

            int biggerElem = biggerArray[i];
            int lessElem = i < lessArray.length ? lessArray[i] : 0;

            // biggerArray
            int repeated = 0;
            int j, j2;
            for (j = 0, j2 = 0; j < biggerArray.length; j++) {

                if (i != j && biggerElem == biggerArray[j] ||
                        (j < lessArray.length && biggerElem == lessArray[j2++])) {
                    repeated++;
                    break;
                }
            }
            if (repeated == 0) {
                arr3[size++] = biggerArray[i];
            }

            // lessArray
            repeated = 0;
            if (i < lessArray.length) {
                for (j = 0; j < biggerArray.length; j++) {
                    if (lessElem == biggerArray[j] ||
                            (i != j && j < lessArray.length && lessElem == lessArray[j])) {
                        repeated++;
                        break;
                    }
                }
                if (repeated == 0) {
                    arr3[size++] = lessArray[i];
                }
            }

        }
        // display results
        System.out.println("array1 = " + Arrays.toString(arr1));
        System.out.println("array2 = " + Arrays.toString(arr2));
        System.out.println();
        System.out.println("result = " + Arrays.toString(arr3));

    }
}
