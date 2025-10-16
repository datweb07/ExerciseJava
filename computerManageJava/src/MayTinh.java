public class MayTinh {
    private HangSanXuat hangSanXuat;
    private Ngay ngaySanXuat;
    private double giaBan;
    private double thoiGianBaoHanh;

    public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySanXuat, double giaBan, double thoiGianBaoHanh){
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public HangSanXuat GetHangSanXuat(){
        return this.hangSanXuat;
    }

    public HangSanXuat SetHangSanXuat(HangSanXuat hangSanXuat){
        return this.hangSanXuat = hangSanXuat;
    }

    public Ngay GetNgaySanXuat(){
        return this.ngaySanXuat;
    }

    public Ngay SetNgaySanXuat(Ngay ngaySanXuat){
        return this.ngaySanXuat = ngaySanXuat;
    }

    public double GetGiaBan(){
        return this.giaBan;
    }

    public double SetGiaBan(double giaBan){
        return this.giaBan = giaBan;
    }

    public double GetThoiGianBaoHanh(){
        return this.thoiGianBaoHanh;
    }

    public double SetThoiGianBaoHanh(double thoiGianBaoHanh){
        return this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public boolean KiemTraGiaBanThapHon(MayTinh mayTinhKhac){
        return this.giaBan < mayTinhKhac.giaBan;
    }

    public String TenQuocGiaSanXuat(){
        return this.hangSanXuat.TenQuocGiaSanXuat();
    }
}
