public class Main{
    public static void main(String[] args){
        QuocGia quocGia1 = new QuocGia("123", "VN");
        QuocGia quocGia2 = new QuocGia("456", "Mỹ");

        Ngay ngay1 = new Ngay(15, 10, 2006);
        Ngay ngay2 = new Ngay(20, 10, 2006);

        HangSanXuat hangSanXuat1 = new HangSanXuat("HP1", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("HP2", quocGia2);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 17000000, 12);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 25000000, 24);

        System.out.println("Giá bán mayTinh1 thấp hơn mayTinh2: " + mayTinh1.KiemTraGiaBanThapHon(mayTinh2));
        System.out.println("Tên quốc gia sản xuất mayTinh1: " + mayTinh1.TenQuocGiaSanXuat());
        System.out.println("Tên quốc gia sản xuất mayTinh2: " + mayTinh2.TenQuocGiaSanXuat());
    }
}