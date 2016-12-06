package javacore5.homework2;

public class Task1 {

    static int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static double[] arrayDouble = {1.0, 2.0, 3.0, 4.0, 5.0, -6.0, -7.0, -8.0, -9.0, -10.0};

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
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
        }

        return max;
    }

    public static double doubleMaxPositive(double[] arrayDouble) {
        double maxPositive = Double.MIN_VALUE;

        for (int i = 0; i < arrayDouble.length; i++) {
            if (arrayDouble[i] > maxPositive && arrayDouble[i] > 0) {
                maxPositive = arrayDouble[i];
            }
        }

        return maxPositive;
    }

    public static double doubleMult(double[] arrayDouble) {
        double mult = 1.0;

        for (int i = 0; i < arrayDouble.length; i++) {
            mult *= arrayDouble[i];
        }

        return mult;
    }

    public static int intModulus(int[] arrayInt) {
        return arrayInt[arrayInt.length - 1] % arrayInt[0];
    }

    public static int intSecondLargest(int[] arrayInt) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for (int j = 0; j < arrayInt.length; j++) {
            if (arrayInt[j] > secondLargest && arrayInt[j] < max) {
                secondLargest = arrayInt[j];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(intSum(arrayInt));
        System.out.println(intMin(arrayInt));
        System.out.println(intMax(arrayInt));
        System.out.println(doubleMaxPositive(arrayDouble));
        System.out.println(doubleMult(arrayDouble));
        System.out.println(doubleMult(arrayDouble));
        System.out.println(intModulus(arrayInt));
        System.out.println(intSecondLargest(arrayInt));
    }

}
