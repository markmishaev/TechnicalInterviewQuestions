import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationsTest {

    @Test
    public void removeCharFromString() {
        Assert.assertEquals(StringManipulations.removeCharFromString("aaabbcsf",'a'),"bbcsf");
        Assert.assertEquals(StringManipulations.removeCharFromString("abcd",'c'),"abd");
        Assert.assertEquals(StringManipulations.removeCharFromString("abcd",'d'),"abc");

    }

    @Test
    public void removeCharFromStringRecursive() {
        Assert.assertEquals(StringManipulations.removeCharFromStringRecursive("aaabbcsf",'a'),"bbcsf");
        Assert.assertEquals(StringManipulations.removeCharFromStringRecursive("abcd",'c'),"abd");
        Assert.assertEquals(StringManipulations.removeCharFromStringRecursive("abcd",'d'),"abc");
    }

    @Test
    public void removeCharFromStringCornerCases() {
        Assert.assertEquals(StringManipulations.removeCharFromString("",'a'),"");
        Assert.assertEquals(StringManipulations.removeCharFromStringRecursive("",'a'),"");

        Assert.assertEquals(StringManipulations.removeCharFromString("aaaaaaaaaaa",'a'),"");
        Assert.assertEquals(StringManipulations.removeCharFromStringRecursive("aaaaaaaaaaa",'a'),"");
    }
}