/* 
Time complxity: O(n), n being the total of all the characters in all the strings in 
all the words in the array
Space complexity: O(1)  no extra space 
*/


class prefix {
    public String longestCommonPrefix(String[] strs) {

        //char[] word = new char[strs.length-1];
        if(strs.length == 0)
            return "";
        
        String prefix = strs[0];
        for(int a=0; a<strs.length-1; a++) {
            while(strs[a].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;  

    }
}