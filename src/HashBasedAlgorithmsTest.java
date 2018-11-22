import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashBasedAlgorithmsTest {

    @Test
    public void twoSumMembersExist() {

        int[] members = {30, 14, 7, 5};
        Assert.assertTrue(HashBasedAlgorithms.twoSumMembersExist(members, 44));
        Assert.assertFalse(HashBasedAlgorithms.twoSumMembersExist(members, 45));
    }

    @Test
    public void testZeroCase() {

        int[] members = {0, 0, 0, 0};
        Assert.assertTrue(HashBasedAlgorithms.twoSumMembersExist(members, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidInput() {

        int[] members = {};
       HashBasedAlgorithms.twoSumMembersExist(members, 0);
    }
}