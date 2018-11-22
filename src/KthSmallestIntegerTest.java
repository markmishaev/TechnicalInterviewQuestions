import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthSmallestIntegerTest {

    @Test
    public void method1() {

        int[] arr = {17 , 42, 0, 5, 10, -3, 2, 9};

        Assert.assertEquals(KthSmallestInteger.method1(arr,1), -3);
        Assert.assertEquals(KthSmallestInteger.method1(arr,8), 42);
        Assert.assertEquals(KthSmallestInteger.method1(arr,2), 0);
    }

    @Test
    public void method2() {

        int[] arr = {17 , 42, 0, 5, 10, -3, 2, 9};

        Assert.assertEquals(KthSmallestInteger.method2(arr, 0, arr.length - 1, 1), -3);
    }
}