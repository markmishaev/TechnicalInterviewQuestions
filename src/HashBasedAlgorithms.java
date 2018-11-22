import java.util.HashSet;
import java.util.Set;

public class HashBasedAlgorithms {

    public static boolean twoSumMembersExist(int[] members, int sum)
    {
        if(members == null || members.length == 0)
        {
            throw new IllegalArgumentException("Members array is null.");
        }

        Set<Integer> membersAfterSubtructing = new HashSet<>();

        for (int i = 0; i < members.length - 1; i++) {
            if(sum >= members[i]) {
                membersAfterSubtructing.add(members[i]);
            }
        }

        for (int i = 0; i < members.length - 1; i++) {

            if(membersAfterSubtructing.contains(sum - members[i]))
            {
                return true;
            }
        }

        return false;
    }
}
