import java.util.Arrays;
import java.util.HashSet;

public class ArrayIntersection {

    public static HashSet<Integer> arraysIntersection(int[] array1, int[] array2)
    {
        HashSet<Integer> intersection = new HashSet<>();

        //Sorts array first
        Arrays.sort(array1);
        Arrays.sort(array2);

        int k = array1.length;
        int m = array2.length;

        int i = 0, j = 0;

        while(i < k && j  < m)
        {
            if(array1[i] < array2[j])
            {
                i++;
            }
            else if (array1[i] > array2[j])
            {
                j++;
            }
            else {
                intersection.add(array1[i]);
                i++;
                j++;
            }
        }

        return  intersection;
    }
}
