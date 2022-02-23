//Given a square matrix, calculate the absolute difference between sus of ts diagonals
//For a good step by step solution see this link https://www.youtube.com/watch?v=5l8Hrr-h-iQ&t=348s

function diagonalDifference(arr) {
    var first = 0;
    var last = 0;
    var length = arr.length
    for(var i = 0; i < arr.length; i ++) {
        first += arr[i][i];
        last += arr[length-1-i][i];
    }

    return Math.abs(first-last);
}
