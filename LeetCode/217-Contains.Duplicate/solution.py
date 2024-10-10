class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        visited = set() # used for keeping track of UNIQUE values

        # go through every number of input array
        for num in nums:
            # return True if we've seen the current element before
            if num in visited:
                return True
            # otherwise add it to elements we've seen before
            visited.add(num)

        # womp womp -- no duplicates!
        return False
