/*
Time complexity: O(n) where n is the total length of all the characters in the array
Space complexty: O(1)
*/ 

class prefixVersionTwo {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs == null) 
            return "";
        
        for(int x=0; x<strs[0].length(); x++) {
            char c = strs[0].charAt(x);
            for(int y=1; y<strs.length; y++) {
                if(x == strs[y].length() || strs[y].charAt(x) != c) {
                    strs[0] = strs[0].substring(0, x);
                }
            }
        }

        return strs[0];

    }
}