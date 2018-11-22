import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryRepresentationTest {

    @Test
    public void numberOfOnesInBinaryRepresentation() {
        Assert.assertEquals(3, BinaryRepresentation.numberOfOnesInBinaryRepresentation(11));
    }
}