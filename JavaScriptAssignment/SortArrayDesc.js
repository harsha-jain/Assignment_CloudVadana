let a = [0,10,100,0,1,1,1,0,0,1,0,1]
let temp;
for (let i = 0; i < a.length; i++) {
    if (a[i] < a[i + 1]) {
        temp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = temp;
        i = -1;
    }
}
console.log(a);