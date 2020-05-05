
class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        //sanity check for ransomNote, if null or empty then return true since null or empty can then be constructed from magz
        if (ransomNote == null || ransomNote.trim().isEmpty()) 
            return true;
        
        //if magaz is null or empty then return false since then ransomNote can not be constructed from null or empty
        if (magazine == null || magazine.trim().isEmpty()) 
            return false;
        
        //compute the freq of each letter in the magazine in an array of size = 26 for all alpha
        int[] freq = new int[26];
        
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }
        //since each letter in magazine can only be used only once, so if it exists in ransomNote but not in magazine as would be the case if the decremented freq value goes below 0, then return false; else return true at the end of the for loop.
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--freq[ransomNote.charAt(i) - 'a']  < 0) {
                return false;
            }
        }
        //if the prog has not returned false then ransomNote can be generated using the letters in the magazine, used without repetition
        
        return true;
        
        //T O(m + n) m for mag and n for ransomNote... S O(1) since fixed array size of 26
    }
}
