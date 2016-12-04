package main.java.javacore5.homework6;


public final class ArraysUtils {

    static int MAX = Integer.MIN_VALUE;
    static int SECONDLARGEST = Integer.MIN_VALUE;

    static int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static int intSum() {
        int sum = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }

        return sum;
    }

    public static int intMin() {
        int min = arrayInt[0];

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
        }

        return min;
    }

    public static int intMax() {
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > MAX) {
                MAX = arrayInt[i];
            }
        }

        return MAX;
    }

    public static int intMaxPositive() {
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

    public static int intMult() {
        int mult = 1;

        for (int i = 0; i < arrayInt.length; i++) {
            mult *= arrayInt[i];
        }

        return mult;
    }

    public static int intModulus() {
        int modulus;

        modulus = arrayInt[arrayInt.length - 1] % arrayInt[0];

        return modulus;
    }

    public static int intSecondLargest() {
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > SECONDLARGEST && arrayInt[i] < MAX) {
                SECONDLARGEST = arrayInt[i];
            }
        }

        return SECONDLARGEST;
    }

    public static int[] reverse() {
        int[] reverseArray = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            int temp = arrayInt[i];
            reverseArray[i] = arrayInt[arrayInt.length - i - 1];
            ;
            arrayInt[arrayInt.length - i - 1] = temp;
        }

        for (int j = 0; j < reverseArray.length; j++) {
            System.out.print(reverseArray[j] + " ");
        }

        return reverseArray;
    }

    public static int[] findEvenElements() {
        int[] evenArray = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            if (i % 2 == 0) {
                evenArray[i] = i;
            }
        }

        for (int j = 0; j < evenArray.length; j++) {
            if (j % 2 == 0) {
                System.out.print(evenArray[j] + " ");
            }
        }

        return evenArray;
    }

    public static void main(String[] args) throws NullPointerException {
        System.out.println(intSum());
        System.out.println(intMin());
        System.out.println(intMax());
        System.out.println(intMaxPositive());
        System.out.println(intMult());
        System.out.println(intModulus());
        System.out.println(intSecondLargest());
        reverse();
        System.out.println("");
        findEvenElements();
    }
}
