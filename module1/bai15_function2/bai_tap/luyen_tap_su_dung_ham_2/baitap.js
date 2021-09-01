function bai1() {
    let a = parseFloat(document.getElementById("number").value);
    let bp = a * a;
    if (isNaN(a)) {
        document.getElementById("result1").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else {
        document.getElementById("result1").innerHTML = "<b>Bình phương của " + a + " là: " + bp +"</b>";
    }
}
const Pi = 3.14;
function dienTich() {
    let r = parseFloat(document.getElementById("bankinh").value);
    let s = r * r * Pi;
    if (isNaN(r)) {
        document.getElementById("result2").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else if (r < 0) {
        document.getElementById("result2").innerHTML = "<b> Vui lòng nhập số nguyên dương!!! </b>";
    }
    else {
        document.getElementById("result2").innerHTML = "<b>Diện tích của hình tròn là: " + s + "</b>";
    }
}

function chuVi() {
    let r = parseFloat(document.getElementById("bankinh").value);
    let c = r * 2 * Pi;
    if (isNaN(r)) {
        document.getElementById("result2").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else if (r < 0) {
        document.getElementById("result2").innerHTML = "<b> Vui lòng nhập số nguyên dương!!! </b>";
    }
    else {
        document.getElementById("result2").innerHTML = "<b>Chu vi của hình tròn là: " + c + "</b>";
    }
}

function bai3() {
    let a = parseFloat(document.getElementById("so").value);
    let gt = 1;
    if (isNaN(a)) {
        document.getElementById("result3").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else if (a < 0) {
        document.getElementById("result3").innerHTML = "<b> Vui lòng nhập số nguyên dương!!! </b>";
    }
    else {
        for (let i = a; i > 0; i--) {
            gt *= i;
        }
        document.getElementById("result3").innerHTML = "<b>Giai thừa của " + a + " bằng: " + gt +"</b>";
    }
}

function bai4() {
    let str = parseFloat(document.getElementById("chuoi").value);
    if (!isNaN(str)) {
        document.getElementById("result4").innerHTML = "<b> True </b>";
    }
    else {
        document.getElementById("result4").innerHTML = "<b> False </b>";
    }
}

function bai5() {
    let a = parseFloat(document.getElementById("num1").value);
    let b = parseFloat(document.getElementById("num2").value);
    let c = parseFloat(document.getElementById("num3").value);
    let min = a;
    if (isNaN(a) === true || isNaN(b) === true || isNaN(c) === true) {
        document.getElementById("result5").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else {
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
    }
    document.getElementById("result5").innerHTML = "<b>Số nguyên có giá trị nhỏ nhất là: " + min +"</b>";
}

function bai6() {
    let a = parseFloat(document.getElementById("num4").value);
    if (isNaN(a)) {
        document.getElementById("result6").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else if (a < 0) {
        document.getElementById("result6").innerHTML = "<b> " + a + " không phải số nguyên dương </b>";
    }
    else {
        document.getElementById("result6").innerHTML = "<b> " + a + " là số nguyên dương </b>";
    }
}

let array = [];
function nhap() {
    let n = prompt("Nhập số lượng mảng");
    for (let i = 0; i < n; i++) {
        let number = parseInt(prompt("Nhập phần tử thứ " + i + ":", "0"));
        array.push(number);
    }
    document.getElementById("hienthi").innerHTML = "<b>Mảng vừa nhập: </b>" + array;
}

function dao_nguoc() {
    array.reverse();
    document.getElementById("result8").innerHTML = "<b>Mảng sau khi đảo ngược: </b>" + array;
}