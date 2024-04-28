package arrays_and_arrayList;

import java.util.*;

class assignments_arrays_arrayList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Build Array from Permutation
        // System.out.print("Enter n: ");
        // int n = in.nextInt();
        // System.out.print("Enter r: ");
        // int r = in.nextInt();

        // int ans = Permutation(n, r);
        // System.out.println(ans);

        // Concatenation of Array
        // int[] array1 = {1, 2, 3};
        // int[] array2 = {4, 5, 6};

        // int[] concatenatedArray = concatenateArrays(array1, array2);
        // System.out.println(Arrays.toString(concatenatedArray));
        // int[] Aarry = {1,2,3,4,5};
        // int[] RunningArray = Running(Aarry);
        // System.out.println(Arrays.toString(RunningArray));

        // Shuffle the Array
        // int[] arr = {2,5,1,3,4,7};
        // int n =3;
        // System.out.println(Arrays.toString(shuffle(arr, n)));

        // kids with the greast number of candies
        // int[] candies = {2, 3, 5, 1, 3};
        // int extraCandies = 3;
        // List<Boolean> result = kidsWithCandies(candies, extraCandies);
        // System.out.println("Boolean array indicating whether each kid can have the
        // greatest number of candies:");
        // System.out.println(result);

        // Number of Good Pairs
        // int[] nums = {1,2,3,1,1,3};
        // System.out.println(numIdenticalPairs(nums));

        // How many numbers are smaller than the current number
        // int[] nums = {8,1,2,2,3};
        // System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

        // Count Items matching a Rule
        // List<List<String>> items = new ArrayList<>();
        // items.add(List.of("phone", "blue", "pixel"));
        // items.add(List.of("computer", "silver", "lenovo"));
        // items.add(List.of("phone", "gold", "iphone"));

        // String ruleKey1 = "color";
        // String ruleValue1 = "silver";
        // System.out.println("Count of items matching rule 1: " + countMatches(items,
        // ruleKey1, ruleValue1));

        // Find the Higest Altiude
        // int[] arr = {-5,1,5,0,-7};
        // System.out.println(largestAltitude(arr));

        // Flipping an Image
        int[][] img = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] ans = flipAndInvertImage(img);
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }

    }

    // Build Array from Permutation
    static int Permutation(int n, int r) {
        int Permutation = Factorial(n) / Factorial(n - r);
        return Permutation;
    }

    // Factorial
    static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Concatenation of Array
    static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] result = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    // Running Sum of 1d Array
    static int[] Running(int[] arr) {
        int length = arr.length;
        int[] newArr = new int[length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            newArr[i] = sum;
        }
        return newArr;
    }

    // Shuffle the Array
    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            result[count] = nums[i];
            result[count + 1] = nums[n + i]; // y1, y2, ..., yn
            count += 2;
        }
        return result;
    }

    // kids with the greast number of candies
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= max) {
                max = candies[i];
            }
        }

        for (int val : candies) {
            ans.add(val + extraCandies >= max);
        }
        return ans;
    }

    // Number of Good Pairs
    static int numIdenticalPairs(int[] nums) {
        int[] temp = new int[101];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += temp[nums[i]];
            temp[nums[i]]++;
        }
        return result;
    }

    // How many numbers are smaller than the current number
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[101];
        int[] res = new int[nums.length];
        // Frequency store
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }
        // Running Sum
        for (int i = 1; i < 101; i++) {
            temp[i] = temp[i] + temp[i - 1];
        }
        // Store result
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = temp[nums[i] - 1];
            }
        }
        return res;
    }

    // Create Target Array in the Given Order
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            for (int j = target.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }

    // Count Items matching a Rule
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    ans++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    ans++;
                }
            }
        } else {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    // Find the Higest Altiude
    static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            max = Math.max(current, max);
        }
        return max;
    }

    // Flipping an Image
    static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n - j - 1] ^ 1;
                image[i][n - j - 1] = temp;
            }
        }
        return image;
    }

    // cells with odd values in a matrix
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]] ^= true;
            col[indices[i][1]] ^= true;
        }

        int r = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                r++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (col[i]) {
                c++;
            }
        }

        return r * n + c * m - 2 * r * c;
    }

    // Matrix Diagonal Sum
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum = sum + mat[i][i];
            sum = sum + mat[i][n - i - 1];
        }
        if (n % 2 != 0) {
            sum = sum - mat[n / 2][n / 2];
        }
        return sum;
    }

    // Find Numbers with Even Number of Digits
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            while (nums[i] > 0) {
                digit++;
                nums[i] /= 10;
            }
            if (digit % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    // Transpose Matrix
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    // Add to Array-Form of Integer
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> sol = new ArrayList<>();
        int n = num.length;
        int i = n - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                sol.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            } else {
                sol.add(k % 10);
                k = k / 10;
            }
            i--;
        }
        Collections.reverse(sol);
        return sol;
    }

    // Maximum Population Year
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - 1950]++;
            }
        }
        int maxVal = 0;
        int maxYear = 1950;
        for (int i = 0; i < 101; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }

    // Determine Wheter Matrix Can Be Obtained By Rotation
    // Rotate the matrix by 90 degrees
    static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int start = 0;
        int end = n - 1;
        while (start < end) {
            for (int row = 0; row < n; row++) {
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
            }
            start++;
            end--;
        }
    }

    // Check if two matrices are equal
    static boolean check(int[][] matrix, int[][] target) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Find rotation
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (check(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    // Two Sum
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2]; // Create an array to store the indices of the two numbers

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) { // Check if the sum of current pair equals the target
                    ans[0] = i; // Store the index of the first number
                    ans[1] = j; // Store the index of the second number
                    return ans; // Return the indices
                }
            }
        }

        // If no such pair is found, return an array with -1
        return new int[] { -1, -1 };
    }

    // Find N Unique Integers Sum up to Zero
    public int[] sumZero(int n) {
        int[] arr = new int[n];

        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i = i + 2) {
                arr[i + 1] = i + 1;
                arr[i] = -(i + 1);
            }
        } else {
            for (int i = 0; i < n - 1; i = i + 2) {
                arr[i] = i + 1;
                arr[i + 1] = -(i + 1);
            }
            arr[n - 1] = 0;
        }
        return arr;
    }

    // Lucky Nimbers in Matrix
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }

            boolean isTrue = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > matrix[i][minIndex]) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                list.add(matrix[i][minIndex]);
            }
        }
        return list;
    }

    // Maximum Subarray
    // its based on kadan's Alogritm
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum >= 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    // Reshape the Matrix
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int originalRows = mat.length;
        int originalCols = mat[0].length;

        // Check if reshape is possible
        if (originalRows * originalCols != r * c) {
            return mat;
        }

        int[][] reshapedMatrix = new int[r][c];
        int newRow = 0, newCol = 0;

        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalCols; j++) {
                reshapedMatrix[newRow][newCol] = mat[i][j];
                newCol++;
                if (newCol == c) {
                    newCol = 0;
                    newRow++;
                }
            }
        }

        return reshapedMatrix;
    }

    // Plus One
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    // Remoove Duplicates from Sored Array
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }

            int rd = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[rd] != nums[i]) {
                    rd++;
                    nums[rd] = nums[i];
                }
            }
            return rd + 1;
        }
    }

    // Minimum Cost to Move Chips to The Same position
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(evenCount, oddCount);
    }

    // Spiral Matrix
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (!(top <= bottom && left <= right)) {
                break;
            }

            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }

    // Spiral Matrix ||
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        
        int num = 1;
        
        while (left <= right && top <= bottom) {
           
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num;
                num++;
            }
            top++; 
            
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num;
                num++;
            }
            right--; 
            
            
            for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num;
                    num++;
            }
            bottom--; 
            
            
            
            for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num;
                    num++;
            }
            left++; 
            
        }
        
        return matrix; 

        //Sprial Matrix |||



    //Set Matrix Zeroes
    //brute borach approch
    // public void setZeroes(int[][] matrix) {
    //     List<Integer> row = new ArrayList<>();
    //     List<Integer> col = new ArrayList<>();
    //     int m = matrix.length;
    //     int n = matrix[0].length;
  
    //     for(int i=0; i < m; i++){
    //       for(int j = 0; j < n; j++){
    //           if(matrix[i][j] == 0){
    //              row.add(i);
    //              col.add(j);
    //           }
    //       }
    //     }
  
    //     for(int i = 0; i < row.size(); i++){
    //       for(int j = 0; j < n; j++){
    //           matrix[row.get(i)][j] = 0;
    //       }
    //     }
  
    //     for(int i = 0; i < col.size(); i++){
    //       for(int j = 0; j < m; j++){
    //           matrix[j][col.get(i)] = 0;
    //       }
    //     }
    //   }

    public void setZeroes(int[][] matrix) {
        boolean isCol = false;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {

            if (matrix[i][0] == 0) {
                isCol = true;
            }
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (isCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // Product of Arrray Except Self
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }

    // Find First and Last Position of Element in Sorted Array
    public int[] SearchRange(int[] nums, int target) {
        int[] res = { -1, -1 };
        int l = 0, h = nums.length - 1, mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (target == nums[mid]) {
                res[0] = mid;
                h = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        l = 0;
        h = nums.length - 1;
        mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            if (target == nums[mid]) {
                res[1] = mid;
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return res;
    }

    // Jump Game
    boolean canJump(int[] nums) {
        int finalPosition = nums.length - 1;
        for (int idx = nums.length - 2; idx >= 0; idx--) {
            if (idx + nums[idx] >= finalPosition) {

                finalPosition = idx;
            }
        }
        return findRotation == 0;

    }

    // Rotate Array
    // function for rotation one time
    // public static void rotateOne(int[] a){
    // int temp = a[0];
    // for(int i= 1; i<a.lenght; i++){
    // a[i-1] = a[i]
    // }
    // a[a.length-1] = temp;
    // }

    // rotation more
    static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
        reverse(a, 0, a.length - 1);

    }

    // Sort Colors
    static void sortColor(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, start, mid);
                    mid++;
                    start++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
    }

    static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    // House Robber
static int rob(int[] nums){
    if(nums.length < 2){
        return nums[0];
    }
 int[] dp = new int[nums.length];
 
 dp[0] = nums[0];
 dp[1] = Math.max(nums[0], nums[1]);

 for(int i = 2; i < nums.length; i++){
    dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
 }
 return dp[nums.length - 1  ]
}

 //First Mising Positive
 public int firstMissingPositive(int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n; i++) {
        while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
            int temp = nums[nums[i] - 1];
            nums[nums[i] - 1] = nums[i];
            nums[i] = temp;
        }
    }
    for (int i = 0; i < n; i++) {
        if (nums[i] != i + 1) {
            return i + 1;
        }
    }
    return n + 1;
}
}

//Good Array
public boolean isGoodArray(int[] nums) {
    int gcd = nums[0];
     for (int num : nums) {
         gcd = gcd(gcd, num);
     }
     return gcd == 1;
 }


 private static int gcd(int a, int b) {
     while (b != 0) {
         int temp = b;
         b = a % b;
         a = temp;
     }
     return a;
 }

 //Max Value of Equation