import java.util.HashSet;

public class StringPermutations {

    public static HashSet<String> getAllPermutations(String givenString) {

        HashSet<String> permutations = new HashSet<>();

        if (givenString == null || givenString.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char first = givenString.charAt(0);
        String remainingString = givenString.substring(1);

        HashSet<String> words = getAllPermutations(remainingString);

        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                String suffix = word.substring(i);
                permutations.add(prefix + first + suffix);
            }
        }

        return permutations;
    }
}