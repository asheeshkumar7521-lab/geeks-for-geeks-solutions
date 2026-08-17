class Solution {
    public boolean divisibleBy5(String n) {
        // code here
        char lastDigit = n.charAt(n.length() - 1);
        if (lastDigit == '0' || lastDigit == '5')
            return true;
        else
            return false;
    }
}