package org.example;

public class Solution {
    /**
     * Calculates the amount of water that can be trapped between the bars.
     *
     * @param height an array representing the heights of the bars
     * @return the total amount of water trapped between the bars
     */
    public static int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        }

        // Array to store the maximum height of bars to the left of each index
        int[] leftMax = new int[n];
        // Array to store the maximum height of bars to the right of each index
        int[] rightMax = new int[n];
        // Variable to store the total amount of trapped water
        int maxWater = 0;

        // Calculate the maximum height of bars to the left of each index
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Calculate the maximum height of bars to the right of each index
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate the trapped water for each bar
        for (int i = 1; i < n - 1; i++) {
            // Find the minimum height of the tallest bar on the left and right of the current bar
            int minBarHeight = Math.min(leftMax[i], rightMax[i]);
            // If the minimum bar height is greater than the current bar's height,
            // then water can be trapped above the current bar
            if (minBarHeight > height[i]) {
                // Calculate the trapped water by subtracting the bar's height from the minimum bar height
                maxWater += minBarHeight - height[i];
            }
        }

        // Return the total amount of trapped water
        return maxWater;
    }
}

