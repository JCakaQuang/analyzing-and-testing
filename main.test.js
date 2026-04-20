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