package javacore5.homework6;


public final class ArraysUtils {

    private static int MAX = Integer.MIN_VALUE;
    private static int SECONDLARGEST = Integer.MIN_VALUE;

    private int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static int intSum(int[] arrayInt) {
        int sum = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }

        return sum;
    }

    public static int intMin(int[] arrayInt) {
        int min = arrayInt[0];

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
        }

        return min;
    }

    public static int intMax(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > MAX) {
                MAX = arrayInt[i];
            }
        }

        return MAX;
    }

    public static int intMaxPositive(int[] arrayInt) {
        int maxPositive = Integer.MIN_VALUE;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > maxPositive && arrayInt[i] > 0) {
                maxPositive = arrayInt[i];
            } else if (arrayInt[i] < 0) {
                maxPositive = 0;
            }
        }

        return maxPositive;
    }

    public static int intMult(int[] arrayInt) {
        int mult = 1;

        for (int i = 0; i < arrayInt.length; i++) {
            mult *= arrayInt[i];
        }

        return mult;
    }

    public static int intModulus(int[] arrayInt) {
        int modulus;

        modulus = arrayInt[arrayInt.length - 1] % arrayInt[0];

        return modulus;
    }

    public static int intSecondLargest(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > SECONDLARGEST && arrayInt[i] < MAX) {
                SECONDLARGEST = arrayInt[i];
            }
        }

        return SECONDLARGEST;
    }

    public static int[] reverse(int[] arrayInt) {
        int[] reverseArray = arrayInt.clone();
        for (int i = 0; i < reverseArray.length - 1; i++) {
            for (int j = i + 1; j < reverseArray.length; j++) {
                if (reverseArray[i] < reverseArray[j]) {
                    int temp = reverseArray[j];
                    reverseArray[j] = reverseArray[i];
                    reverseArray[i] = temp;
                }
            }
        }

        return reverseArray;
    }

    public static int[] findEvenElements(int[] arrayInt) {
        int noEmpty = 0;
        for (int m = 0; m < arrayInt.length; m++) {
            if (arrayInt[m] != 0) {
                noEmpty++;
            }
        }

        int[] evenArray = new int[noEmpty];

        int count = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 0 && arrayInt[i] != 0) {
                evenArray[count] = arrayInt[i];
                count++;
            }
        }

        return evenArray;
    }
}
