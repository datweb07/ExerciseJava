public class Main{
    public static void main(String[] args){
        Ngay ngay1 = new Ngay(15, 10, 2006);
        Ngay ngay2 = new Ngay(25, 10, 2006);
        Ngay ngay3 = new Ngay(14, 10, 2006);

        TacGia tacGia1 = new TacGia("Nguyễn Văn A", ngay1);
        TacGia tacGia2 = new TacGia("Trần Thị B", ngay2);
        TacGia tacGia3 = new TacGia("Lý Thị C", ngay3);

        Sach sach1 = new Sach("Lập trình C#", 100000, 2016, tacGia1);
        Sach sach2 = new Sach("Mạng máy tính", 150000, 2025, tacGia2);
        Sach sach3 = new Sach("OOP", 500000, 2025, tacGia3);

        sach1.InTenSach();
        sach2.InTenSach();
        sach3.InTenSach();

        System.out.println(sach1.KiemTraTrungNamXuatBan(sach2));    // false
        System.out.println(sach2.KiemTraTrungNamXuatBan(sach3));    // true

        System.out.println("Giá sau khi giảm 20% của sach1: " + sach1.giaSauKhiGiam(20));
    }
}