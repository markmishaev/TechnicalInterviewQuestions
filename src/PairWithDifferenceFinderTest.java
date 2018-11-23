import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PairWithDifferenceFinderTest {

    @Test
    public void findPairWithDifferenceKWithSearch() {

        int[] array = new int[]{1, 7, 5, 9, 2, 12, 3};

        List<Pair> expectedPairs = new ArrayList<>();
        expectedPairs.add(new Pair(1, 3));
        expectedPairs.add(new Pair(3, 5));
        expectedPairs.add(new Pair(5, 7));
        expectedPairs.add(new Pair(7, 9));

        List<Pair> actualPairs = PairWithDifferenceFinder.findPairWithDifferenceKWithSearch(array, 2);

        assertThat(actualPairs, is(expectedPairs));
    }

    @Test
    public void findPairWithDifferenceKWithHashTable() {

        int[] array = new int[]{1, 7, 5, 9, 2, 12, 3};

        List<Pair> expectedPairs = new ArrayList<>();
        expectedPairs.add(new Pair(1, 3));
        expectedPairs.add(new Pair(3, 5));
        expectedPairs.add(new Pair(5, 7));
        expectedPairs.add(new Pair(7, 9));

        List<Pair> actualPairs = PairWithDifferenceFinder.findPairWithDifferenceKWithHashTable(array, 2);
    }
}