/*
 * Complete the 'aVeryBigSum' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER_ARRAY ar as parameter.
 * From HackerRank.com
 */

// Prints the sum of the elements in an array using a for loop to iterate through the array.
function aVeryBigSum(ar) {
    var sum = 0;
    for(var i = 0; i < ar.length; i ++) {
        sum = ar[i] + sum;
    }
    return sum; //Returns the sum of the array.
}