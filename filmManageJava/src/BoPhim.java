public class BoPhim {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay ngayChieu;

    public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu){
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String GetTenPhim(){
        return this.tenPhim;
    }

    public String SetTenPhim(String tenPhim){
        return this.tenPhim = tenPhim;
    }

    public int GetNamSanXuat(){
        return this.namSanXuat;
    }

    public int SetNamSanXuat(int namSanXuat){
        return this.namSanXuat = namSanXuat;
    }

    public HangSanXuat GetHangSanXuat(){
        return this.hangSanXuat;
    }

    public HangSanXuat SetHangSanXuat(HangSanXuat hangSanXuat){
        return this.hangSanXuat = hangSanXuat;
    }

    public double GetGiaVe(){
        return this.giaVe;
    }

    public double SetGiaVe(double giaVe){
        return this.giaVe = giaVe;
    }

    public Ngay GetNgayChieu(){
        return this.ngayChieu;
    }

    public Ngay SetNgayChieu(Ngay ngayChieu){
        return this.ngayChieu = ngayChieu;
    }

    public boolean KiemTraGiaVeReHon(BoPhim boPhim){
        return this.giaVe < boPhim.giaVe;
    }

    public String LayTenHangSanXuat(){
        return this.hangSanXuat.GetTenHangSanXuat();
    }

    public double GiaSauKhuyenMai(double x){
        return this.giaVe * (1 - x/100);
    }
}
