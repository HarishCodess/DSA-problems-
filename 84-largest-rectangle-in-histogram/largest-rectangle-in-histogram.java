import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxarea = 0;
        int n = heights.length;

        int nsl[] = new int[n];
        int nsr[] = new int[n];

        Stack<Integer> s = new Stack<>();

        // Next Smaller Right (NSR)
        for (int i = n - 1; i >= 0; i--) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // Clear stack before NSL
        s.clear();

        // Next Smaller Left (NSL)
        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // Calculate maximum area
        for (int i = 0; i < n; i++) {

            int height = heights[i];

            int width = nsr[i] - nsl[i] - 1;

            int currArea = height * width;

            maxarea = Math.max(maxarea, currArea);
        }

        return maxarea;
    }
}