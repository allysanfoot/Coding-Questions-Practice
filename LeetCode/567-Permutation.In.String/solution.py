class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        result = False
        s1Counts, s2Counts = [0] * 26, [0] * 26

        # build counts for s1 first
        for i in range(len(s1)):
            currChar = s1[i]
            s1Counts[ord(currChar) - ord('a')] += 1

        # now we go through s2
        left = 0
        for right in range(len(s2)):
            # add character at right idx
            s2Counts[ord(s2[right]) - ord('a')] += 1

            # check if window is the right size
            # readjust if not
            if (right - left + 1) > len(s1):
                s2Counts[ord(s2[left]) - ord('a')] -= 1
                left += 1
            
            # check if we have equivalent counts
            if s1Counts == s2Counts:
                result = True
                break

        return result