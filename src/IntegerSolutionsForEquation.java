import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerSolutionsForEquation {

    public static void printPossibleSolutionsToEquation() {
        //a^3 + b^3 = c^3 + d^3
        int n = 1000;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    long d = Math.round(Math.pow((Math.pow(a, 3) + Math.pow(b, 3) - Math.pow(c, 3)), 1 / 3));
                    if (Math.pow(a, 3) + Math.pow(b, 3) == Math.pow(c, 3) + d) {
                        System.out.println(a + " ," + b + "," + c + "," + d);
                    }
                }
            }
        }
    }

    public static void printPossibleSolutionsToEquationOptimized1() {

        //a^3 + b^3 = c^3 + d^3
        int n = 1000;
        Map<Long, List<Integer>> valuesMap = new HashMap<>();
        for (int c = 0; c < n; c++) {
            for (int d = 0; d < n; d++) {
                long result = Math.round(Math.pow(c, 3) + Math.pow(d, 3));
                List<Integer> valuesList = valuesMap.get(result);
                if (valuesList == null) {
                    valuesList = new ArrayList<>();
                }
                valuesList.add(c, d);
                valuesMap.put(result, valuesList);
            }
        }

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                long result = Math.round(Math.pow(a, 3) + Math.pow(b, 3));
                List<Integer> valuesList = valuesMap.get(result);
                System.out.println(a + "," + b + " ," + valuesList.get(0) + " ," + valuesList.get(1));
            }
        }
    }
}
