function compareTriplets(a, b) {
    var result = [0];
    var c = 0;
    var d = 0;
    for(var i = 0; i < 3; i ++){
        if (a[i] > b[i]) {
            c += 1;
        }
        else if (a[i] < b[i]) {
            d += 1
        }
        else if (a[i]==b[i]) {
            c += 0;
            d += 0;
        }
        result = [c,d];
    }
    return result;
}