import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class StringPermutationsTest {

    @Test
    public void getAllPermutations() {

        HashSet<String> permutations = StringPermutations.getAllPermutations("abc");
        int permutationsLength = permutations.size();
    }
}