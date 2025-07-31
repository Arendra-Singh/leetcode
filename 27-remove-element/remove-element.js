function removeElement(nums, val) {
    let k = 0; // Counter for elements not equal to val

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] !== val) {
            nums[k] = nums[i]; // Move the valid element to front
            k++;
        }
    }

    // Output the changed array and count
    console.log("Updated array:", nums.slice(0, k));
    return k;
}
