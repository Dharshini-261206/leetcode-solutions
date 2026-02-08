// Last updated: 08/02/2026, 20:04:33
class Solution {
    public String convertToTitle(int num) {
        StringBuffer sb = new StringBuffer();
            while(num>0){
            num--;
            sb.append((char)((num%26)+'A'));
            num/=26;
        }return sb.reverse().toString();
    }
}