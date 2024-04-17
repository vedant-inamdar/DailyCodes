import java.util.*;
public class relativesort {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int index = 0;
        for (int num : arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == num) {
                    int temp = arr1[i];
                    arr1[i] = arr1[index];
                    arr1[index] = temp;
                    index++;
                }
            }
        }
        Arrays.sort(arr1, index, arr1.length);
        return arr1;
    }
}