class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var pointerS=0;
        var pointerT=0;
        
        if(s.isEmpty()){
                return true
        }
        
        while (pointerT<t.length){

            if(s[pointerS]==t[pointerT]){
                pointerS++
                pointerT++
            }else{
                pointerT++
            }
            if(pointerS==s.length){
                return true
            }
        }
        return false
    }
}