function bai1() {
    let a = parseInt(document.getElementById("soa").value);
    let b = parseInt(document.getElementById("sob").value);
    if (isNaN(a) == true || isNaN(b) == true) {
        document.getElementById("result").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>"    ;
    }
    else if (a % b == 0) {
            document.getElementById("result").innerHTML = "Kết quả: a chia hết cho b";
    }
    else {
        document.getElementById("result").innerHTML = "Kết quả: a không chia hết cho b";
    }
}

function bai2() {
    let tuoi = parseInt(document.getElementById("age").value);
    if (!isNaN(tuoi)) {
        if (tuoi >= 15) {
            document.getElementById("result2").innerHTML = "Kết quả: Học sinh đủ điều kiện để vào lớp 10";
        }
        else {
            document.getElementById("result2").innerHTML = "Kết quả: Học sinh không đủ điều kiện để vào lớp 10";
        }
    }
    else {
        document.getElementById("result2").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
}

function bai3() {
    let number = parseInt(document.getElementById("num").value);
    if (!isNaN(number)) {
        if (number > 0) {
            document.getElementById("result3").innerHTML = "Kết quả: " + number + " > 0";
        }
        else {
            document.getElementById("result3").innerHTML = "Kết quả: " + number + " < 0";
        }
    }
    else {
        document.getElementById("result3").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
}

function bai4() {
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    let num3 = parseFloat(document.getElementById("num3").value);
    let max = num1;
    if (isNaN(num1) == true || isNaN(num2) == true || isNaN(num3) == true) {
        document.getElementById("result4").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else {
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
    }
    document.getElementById("result4").innerHTML = "Kết quả: Số lớn nhất là: " + max;
}

function bai5() {
    let dkt = parseFloat(document.getElementById("dkt").value);
    let dgk = parseFloat(document.getElementById("dgk").value);
    let dck = parseFloat(document.getElementById("dck").value);
    let dtb = (dkt + dgk + dck) / 3;
    if (isNaN(dkt) == true || isNaN(dgk) == true || isNaN(dck) == true) {
        document.getElementById("result5").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else {
        if (dtb >= 8) {
            document.getElementById("result5").innerHTML = "Xếp loại học lực: Giỏi";
        }
        else if (dtb >= 6.5) {
            document.getElementById("result5").innerHTML = "Xếp loại học lực: Khá";
        }
        else if (dtb >= 5) {
            document.getElementById("result5").innerHTML = "Xếp loại học lực: Trung bình";
        }
        else {
            document.getElementById("result5").innerHTML = "Xếp loại học lực: Yếu";
        }
    }
}

function bai6() {
    let sales = parseFloat(document.getElementById("sales").value);
    let amount = parseFloat(document.getElementById("amount").value);
    if (isNaN(sales) == true || isNaN(amount) == true) {
        document.getElementById("result6").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else {
        if (sales > amount) {
            document.getElementById("result6").innerHTML = "Hoa hồng bằng 30% doanh số bán hàng: " + sales * 0.3 + " <b>VND</b>";
        }
        else {
            document.getElementById("result6").innerHTML = "Hoa hồng bằng 10% doanh số bán hàng: " + sales * 0.1 + " <b>VND</b>";
        }
    }
}

function bai7() {
    let sophut = parseInt(document.getElementById("phut").value);
    const phicodinh = 25000;
    let phi = 0;
    if (isNaN(sophut) == true) {
        document.getElementById("result7").innerHTML = "<b> Bạn hãy nhập lại kiểu số!!! </b>";
    }
    else {
        if (sophut > 200) {
            phi = (sophut - 200) * 200 + 150 * 400 + 50 * 600;
        }
        else if (sophut > 50) {
            phi = (sophut - 50) * 400 + 50 * 600;
        }
        else {
            phi = sophut * 600;
        }
    }
    let tong = 0.01 * phi + phicodinh;
    document.getElementById("result7").innerHTML = "Số tiền phải thanh toán là: " + tong + " <b>VND</b>";
}