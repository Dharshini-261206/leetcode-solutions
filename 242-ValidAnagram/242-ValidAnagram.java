// Last updated: 08/02/2026, 20:04:25
class Solution {
    public boolean isAnagram(String s, String t) {
      char [] ch = new char[s.length()];
      char [] b = new char[t.length()];
      ch = s.toCharArray();
      b = t.toCharArray();
      Arrays.sort(ch);
      Arrays.sort(b);
      return Arrays.equals(ch,b);

    }
}