package LAB;

//Write a program to find the second largest number in an array.

public class Second_Largest_Array {
    static int printSecondLargest(int[] numbers, int len) {
        int temp;
        //second largest print
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers[len - 2]; //second largest
    }

    public static void main(String[] args) {
        //original array
        int[] numbers = {5, 2, 8, 1, 9, 3, 4, 7, 5};
        int len = numbers.length;
        System.out.println("Second largest number is: " + printSecondLargest(numbers, len));
    }
}
