class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuffer sb=new StringBuffer();
        int interval=(numRows-1)*2;
        int intervalCount=s.length()/interval;
        if(s.length()%interval!=0){
            intervalCount++;
        }
        //왜 저장안됨..ㅠㅠ
        for (int i = 0; i <numRows ; i++) {
            for (int j = 0; j <intervalCount ; j++) {
                if(interval*j+i<s.length()){
                    sb.append(s.charAt(interval*j+i));
                }
                if(i!=0 && i!=numRows-1 &&interval*j+interval-(i)<s.length()){
                    sb.append(s.charAt(interval*j+interval-(i)));
                }
            }
        }
        return sb.toString();
    }
}