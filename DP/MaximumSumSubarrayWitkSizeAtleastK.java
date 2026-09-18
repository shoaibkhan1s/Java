//Amazon OA question
// Given an array of size “N” , find the subarray whose sum is maximum but at the same time size of that subarray should at-least be “k” (Note - If the answer is negative - print -1)
public class MaximumSumSubarrayWitkSizeAtleastK {
    public static void main(String[] args) {
        int[] a = { -2, 1, 3, -1, 4 };
        int k = 2;
        System.out.println(maxSubarraySum(a, k));
    }

    private static int maxSubarraySum(int[] a, int k) {
        int n = a.length;
        int[] p = new int[n];
        p[0] = a[0];
        for (int i = 1; i < n; i++) {
            p[i] = Math.max(a[i], a[i] + p[i - 1]);
        }
        int answer = 0;
        int sum = 0;
        for (int i = 0; i <= k - 2; i++) {
            sum += a[i];
        }

        for (int i = k - 1; i < n; i++) {
            sum += a[i];

            int current = sum;
            if (i - k >= 0) {
                current = Math.max(current, sum + Math.max(0, p[i - k]));
            }
            answer = Math.max(answer, current);
            sum -= a[i-k+1];
        }
        return answer<0 ? -1 : answer;
    }
}
