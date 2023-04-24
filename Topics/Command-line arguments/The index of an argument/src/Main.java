import java.lang.reflect.Array;
import java.util.*;

class Problem {
    public static void main(String[] args) {
//        System.out.println(Arrays.asList(args).indexOf("test"));
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.next();
        String[] line = scanner.nextLine().split(" ");
        int count =0;
        int[] arr = new int[line.length];
        /*for (int i = 0; i < line.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }*/
        System.out.println(number);
        System.out.println(number);
        System.out.println(Arrays.asList(line));


    }
}
