let n = 0;
let arrayA = Array();
function add() {
    let ht = document.getElementById("hienthi1");
    let e = "";
    for (let i = 0; i < 10; i++) {
        n = parseInt(prompt("Nhập phần tử thứ " + i + ":", "0"));
        arrayA.push(n);
        e += "Phần tử thứ " + i + ": " + arrayA[i] + "<br>";
    }
    ht.innerHTML = "<h3>Mảng A</h3>" + e + "<hr>";
}
function bai1() {
    let rs = document.getElementById("result1");
    let count = 0;
    for (let i = 0; i < arrayA.length; i++) {
        if (arrayA[i] >= 10) {
            count++;
        }
    }
    rs.innerHTML = "<b>Bài 1: Có " + count + " số nguyên lớn hơn hoặc bằng 10 </b>";
}

function bai2() {
    let rs = document.getElementById("result2");
    let max = arrayA[0];
    let index = 0;
    for (let i = 1; i < arrayA.length; i++) {
        if (arrayA[i] > max) {
            max = arrayA[i];
            index = i;
        }
    }
    rs.innerHTML = "<b>Bài 2: Giá trị lớn nhất trong mảng A là:" + max + ". Phần tử nằm ở vị trí: " + index + "</b>";
}

function bai3() {
    let rs = document.getElementById("result3");
    let avg = 0;
    let sum = 0;
    for (let i = 0; i < arrayA.length; i++) {

        sum += arrayA[i];
    }
    avg = sum / arrayA.length;
    rs.innerHTML = "<b>Bài 3: Giá trị trung bình của các phần tử trong mảng A là: " + avg + "</b>";
}

function bai4() {
    let rs = document.getElementById("result4");
    let daonguoc = arrayA.reverse();
    rs.innerHTML = "<b>Bài 4: Đảo ngược mảng A: " + daonguoc.join(' - ') + "</b>";
}

function bai5() {
    let rs = document.getElementById("result5");
    let count = 0;
    for (let i = 0; i < arrayA.length; i++) {
        if (arrayA[i] < 0) {
            count++;
        }
    }
    rs.innerHTML = "<b>Bài 5: Có " + count + " số nguyên âm trong mảng A </b>";
}

function bai6() {
    let rs = document.getElementById("result6");
    let number = parseInt(prompt("Nhập số nguyên cần kiểm tra: ", "0"));
    for (let i = 0; i < arrayA.length; i++) {
        if (number === arrayA[i]) {
            rs.innerHTML = "<b>Bài 6: " + number + " có nằm trong mảng A</b>";
            break;
        }
        else {
            rs.innerHTML = "<b>Bài 6: " + number + " không nằm trong mảng A</b>";
        }
    }
}

function bai8() {
    let rs = document.getElementById("result8");
    arrayA.sort(function (a,b) {
        return b - a;
    });
    rs.innerHTML = "<b>Bài 8: Mảng A sau khi sắp xếp tăng dần: " + arrayA.join(' - ') + "</b>";
}

function bai9() {
    let ht2 = document.getElementById("hienthi2");
    let rs = document.getElementById("result9");
    let arrayB = Array();
    let number = 0;
    let f = "";
    for (let i = 0; i < 10; i++) {
        number = parseInt(prompt("Nhập phần tử thứ " + i + ":", "0"));
        arrayB.push(number);
        f += "Phần tử thứ " + i + ": " + arrayB[i] + "<br>";
    }
    ht2.innerHTML = "<h3>Mảng B</h3>" + f + "<hr>";
    let arrayC = arrayB.concat(arrayA);
    rs.innerHTML = "<b>Mảng C: " + arrayC.join(' - ') + "</b>";
}