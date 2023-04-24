import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int border = scanner.nextInt();
        int sum = 0;
        for (Integer integer : array) {
            if (integer > border) {
                sum += integer;
            }
        }
        System.out.println(sum);
        // put your code here
    }
}