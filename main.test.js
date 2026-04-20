// Trích xuất một số test case hợp lệ (Issue 1)
const { tinhChuViHCN, giaiPhuongTrinhBac2, kiemTraNguyenTo } = require('./main');

describe('Issue 1: Test các trường hợp dữ liệu hợp lệ', () => {
    test('Bài 1: Tính chu vi hình chữ nhật với kích thước hợp lệ', () => {
        expect(tinhChuViHCN(5, 3)).toBe(16);
    });

    test('Bài 3: Giải phương trình bậc 2 có 2 nghiệm phân biệt (a=1, b=-3, c=2)', () => {
        expect(giaiPhuongTrinhBac2(1, -3, 2)).toMatch(/2 nghiệm phân biệt/);
    });

    test('Bài 5: Kiểm tra số nguyên tố hợp lệ', () => {
        expect(kiemTraNguyenTo(7)).toBe(true);
        expect(kiemTraNguyenTo(4)).toBe(false);
    });
});

// Bổ sung các test case ngoại lệ và biên (Issue 2)
describe('Issue 2: Test các trường hợp dữ liệu biên, không hợp lệ và ngoại lệ', () => {
    test('Bài 1: Báo lỗi khi kích thước hình chữ nhật <= 0 (Biên & Không hợp lệ)', () => {
        expect(tinhChuViHCN(0, 5)).toBe("Kích thước không hợp lệ");
        expect(tinhChuViHCN(-5, 3)).toBe("Kích thước không hợp lệ");
    });

    test('Bài 3: Phương trình biến thành bậc 1 khi a = 0 (Giá trị biên)', () => {
        expect(giaiPhuongTrinhBac2(0, 2, -4)).toBe("Phương trình có 1 nghiệm: x = 2");
    });

    test('Bài 5: Xử lý đúng với giá trị biên của số nguyên tố (n=1, n=2) và số âm', () => {
        expect(kiemTraNguyenTo(2)).toBe(true);  // Biên nhỏ nhất hợp lệ
        expect(kiemTraNguyenTo(1)).toBe(false); // Biên dưới
        expect(kiemTraNguyenTo(-5)).toBe(false); // Dữ liệu không hợp lệ
    });
});

