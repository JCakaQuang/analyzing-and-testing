import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathExercisesTest {

    @Test
    void testTinhChuViHCN() {
        assertEquals(10.0, MathExercises.tinhChuViHCN(2, 3));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhChuViHCN(-1, 3));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhChuViHCN(2, 0));
    }

    @Test
    void testTinhDienTichHCN() {
        assertEquals(6.0, MathExercises.tinhDienTichHCN(2, 3));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhDienTichHCN(0, 3));
    }

    @Test
    void testGiaiPhuongTrinhBac2() {
        // a = 0, b = 0, c = 0 (Vô số nghiệm)
        assertNull(MathExercises.giaiPhuongTrinhBac2(0, 0, 0));
        // a = 0, b = 0, c != 0 (Vô nghiệm)
        assertArrayEquals(new double[]{}, MathExercises.giaiPhuongTrinhBac2(0, 0, 5));
        // a = 0, b != 0 (Phương trình bậc 1)
        assertArrayEquals(new double[]{-2.0}, MathExercises.giaiPhuongTrinhBac2(0, 2, 4));
        // a != 0, Delta < 0 (Vô nghiệm)
        assertArrayEquals(new double[]{}, MathExercises.giaiPhuongTrinhBac2(1, 1, 1));
        // a != 0, Delta = 0 (Nghiệm kép)
        assertArrayEquals(new double[]{-1.0}, MathExercises.giaiPhuongTrinhBac2(1, 2, 1));
        // a != 0, Delta > 0 (2 nghiệm phân biệt)
        double[] roots = MathExercises.giaiPhuongTrinhBac2(1, -3, 2);
        assertArrayEquals(new double[]{2.0, 1.0}, roots); // Nghiệm x1=2, x2=1
    }

    @Test
    void testTinhSoNgayCuaThang() {
        // Lỗi
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhSoNgayCuaThang(0, 2023));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhSoNgayCuaThang(13, 2023));
        // Tháng 31 ngày
        assertEquals(31, MathExercises.tinhSoNgayCuaThang(1, 2023));
        // Tháng 30 ngày
        assertEquals(30, MathExercises.tinhSoNgayCuaThang(4, 2023));
        // Tháng 2 năm nhuận (chia hết cho 400 hoặc chia hết cho 4 nhưng không chia hết cho 100)
        assertEquals(29, MathExercises.tinhSoNgayCuaThang(2, 2024)); // % 4 == 0
        assertEquals(29, MathExercises.tinhSoNgayCuaThang(2, 2000)); // % 400 == 0
        // Tháng 2 năm không nhuận
        assertEquals(28, MathExercises.tinhSoNgayCuaThang(2, 2023));
        assertEquals(28, MathExercises.tinhSoNgayCuaThang(2, 1900)); // % 100 == 0 nhưng không % 400
    }

    @Test
    void testKiemTraNguyenTo() {
        assertFalse(MathExercises.kiemTraNguyenTo(1)); // <= 1
        assertFalse(MathExercises.kiemTraNguyenTo(-5));
        assertTrue(MathExercises.kiemTraNguyenTo(2));  // = 2
        assertFalse(MathExercises.kiemTraNguyenTo(4)); // chẵn
        assertTrue(MathExercises.kiemTraNguyenTo(7));  // nguyên tố lẻ
        assertFalse(MathExercises.kiemTraNguyenTo(9)); // chia hết cho i trong vòng lặp (3)
    }

    @Test
    void testTinhTongDanDau() {
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhTongDanDau(0));
        assertEquals(1, MathExercises.tinhTongDanDau(1));       // 1
        assertEquals(-1, MathExercises.tinhTongDanDau(2));      // 1 - 2
        assertEquals(2, MathExercises.tinhTongDanDau(3));       // 1 - 2 + 3
    }

    @Test
    void testTimUCLN() {
        assertEquals(5, MathExercises.timUCLN(5, 0));
        assertEquals(5, MathExercises.timUCLN(0, 5));
        assertEquals(0, MathExercises.timUCLN(0, 0));
        assertEquals(6, MathExercises.timUCLN(48, 18));
        assertEquals(6, MathExercises.timUCLN(-48, 18)); // Test số âm
    }

    @Test
    void testTinhTongGiaiThua() {
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhGiaiThua(-1));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhTongGiaiThua(0));
        assertEquals(1, MathExercises.tinhGiaiThua(0)); // 0! = 1
        assertEquals(1, MathExercises.tinhTongGiaiThua(1)); // 1! = 1
        assertEquals(9, MathExercises.tinhTongGiaiThua(3)); // 1! + 2! + 3! = 1 + 2 + 6 = 9
    }
}import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathExercisesTest {

    @Test
    void testTinhChuViHCN() {
        assertEquals(10.0, MathExercises.tinhChuViHCN(2, 3));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhChuViHCN(-1, 3));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhChuViHCN(2, 0));
    }

    @Test
    void testTinhDienTichHCN() {
        assertEquals(6.0, MathExercises.tinhDienTichHCN(2, 3));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhDienTichHCN(0, 3));
    }

    @Test
    void testGiaiPhuongTrinhBac2() {
        // a = 0, b = 0, c = 0 (Vô số nghiệm)
        assertNull(MathExercises.giaiPhuongTrinhBac2(0, 0, 0));
        // a = 0, b = 0, c != 0 (Vô nghiệm)
        assertArrayEquals(new double[]{}, MathExercises.giaiPhuongTrinhBac2(0, 0, 5));
        // a = 0, b != 0 (Phương trình bậc 1)
        assertArrayEquals(new double[]{-2.0}, MathExercises.giaiPhuongTrinhBac2(0, 2, 4));
        // a != 0, Delta < 0 (Vô nghiệm)
        assertArrayEquals(new double[]{}, MathExercises.giaiPhuongTrinhBac2(1, 1, 1));
        // a != 0, Delta = 0 (Nghiệm kép)
        assertArrayEquals(new double[]{-1.0}, MathExercises.giaiPhuongTrinhBac2(1, 2, 1));
        // a != 0, Delta > 0 (2 nghiệm phân biệt)
        double[] roots = MathExercises.giaiPhuongTrinhBac2(1, -3, 2);
        assertArrayEquals(new double[]{2.0, 1.0}, roots); // Nghiệm x1=2, x2=1
    }

    @Test
    void testTinhSoNgayCuaThang() {
        // Lỗi
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhSoNgayCuaThang(0, 2023));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhSoNgayCuaThang(13, 2023));
        // Tháng 31 ngày
        assertEquals(31, MathExercises.tinhSoNgayCuaThang(1, 2023));
        // Tháng 30 ngày
        assertEquals(30, MathExercises.tinhSoNgayCuaThang(4, 2023));
        // Tháng 2 năm nhuận (chia hết cho 400 hoặc chia hết cho 4 nhưng không chia hết cho 100)
        assertEquals(29, MathExercises.tinhSoNgayCuaThang(2, 2024)); // % 4 == 0
        assertEquals(29, MathExercises.tinhSoNgayCuaThang(2, 2000)); // % 400 == 0
        // Tháng 2 năm không nhuận
        assertEquals(28, MathExercises.tinhSoNgayCuaThang(2, 2023));
        assertEquals(28, MathExercises.tinhSoNgayCuaThang(2, 1900)); // % 100 == 0 nhưng không % 400
    }

    @Test
    void testKiemTraNguyenTo() {
        assertFalse(MathExercises.kiemTraNguyenTo(1)); // <= 1
        assertFalse(MathExercises.kiemTraNguyenTo(-5));
        assertTrue(MathExercises.kiemTraNguyenTo(2));  // = 2
        assertFalse(MathExercises.kiemTraNguyenTo(4)); // chẵn
        assertTrue(MathExercises.kiemTraNguyenTo(7));  // nguyên tố lẻ
        assertFalse(MathExercises.kiemTraNguyenTo(9)); // chia hết cho i trong vòng lặp (3)
    }

    @Test
    void testTinhTongDanDau() {
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhTongDanDau(0));
        assertEquals(1, MathExercises.tinhTongDanDau(1));       // 1
        assertEquals(-1, MathExercises.tinhTongDanDau(2));      // 1 - 2
        assertEquals(2, MathExercises.tinhTongDanDau(3));       // 1 - 2 + 3
    }

    @Test
    void testTimUCLN() {
        assertEquals(5, MathExercises.timUCLN(5, 0));
        assertEquals(5, MathExercises.timUCLN(0, 5));
        assertEquals(0, MathExercises.timUCLN(0, 0));
        assertEquals(6, MathExercises.timUCLN(48, 18));
        assertEquals(6, MathExercises.timUCLN(-48, 18)); // Test số âm
    }

    @Test
    void testTinhTongGiaiThua() {
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhGiaiThua(-1));
        assertThrows(IllegalArgumentException.class, () -> MathExercises.tinhTongGiaiThua(0));
        assertEquals(1, MathExercises.tinhGiaiThua(0)); // 0! = 1
        assertEquals(1, MathExercises.tinhTongGiaiThua(1)); // 1! = 1
        assertEquals(9, MathExercises.tinhTongGiaiThua(3)); // 1! + 2! + 3! = 1 + 2 + 6 = 9
    }
}