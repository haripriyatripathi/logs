class Solution{
    public int lengthOfLastWord(String s){
        int length = 0;
        int i = s.length() - 1;

        while(i >= 0 && s.charAt(i) == ' '){//skip trailling spaces
        i--;
    }
        while(i>=0 &&s.charAt(i) != ' '){ //count last wod length
            length++;
            i--;
        }
        return length;
    }
}