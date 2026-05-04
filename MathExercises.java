import java.util.ArrayList;
import java.util.List;

public class MathExercises {

    // 1. Tính chu vi hình chữ nhật
    public static double tinhChuViHCN(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new IllegalArgumentException("Kích thước phải lớn hơn 0");
        }
        return 2 * (chieuDai + chieuRong);
    }

    // 2. Tính diện tích hình chữ nhật
    public static double tinhDienTichHCN(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new IllegalArgumentException("Kích thước phải lớn hơn 0");
        }
        return chieuDai * chieuRong;
    }

    // 3. Giải phương trình bậc 2: ax^2 + bx + c = 0
    // Trả về mảng chứa các nghiệm. Trả về null nếu vô số nghiệm.
    public static double[] giaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) return null; // Vô số nghiệm
                return new double[]{};   // Vô nghiệm
            }
            return new double[]{-c / b}; // Phương trình bậc 1 có 1 nghiệm
        }

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return new double[]{}; // Vô nghiệm
        } else if (delta == 0) {
            return new double[]{-b / (2 * a)}; // Nghiệm kép
        } else {
            // 2 nghiệm phân biệt
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2};
        }
    }

    // 4. Tính số ngày của một tháng (cần biết năm để tính năm nhuận cho tháng 2)
    public static int tinhSoNgayCuaThang(int thang, int nam) {
        if (thang < 1 || thang > 12 || nam < 1) {
            throw new IllegalArgumentException("Tháng hoặc năm không hợp lệ");
        }
        switch (thang) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                boolean isLeapYear = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
                return isLeapYear ? 29 : 28;
            default:
                return 31;
        }
    }

    // 5. Kiểm tra số nguyên tố
    public static boolean kiemTraNguyenTo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n (hoặc - n)
    public static int tinhTongDanDau(int n) {
        if (n < 1) throw new IllegalArgumentException("n phải >= 1");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    // 7. Tìm UCLN của a và b
    public static int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 8. Hàm phụ: Tính giai thừa của n
    public static long tinhGiaiThua(int n) {
        if (n < 0) throw new IllegalArgumentException("n không được âm");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 8. Tính tổng S = 1! + 2! + 3! + ... + n!
    public static long tinhTongGiaiThua(int n) {
        if (n < 1) throw new IllegalArgumentException("n phải >= 1");
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += tinhGiaiThua(i);
        }
        return sum;
    }
}import java.util.ArrayList;
import java.util.List;

public class MathExercises {

    // 1. Tính chu vi hình chữ nhật
    public static double tinhChuViHCN(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new IllegalArgumentException("Kích thước phải lớn hơn 0");
        }
        return 2 * (chieuDai + chieuRong);
    }

    // 2. Tính diện tích hình chữ nhật
    public static double tinhDienTichHCN(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new IllegalArgumentException("Kích thước phải lớn hơn 0");
        }
        return chieuDai * chieuRong;
    }

    // 3. Giải phương trình bậc 2: ax^2 + bx + c = 0
    // Trả về mảng chứa các nghiệm. Trả về null nếu vô số nghiệm.
    public static double[] giaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) return null; // Vô số nghiệm
                return new double[]{};   // Vô nghiệm
            }
            return new double[]{-c / b}; // Phương trình bậc 1 có 1 nghiệm
        }

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return new double[]{}; // Vô nghiệm
        } else if (delta == 0) {
            return new double[]{-b / (2 * a)}; // Nghiệm kép
        } else {
            // 2 nghiệm phân biệt
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2};
        }
    }

    // 4. Tính số ngày của một tháng (cần biết năm để tính năm nhuận cho tháng 2)
    public static int tinhSoNgayCuaThang(int thang, int nam) {
        if (thang < 1 || thang > 12 || nam < 1) {
            throw new IllegalArgumentException("Tháng hoặc năm không hợp lệ");
        }
        switch (thang) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                boolean isLeapYear = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
                return isLeapYear ? 29 : 28;
            default:
                return 31;
        }
    }

    // 5. Kiểm tra số nguyên tố
    public static boolean kiemTraNguyenTo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n (hoặc - n)
    public static int tinhTongDanDau(int n) {
        if (n < 1) throw new IllegalArgumentException("n phải >= 1");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    // 7. Tìm UCLN của a và b
    public static int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 8. Hàm phụ: Tính giai thừa của n
    public static long tinhGiaiThua(int n) {
        if (n < 0) throw new IllegalArgumentException("n không được âm");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 8. Tính tổng S = 1! + 2! + 3! + ... + n!
    public static long tinhTongGiaiThua(int n) {
        if (n < 1) throw new IllegalArgumentException("n phải >= 1");
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += tinhGiaiThua(i);
        }
        return sum;
    }
}