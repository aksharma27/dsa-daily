package DSA_SELF.Heaps.LinkedList.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    //all combination which give sum = target (similar elements allowed)
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        combination(arr, 7);
    }
    static void combination (int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        utilCombination(0, arr, ans, target, new ArrayList<>());
        System.out.println(ans);
    }

    static void utilCombination (int idx, int[] arr, List<List<Integer>> ans, int target, ArrayList<Integer> ds) {
        if (idx == arr.length) {
            if (target == 0) {
                ans.add (new ArrayList<>(ds));
            }
            return;
        }

        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            utilCombination(idx, arr, ans, target-arr[idx],ds);
            ds.remove(ds.size()-1);//BACKTRACK
        }
        utilCombination(idx+1, arr, ans, target, ds);
    }
}
