public boolean containsDuplicate(int[] nums) {
    // for tracking the unique elements
    Set<Integer> set = new HashSet<>(nums.length);

    // iterate through each element
    for (int x: nums) {
        // if the element is already in the set, return true
        if (set.contains(x)) return true;
        // otherwise, add the element to the set
        set.add(x);
    }
    // womp womp
    return false;
}