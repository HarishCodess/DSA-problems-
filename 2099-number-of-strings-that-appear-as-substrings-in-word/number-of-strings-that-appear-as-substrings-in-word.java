class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        
        // Loop through each pattern in the array
        for (int i = 0; i < patterns.length; i++) {
            // Check if the current pattern is a substring of word
            if (word.contains(patterns[i])) {
                count++;
            }
        }
        
        return count;
    }
}