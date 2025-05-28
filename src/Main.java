import java.util.*;
public class Main {
    public static int maxProduct(int n) {
        int product = 1;
        int[] arr = new int[(int)Math.log(n)+1];
        int i =0;
        while(n>0){
            int digit = n%10;
            arr[i] = digit;
            i++;
            n = n/10;
        }
        System.out.println(Math.pow(2,5));
        Arrays.sort(arr);
        System.out.println(arr);
        return product*arr[arr.length-1]*arr[arr.length-2];
    }
    public static int[][] fillArray(int[][] arr, int row, int col, int maxVal){
        arr[row][col] = maxVal--;
        arr[row+1][col] = maxVal--;
        arr[row+1][col+1] = maxVal--;
        arr[row][col+1] = maxVal;
        return arr;
    }
    public static int[][] specialGrid(int n) {
        int max = (int) (Math.pow(2,2*n)-1);
        int[][] arr = new int[(int)Math.pow(2,n)][(int)Math.pow(2,n)];
        int row = 0;
        int col = 0;
        if(n==0){
            arr[0][0] = 0;
            return arr;
        } else if (n == 1) {
            return fillArray(arr, row, col, max);
        }
        else {

        }
        return arr;
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(sumOfDigits(nums[i])==i) return i;
        }
        return -1;
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public int minSwaps(int[] nums) {
        int swaps = 0;
        int[] sumOfDigits = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sumOfDigits[i] = sumOfDigits(nums[i]);
        }

        for (int i = 0; i < sumOfDigits.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (sumOfDigits[j] < sumOfDigits[j - 1]) {
                    swap(sumOfDigits, j, j - 1);
                    swap(nums, j, j - 1);
                    swaps++;
                } else if (sumOfDigits[j] == sumOfDigits[j - 1]) {
                    if (nums[j] < nums[j - 1]) {
                        swap(sumOfDigits, j, j - 1);
                        swap(nums, j, j - 1);
                        swaps++;
                    }
                } else {
                    break;
                }
            }
        }

        return swaps;
    }
    static class Point {
        int x, y, dist;
        Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static int minMoves(String[] matrix) {
        int m = matrix.length;
        int n = matrix[0].length();
        char[][] grid = new char[m][n];
        Map<Character, List<int[]>> voracelium = new HashMap<>();

        for (int i = 0; i < m; i++) {
            grid[i] = matrix[i].toCharArray();
            for (int j = 0; j < n; j++) {
                char c = grid[i][j];
                if (Character.isUpperCase(c)) {
                    voracelium.computeIfAbsent(c, k -> new ArrayList<>()).add(new int[]{i, j});
                }
            }
        }

        boolean[][] visited = new boolean[m][n];
        Set<Character> usedPortals = new HashSet<>();
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0, 0));
        visited[0][0] = true;

        int[][] directions = {{0, 1}, {-1, 0}, {1, 0}, {0, -1}};

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int x = p.x, y = p.y, d = p.dist;

            if (x == m - 1 && y == n - 1) return d;

            char c = grid[x][y];
            if (Character.isUpperCase(c) && !usedPortals.contains(c)) {
                usedPortals.add(c);
                for (int[] pos : voracelium.get(c)) {
                    int tx = pos[0], ty = pos[1];
                    if (!visited[tx][ty] && (tx != x || ty != y)) {
                        visited[tx][ty] = true;
                        queue.add(new Point(tx, ty, d)); // teleport doesn't cost a move
                    }
                }
            }

            for (int[] dir : directions) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && grid[nx][ny] != '#' && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new Point(nx, ny, d + 1));
                }
            }
        }

        return -1;
    }
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) num2 += i;
            else num1 += i;
        }
        return num1 - num2;
    }
    public static String deleteMultipleIndexes(String str, Integer[] indexes) {
        StringBuilder sb = new StringBuilder(str);
        List<Integer> indexList = Arrays.asList(indexes);
        Collections.sort(indexList, Collections.reverseOrder());
        for (int index : indexList) {
            if (index >= 0 && index < sb.length()) {
                sb.deleteCharAt(index);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
//        System.out.println(maxProduct(124));
//        int[][] arr = specialGrid(3);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//        String[] arr1 = {".A","CA"};
//        System.out.println(minMoves(arr1));
//        System.out.println("Hello world!");
        String originalString = "abcdefgh";
        Integer[] indicesToRemove = {1, 3, 5};
        String resultString = deleteMultipleIndexes(originalString, indicesToRemove);
        System.out.println("Original String: " + originalString);
        System.out.println("Result String: " + resultString);
    }
}