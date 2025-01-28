import java.util.*;

public class factorymachines {
    static int machineCount;
    static long targetProductCount;
    static long[] machineDurations;

    // Function to check if we can produce 'targetProductCount' products within 'duration' time
    static boolean isPossibleInDuration(long duration) {
        long produced = 0;
        for (long time : machineDurations) {
            produced += duration / time; // Calculate number of products that can be made
            if (produced >= targetProductCount) return true; // Early exit if we've met the target
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        machineCount = sc.nextInt();
        targetProductCount = sc.nextLong();
        machineDurations = new long[machineCount];

        for (int i = 0; i < machineCount; i++) {
            machineDurations[i] = sc.nextLong();
        }

        // Binary search for the minimum time
        long left = 1, right = Arrays.stream(machineDurations).min().getAsLong() * targetProductCount;
        long mid, ans = right;

        // Perform binary search
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (isPossibleInDuration(mid)) {
                ans = mid;  // Store the best answer
                right = mid - 1; // Try for a smaller time
            } else {
                left = mid + 1; // We need more time
            }
        }

        System.out.println(ans); // Print the minimum time required
        sc.close(); // Close Scanner to prevent resource leaks
    }
}
