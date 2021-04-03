import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int [] numbers = {34, 2, 10, 6, 7, 5, 1, 5};

        comparison(numbers);
        bubble(numbers);
    }

    public static void bubble(int numbers[]) {

        int len = numbers.length;

        for (int i = 0; i < len - 1; i++)
            for (int j = 0; j < len - 1; j++)
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }
        System.out.println("This is the full sorted list: ");
        for (int number : numbers){
            System.out.println(number);
                }
            }


    public static void comparison(int numbers[]){
        int len = numbers.length;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input a whole number: ");
        int userNumber = userInput.nextInt();
        int n = 0;

        for (int i = 0; i < len; i++) {

            if(numbers[i] == userNumber){
                n = n + 1;
            }
        }
        System.out.println("We found " + n + " counts of " + userNumber + ".");
    }
}
