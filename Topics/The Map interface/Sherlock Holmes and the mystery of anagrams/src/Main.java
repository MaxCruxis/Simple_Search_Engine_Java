import java.security.Key;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> word1 = new HashMap<>();
        Map<String, Integer> word2 = new HashMap<>();
        String[] word1Letters = scanner.nextLine().toLowerCase(Locale.ROOT).split("");
        String[] word2Letters = scanner.nextLine().toLowerCase(Locale.ROOT).split("");
        Arrays.asList(word1Letters).forEach(word -> {
            if (word1.containsKey(word)) {
                word1.put(word, word1.get(word) + 1);

            } else {
                word1.put(word, 1);
            }
        });
        Arrays.asList(word2Letters).forEach(word -> {
            if (word2.containsKey(word)) {
                word2.put(word, word2.get(word) + 1);

            } else {
                word2.put(word, 1);
            }
        });
        if (Objects.equals(word1, word2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    // put your code here
}