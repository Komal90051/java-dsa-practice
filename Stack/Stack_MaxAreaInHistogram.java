import java.util.*;

public class Stack_MaxAreaInHistogram {   //O(n)   - optimized
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length]; // Next smaller to right
        int nsl[] = new int[arr.length]; // Next smaller to left
  
        // NSR - Next Smaller to Right   O(n)
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsr[i] = s.isEmpty() ? arr.length : s.peek();
            s.push(i);
        }

        // NSL - Next Smaller to Left  O(n)
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        // Calculate area  //O(n)
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

        System.out.println("Max area in histogram = " + maxArea);
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
    }
}

