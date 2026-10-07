package A1_LeetCode.B_BinarySearch;

import java.util.Arrays;

public class M_2DArraysBinarySearches {
    public static void main(String[] args) {
        // Fully sorted matrix: every row is sorted and each row starts after the previous row ends
        int[][] grid = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        // Row-wise AND column-wise sorted only (works with bs2d, NOT with search):
        // {10, 20, 30, 40},
        // {15, 25, 35, 45},
        // {28, 29, 37, 49},
        // {33, 34, 35, 50}

        System.out.println(Arrays.toString(binarySearchIn2d(grid, 16)));    // [3, 3]
        System.out.println(Arrays.toString(bs2d(grid, 55)));                // [-1, -1]
        System.out.println(Arrays.toString(search(grid, 16)));              // [3, 3]
        System.out.println(Arrays.toString(binarySearch(grid, 3, 0, grid[0].length - 1, 15))); // [3, 2]
    }

    // Helper: standard binary search on ONE row between columnStart and columnEnd (inclusive)
    static int[] binarySearch(int[][] nums, int row, int columnStart, int columnEnd, int target) {
        while (columnStart <= columnEnd) {
            int mid = columnStart + (columnEnd - columnStart) / 2;
            if (nums[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (nums[row][mid] < target) {
                columnStart = mid + 1;
            } else {
                columnEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    // ****************** 1: Row by row ******************
    // Works when: every row is sorted.
    // Idea: find the row whose [first, last] range contains target, then binary search that row.
    // Time: O(m log n)
    static int[] binarySearchIn2d(int[][] nums, int target) {
        int cols = nums[0].length;
        for (int row = 0; row < nums.length; row++) {
            if (target >= nums[row][0] && target <= nums[row][cols - 1]) {
                int[] ans = binarySearch(nums, row, 0, cols - 1, target);
                if (ans[0] != -1) {
                    return ans;
                }
            }
        }
        return new int[]{-1, -1};
    }

    // ****************** 2: Binary search on rows, then on columns ******************
    // Works when: matrix is fully sorted (each row sorted, first of a row > last of the previous row).
    // Idea: cut rows using the middle column until 2 rows are left, then pick one of 4 parts.
    // Time: O(log m + log n)
    static int[] search(int[][] nums, int target) {
        int rows = nums.length;
        if (rows == 0 || nums[0].length == 0) {
            return new int[]{-1, -1};
        }
        int cols = nums[0].length;

        // Only one row: plain binary search
        if (rows == 1) {
            return binarySearch(nums, 0, 0, cols - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int columnMid = cols / 2;

        // Reduce the search space until only 2 rows are left
        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (nums[mid][columnMid] == target) {
                return new int[]{mid, columnMid};
            }
            if (nums[mid][columnMid] < target) {
                rowStart = mid;     // ignore upper rows
            } else {
                rowEnd = mid;       // ignore lower rows
            }
        }

        // 2 rows left: rowStart and rowStart + 1. Check the middle column first
        if (nums[rowStart][columnMid] == target) {
            return new int[]{rowStart, columnMid};
        }
        if (nums[rowStart + 1][columnMid] == target) {
            return new int[]{rowStart + 1, columnMid};
        }

        // The guards (columnMid > 0, columnMid + 1 < cols) avoid index errors when cols is 1 or 2
        // Part 1: top-left
        if (columnMid > 0 && target <= nums[rowStart][columnMid - 1]) {
            return binarySearch(nums, rowStart, 0, columnMid - 1, target);
        }
        // Part 2: top-right
        if (columnMid + 1 < cols && target >= nums[rowStart][columnMid + 1] && target <= nums[rowStart][cols - 1]) {
            return binarySearch(nums, rowStart, columnMid + 1, cols - 1, target);
        }
        // Part 3: bottom-left
        if (columnMid > 0 && target <= nums[rowStart + 1][columnMid - 1]) {
            return binarySearch(nums, rowStart + 1, 0, columnMid - 1, target);
        }
        // Part 4: bottom-right
        if (columnMid + 1 < cols) {
            return binarySearch(nums, rowStart + 1, columnMid + 1, cols - 1, target);
        }
        return new int[]{-1, -1};
    }

    // ****************** 3: Staircase search (not a real binary search) ******************
    // Works when: rows are sorted AND columns are sorted (the fully sorted grid also works).
    // Idea: start at top-right. Value too small -> go down, value too big -> go left.
    // Time: O(m + n)
    static int[] bs2d(int[][] nums, int target) {
        int row = 0;
        int col = nums[0].length - 1;       // columns, not nums.length (was a bug for non-square)
        while (row < nums.length && col >= 0) {
            if (nums[row][col] == target) {
                return new int[]{row, col};
            }
            if (nums[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
