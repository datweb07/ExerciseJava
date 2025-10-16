public class Main{
    public static void main(String[] args){
        Ngay ngay1 = new Ngay(15, 10, 2006);
        Ngay ngay2 = new Ngay(20, 10, 2006);
        Ngay ngay3 = new Ngay(16, 10, 2006);

        HangSanXuat hangSanXuat1 = new HangSanXuat("HollyWood", "Mỹ");
        HangSanXuat hangSanXuat2 = new HangSanXuat("BinhPhuoc", "Việt Nam");
        HangSanXuat hangSanXuat3 = new HangSanXuat("ThaiBinh", "Việt Nam");

        BoPhim boPhim1 = new BoPhim("Phim1", 2019, hangSanXuat1, 200000, ngay1);
        BoPhim boPhim2 = new BoPhim("Phim2", 2023, hangSanXuat2, 300000, ngay2);
        BoPhim boPhim3 = new BoPhim("Phim3", 2025, hangSanXuat3, 500000, ngay3);

        System.out.println("Giá vé boPhim1 nhỏ hơn boPhim2: " + boPhim1.KiemTraGiaVeReHon(boPhim2));
        System.out.println("Tên hãng sản xuất của boPhim1: " + boPhim1.LayTenHangSanXuat());
        System.out.println("Giá vé của boPhim1 đã giảm 10% là: " + boPhim1.GiaSauKhuyenMai(10));
    }
}