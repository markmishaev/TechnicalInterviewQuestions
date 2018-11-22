import org.junit.Test;

import static org.junit.Assert.*;

public class RandomStringGeneratorTest {

    @Test
    public void generateBoundedRandomStringBasedOnPlainJava() {
    }

    @Test
    public void generateBoundedRandomStringBasedOnPlainJava1() {
        String randomPassword = RandomStringGenerator.generateBoundedRandomStringBasedOnPlainJava();
        System.out.println(randomPassword);
    }

    @Test
    public void generatePassword() {
        String randomPassword = RandomStringGenerator.generatePassword(8, RandomStringGenerator.ALPHA_CAPS);
        System.out.println(randomPassword);
    }
}