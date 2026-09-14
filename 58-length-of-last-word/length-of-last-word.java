class Solution {
    public int lengthOfLastWord(String s) {
            int length = 0;
    boolean foundWord = false;

    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) != ' ') {
            length++;
            foundWord = true;
        } else if (foundWord) {
            break;
        }
    }

    return length;
    }
}