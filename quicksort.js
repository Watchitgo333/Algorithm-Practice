const swap = (A, i, j) => {
    let temp = A[i]
    A[i] = A[j]
    A[j] = temp
}

//Hoare's Partition
const partition = (a, low, high) => {
    let pivot = a[low]
    let i = low - 1 
    let j = high + 1
    //(i, j) = (low - 1, high + 1)

    while(true){

        while(true){
            i = i + 1
            if(a[i] >= pivot){
                break
            }
        }
        while(true){
            j = j - 1
            if(a[j] <= pivot){
                break
            }
        }
        if(i >= j){
            return j
        }
        swap(a, i, j)
    }
}

const quicksort = (a, low, high) => {
    if(low >= high){
        return
    }
    let pivot = partition(a, low, high)

    quicksort(a, low, pivot)

    quicksort(a, pivot + 1, high)
}

//put any number in the array
let a = [211,530,60,3,660,390,100,49, 50, 1002, 49, -344]

quicksort(a, 0, a.length - 1)

console.log(a)
