import java.util.*;

public class PairWithDifferenceFinder {

    public static List<Pair> findPairWithDifferenceKNaiveSolution(int[] array, int k) {
        List<Pair> resultList = new ArrayList<>();
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[i] - array[j]) == k) {
                    resultList.add(new Pair(array[i], array[j]));
                }
            }
        }

        return resultList;
    }

    public static List<Pair> findPairWithDifferenceKWithHashTable(int[] array, int k) {

        Map<Integer, Integer> valuesHash = new HashMap<>();
        for (int i = 0; i <= array.length - 1; i++) {
            valuesHash.put(i, array[i]);
        }

        List<Pair> resultList = new ArrayList<>();
        for (int i = 0; i <= array.length - 1; i++) {
            int complement = array[i] + k;

            if (valuesHash.containsValue(complement)) {
                resultList.add(new Pair(array[i], complement));
            }
        }

        return resultList;
    }


    public static List<Pair> findPairWithDifferenceKWithSearch(int[] array, int k) {

        List<Pair> resultList = new ArrayList<>();

        //nlogn sort
        Arrays.sort(array);

        for (int i = 0; i <= array.length - 1; i++) {
            int complement = array[i] + k;
            boolean complementFound = binarySearch(array, 0, array.length - 1, complement);
            if (complementFound) {
                resultList.add(new Pair(array[i], complement));
            }
        }

        return resultList;
    }

    private static boolean binarySearch(int arr[], int l, int r, int x) {

        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return true;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        //  in array
        return false;
    }
}
