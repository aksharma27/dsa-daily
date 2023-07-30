package DSA_SELF.Heaps.LinkedList.Recursion;

import java.util.ArrayList;

public class PickNotPick {
    static void pickNotPick(int[] arr, int i, int len, ArrayList<Integer> path) {
        //base case :
        if (i == len) {
            if (path.size() > 0)
                System.out.println(path);
        }
        else {
            //PICK
            pickNotPick(arr, i+1, len, path);
            path.add(arr[i]);

            //backtrack -> Not pick
            pickNotPick(arr, i+1, len, path);
            path.remove(path.size()-1);
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> ans = new ArrayList<>();
        pickNotPick(arr, 0, 3, ans);
    }
}
