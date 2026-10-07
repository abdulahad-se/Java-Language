package A1_LeetCode.B_BinarySearch;

public class F_LC852 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,3,2};
        System.out.println(peakIndexMountain(arr));
    }
    static int peakIndexMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else
                start = mid + 1;
        }
        return start;
    }
}
