import com.sun.javaws.exceptions.InvalidArgumentException;
import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import org.junit.Assert;
import org.junit.Test;

public class StringConverterTest {

    @Test
    public void testConvert_String_To_Number() {
        Assert.assertEquals(1234, StringConverter.convert_String_To_Number("1234"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidString() {
        System.out.println(StringConverter.convert_String_To_Number(""));
    }
}