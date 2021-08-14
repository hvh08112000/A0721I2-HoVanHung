function bai1() {
    let doC = parseFloat(document.getElementById("doc").value);
    if (isNaN(doC) == true) {
        document.getElementById("result1").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        let doF = doC * 9 / 5 + 32;
        document.getElementById("result1").innerHTML = "<b>°F</b> = " + doF;
    }
}

function bai2() {
    let m = parseFloat(document.getElementById("m").value);
    if (isNaN(m) == true) {
        document.getElementById("result2").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        let ft = m * 3.2808;
        document.getElementById("result2").innerHTML = "<b>ft</b> = " + ft;
    }
}

function bai3() {
    let canhA = parseFloat(document.getElementById("canh").value);
    if (isNaN(canhA) == true) {
        document.getElementById("result3").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        let s = canhA * canhA;
        document.getElementById("result3").innerHTML = "<b>Diện tích của hình vuông là :</b> " + s;
    }
}

function bai4() {
    let canhA = parseFloat(document.getElementById("canhA").value);
    let canhB = parseFloat(document.getElementById("canhB").value);
    if (isNaN(canhA) == true || isNaN(canhB) == true) {
        document.getElementById("result4").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        let s = canhA * canhB;
        document.getElementById("result4").innerHTML = "<b>Diện tích của hình chữ nhật là :</b> " + s;
    }
}

function bai5() {
    let canhA = parseFloat(document.getElementById("canhKeA").value);
    let canhB = parseFloat(document.getElementById("canhkeB").value);
    if (isNaN(canhA) == true || isNaN(canhB) == true) {
        document.getElementById("result5").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        let s = (canhA * canhB) / 2;
        document.getElementById("result5").innerHTML = "<b>Diện tích của hình tam giác vuông là :</b> " + s;
    }
}

function bai6() {
    let a = parseFloat(document.getElementById("a").value);
    let b = parseFloat(document.getElementById("b").value);
    if (isNaN(a) == true || isNaN(b) == true) {
        document.getElementById("result5").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        if (a == 0) {
            if (b == 0) {
                document.getElementById("result6").innerHTML = "<b>Phương trình vô số nghiệm</b>";
            }
            else {
                document.getElementById("result6").innerHTML = "<b>Phương trình vô nghiệm</b>";
            }
        }
        else {
            document.getElementById("result6").innerHTML = "<b>Phương trình có nghiệm: </b> x = " + -b / a;
        }
    }
}

function bai7() {
    let a = parseFloat(document.getElementById("numa").value);
    let b = parseFloat(document.getElementById("numb").value);
    let c = parseFloat(document.getElementById("numc").value);
    let dt = b * b - 4 * a * c;
    if (isNaN(a) == true || isNaN(b) == true || isNaN(c) == true) {
        document.getElementById("result5").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    document.getElementById("result7").innerHTML = "<b>Phương trình vô số nghiệm</b>";
                } else {
                    document.getElementById("result7").innerHTML = "<b>Phương trình vô nghiệm</b>";
                }
            } else {
                document.getElementById("result7").innerHTML = "<b>Phương trình có nghiệm duy nhất: </b>x = " + -c / b;
            }
        }
        else {
            if (dt > 0) {
                let x1 = (-b + Math.sqrt(dt)) / (2 * a);
                let x2 = (-b - Math.sqrt(dt)) / (2 * a);
                document.getElementById("result7").innerHTML = "<b>Phương trình có 2 nghiệm phân biệt: </b>x1 = " + x1 + " ; x2 = " + x2;
            }
            else if (dt == 0) {
                document.getElementById("result7").innerHTML = "<b>Phương trình có nghiệm kép: </b>x1 = x2 = " + -b / (2 * a);
            }
            else {
                document.getElementById("result7").innerHTML = "<b>Phương trình vô nghiệm</b>";
            }
        }
    }
}

function bai8() {
    let number = parseFloat(document.getElementById("number").value);
    if (isNaN(number) == true) {
        document.getElementById("result8").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        if (number > 0 && number <= 120) {
            document.getElementById("result8").innerHTML = "<b>Đây là tuổi của một người</b>";
        }
        else {
            document.getElementById("result8").innerHTML = "<b>Đây không phải là tuổi của một người</b>";
        }
    }
}

function bai9() {
    let a = parseFloat(document.getElementById("canh1").value);
    let b = parseFloat(document.getElementById("canh2").value);
    let c = parseFloat(document.getElementById("canh3").value);
    if (isNaN(a) == true || isNaN(b) == true || isNaN(c) == true) {
        document.getElementById("result9").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        if ((a>0 && b>0 && c>0) && ((a + b > c) || (b + c > a) || (c + a > b))) {
            document.getElementById("result9").innerHTML = "<b>Dữ liệu trên là các cạnh của một tam giác</b>";
        }
        else {
            document.getElementById("result9").innerHTML = "<b>Dữ liệu trên không phải là các cạnh của một tam giác</b>";
        }
    }
}

function bai10() {
    let dien = parseFloat(document.getElementById("dien").value);
    let tong = 0;
    if (isNaN(dien) == true) {
        document.getElementById("result10").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else {
        if (dien >= 200) {
            tong += 100 * 1000 + 2000 * 50 + 2500 * 50 + 3000 * (dien - 200);
        }
        else if (dien >= 150) {
            tong += 100 * 1000 + 2000 * 50 + 2500 * (dien - 150);
        }
        else if (dien >= 100) {
            tong += 100 * 1000 + 2000 * (dien - 100);
        }
        else {
            tong += dien * 1000;
        }
        document.getElementById("result10").innerHTML = "<b>Số tiền điện phải thanh toán là: </b>" + tong + "<b> VND</b>";
    }
}

function bai11() {
    let luong = parseFloat(document.getElementById("luong").value);
    let thue = 0;
    if (isNaN(luong) == true) {
        document.getElementById("result11").innerHTML = "<b>Nhập lại giá trị số!!!</b>";
    }
    else if (luong > 80000000) {
        thue += luong * 0.35;
    }
    else if (luong > 52000000) {
        thue += luong * 0.3;
    }
    else if (luong > 32000000) {
        thue += luong * 0.25;
    }
    else if (luong > 18000000) {
        thue += luong * 0.2;
    }
    else if (luong > 10000000) {
        thue += luong * 0.15;
    }
    else if (luong > 5000000) {
        thue += luong * 0.1;
    }
    else {
        thue += luong * 0.05;
    }
    document.getElementById("result11").innerHTML = "<b>Số tiền thuế phải nộp là: </b>" + thue + "<b> VND</b>";
}