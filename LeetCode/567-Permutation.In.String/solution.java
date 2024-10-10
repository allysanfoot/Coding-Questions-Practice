class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean result = false;
        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];

        // Build counts for s1 first
        for (int i = 0; i < s1.length(); i++) {
            char currChar = s1.charAt(i);
            s1Counts[currChar - 'a']++;
        }

        // Now we go through s2
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            // Add character at right index
            s2Counts[s2.charAt(right) - 'a']++;

            // Check if window is the right size
            // Readjust if not
            if ((right - left + 1) > s1.length()) {
                s2Counts[s2.charAt(left) - 'a']--;
                left++;
            }

            // Check if we have equivalent counts
            if (areCountsEqual(s1Counts, s2Counts)) {
                result = true;
                break;
            }
        }

        return result;
    }

    // Helper function to compare two arrays
    private boolean areCountsEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
