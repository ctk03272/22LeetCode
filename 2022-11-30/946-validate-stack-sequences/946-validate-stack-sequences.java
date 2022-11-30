class Solution {
   public boolean validateStackSequences(int[] pushed, int[] popped) {
        int popIndex = 0;
        Stack<Integer> integers = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            int now = pushed[i];
            if (now == popped[popIndex]) {
                popIndex++;
                while (!integers.isEmpty() && integers.peek()==popped[popIndex]){
                    integers.pop();
                    popIndex++;
                }                
            } else {
                integers.push(now);
            }
        }
        boolean ans = true;
        while (popIndex < popped.length) {
            if (integers.pop()!=popped[popIndex]){
                ans=false;
                break;
            }
            popIndex++;
        }
        return ans;
    }
}