public class Main{
    public static void main(String[] args){
        Lop lop1 = new Lop("IT01", "Khoa Công nghệ thông tin");
        Lop lop2 = new Lop("IT02", "Khoa Công nghệ thông tin");

        Ngay ngay1 = new Ngay(15, 10, 2006);
        Ngay ngay2 = new Ngay(20, 10, 2006);

        SinhVien sinhVien1 = new SinhVien("123", "Trương Thành Đạt", ngay1, 8.9, lop1);
        SinhVien sinhVien2 = new SinhVien("456", "Nguyễn Văn A", ngay2, 9.0, lop2);

        System.out.println("Tên khoa của sinhVien1 là: " + sinhVien1.layTenKhoa());
        System.out.println("Tên khoa của sinhVien2 là: " + sinhVien2.layTenKhoa());

        System.out.println("sinhVien1 thi đạt: " + sinhVien1.kiemTraThiDat());
        System.out.println("sinhVien2 thi đạt: " + sinhVien2.kiemTraThiDat());

        System.out.println("sinhVien1 cũng ngày sinh với sinhVien2: " + sinhVien1.kiemTraCungNgaySinh(sinhVien2));

    }
}