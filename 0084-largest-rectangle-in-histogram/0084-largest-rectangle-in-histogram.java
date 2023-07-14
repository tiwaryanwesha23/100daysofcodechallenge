class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0) return 0;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <= heights.length; i++){
            int h = i == heights.length ? 0: heights[i];    // add a 0 to the last so we have a chance to deal with the last mono inscrease part.
            while(!stack.isEmpty() && h < heights[stack.peek()]){   // pop the value larger than current one to keep the monostack.
                int height = heights[stack.pop()];
                int index = stack.isEmpty() ? -1: stack.peek(); // if empty, means current value is the minimum
                res = Math.max(res, height * (i - index - 1));  // get the local area
            }
            stack.push(i);  // always add current index to the stack.
        }
        return res;
    }
}