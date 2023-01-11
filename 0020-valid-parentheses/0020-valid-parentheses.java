class Solution {
 public boolean isValid(String s) {
        //boolean
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char now = s.charAt(i);
            if (now == '(' || now == '[' || now == '{') {
                st.push(now);
            } else {
                   if(now==')'){
                    if(st.isEmpty() || st.pop()!='('){
                        answer=false;
                    }
                }else if(now==']'){
                    if(st.isEmpty() || st.pop()!='['){
                        answer=false;
                    }
                }else{
                    if(st.isEmpty() || st.pop()!='{'){
                        answer=false;
                    }
                }
            }
        }
             if(!st.isEmpty()){
            answer=false;
        }
        return answer;
    }
}