/*
## 题目
    [4,5,1,3,6,7]
*/
//https://segmentfault.com/a/1190000014175918
const data = [4,5,1,3,6,7]
const sortBubble = (arr) => {
    let max = arr.length - 1
    for (let j = 0; j < max; j++) {
        // 声明一个变量，作为标志位
        var done = true;
        for (let i = 0; i < max - j; i++) {
            if (arr[i] > arr[i + 1]) {
                let temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
                done = false
            }
        }
        if (done) {
            break
        }
    }
    return arr
}

function sortBubble2(arr){
    for(let i = 1;i < arr.length;i++){
        for(let j = i;j > 0;j--){
            if(arr[j] < arr[j-1]){
                [arr[j],arr[j-1]] = [arr[j-1],arr[j]];
            }
        }
    }
    return arr;
}


test('bubbleSort', () => {
    expect( sortBubble(data)).toStrictEqual([1,3,4,5,6,7])
    expect( sortBubble2(data)).toStrictEqual([1,3,4,5,6,7])

})

