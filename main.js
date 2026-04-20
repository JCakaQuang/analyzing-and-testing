function tinhChuViHCN(dai, rong) {
    if (dai <= 0 || rong <= 0) return "Kích thước không hợp lệ";
    return (dai + rong) * 2;
}

function tinhDienTichHCN(dai, rong) {
    if (dai <= 0 || rong <= 0) return "Kích thước không hợp lệ";
    return dai * rong;
}

// Ví dụ: console.log(tinhDienTichHCN(5, 3)); // Kết quả: 15

function giaiPhuongTrinhBac2(a, b, c) {
    if (a === 0) {
        if (b === 0) {
            return c === 0 ? "Phương trình vô số nghiệm" : "Phương trình vô nghiệm";
        }
        return `Phương trình có 1 nghiệm: x = ${-c / b}`;
    }

    let delta = b * b - 4 * a * c;
    
    if (delta < 0) {
        return "Phương trình vô nghiệm";
    } else if (delta === 0) {
        return `Phương trình có nghiệm kép: x1 = x2 = ${-b / (2 * a)}`;
    } else {
        let x1 = (-b + Math.sqrt(delta)) / (2 * a);
        let x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return `Phương trình có 2 nghiệm phân biệt: x1 = ${x1}, x2 = ${x2}`;
    }
}

// Ví dụ: console.log(giaiPhuongTrinhBac2(1, -3, 2)); // Kết quả: x1 = 2, x2 = 1

function kiemTraNamNhuan(nam) {
    return (nam % 4 === 0 && nam % 100 !== 0) || (nam % 400 === 0);
}

function tinhSoNgayCuaThang(thang, nam) {
    switch(thang) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            return 31;
        case 4: case 6: case 9: case 11:
            return 30;
        case 2:
            return kiemTraNamNhuan(nam) ? 29 : 28;
        default:
            return "Tháng không hợp lệ";
    }
}

// Ví dụ: console.log(tinhSoNgayCuaThang(2, 2024)); // Kết quả: 29 (Năm nhuận)

function kiemTraNguyenTo(n) {
    if (n < 2) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}

// Ví dụ: console.log(kiemTraNguyenTo(7)); // Kết quả: true

function tinhTongDanDau(n) {
    let S = 0;
    for (let i = 1; i <= n; i++) {
        if (i % 2 !== 0) {
            S += i;
        } else {
            S -= i;
        }
    }
    return S;
}

// Ví dụ: console.log(tinhTongDanDau(5)); // Kết quả: 3 (1 - 2 + 3 - 4 + 5)

function timUCLN(a, b) {
    a = Math.abs(a);
    b = Math.abs(b);
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Ví dụ: console.log(timUCLN(24, 36)); // Kết quả: 12

// Hàm tính giai thừa của một số k
function tinhGiaiThua(k) {
    let ketQua = 1;
    for (let i = 2; i <= k; i++) {
        ketQua *= i;
    }
    return ketQua;
}

// Hàm tính tổng các giai thừa từ 1 đến n
function tinhTongGiaiThua(n) {
    let S = 0;
    for (let i = 1; i <= n; i++) {
        S += tinhGiaiThua(i);
    }
    return S;
}

// Ví dụ: console.log(tinhTongGiaiThua(4)); // Kết quả: 33 (1! + 2! + 3! + 4! = 1 + 2 + 6 + 24)

