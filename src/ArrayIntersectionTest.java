import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.*;

public class ArrayIntersectionTest {

    @Test
    public void arraysIntersection() {

        int arr1[] = {15, 22, 4, 5, 6, 2, 1, 3, 55};
        int arr2[] = {2, 3, 22, 7, 15, 3};

        HashSet<Integer> intersection = ArrayIntersection.arraysIntersection(arr1, arr2);

        Iterator<Integer> it = intersection.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}