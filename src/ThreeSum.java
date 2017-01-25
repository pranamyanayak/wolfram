//Given an array S of n integers, are there elements a, b & c in S such that a + b + c  = target? Find all unique 
//triplets in the array which gives the sum of target.
//For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
//A solution set is:
//[
//  [-1,  0, 1],
//  [-2,  0, 2]
//]

/*
 * Add all the elements of the set into a hashmap.
 * For each i -> [0 .. length of the array]
 *     for each j -> [0 .. length of the array] & i != j
 *         Find in hashmap if the number -(s[i] + s[j]) exists
 *         if exists
 *             then add to the solution array.
 *             
 * Complexity of the above solution is O(n^2)
 */
public class ThreeSum {

}
