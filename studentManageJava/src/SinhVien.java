public class SinhVien {
    private String maSinhVien;
    private String hoVaTen;
    private Ngay ngaySinh;
    private double diemTrungBinh;
    private Lop lop;

    public SinhVien(String maSinhVien, String hoVaTen, Ngay ngaySinh, double diemTrungBinh, Lop lop){
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
    }

    public String GetMaSinhVien(){
        return this.maSinhVien;
    }

    public String SetMaSinhVien(String maSinhVien){
        return this.maSinhVien = maSinhVien;
    }

    public String GetHoVaTen(){
        return this.hoVaTen;
    }

    public String SetHoVanTen(String hoVaTen){
        return this.hoVaTen = hoVaTen;
    }

    public Ngay GetNgaySinh(){
        return this.ngaySinh;
    }

    public Ngay SetNgaySinh(Ngay ngaySinh){
        return this.ngaySinh = ngaySinh;
    }

    public double GetDiemTrungBinh(){
        return this.diemTrungBinh;
    }

    public double SetDiemTrungBinh(double diemTrungBinh){
        return this.diemTrungBinh = diemTrungBinh;
    }

    public Lop GetLop(){
        return this.lop;
    }

    public Lop SetLop(Lop lop){
        return this.lop = lop;
    }

    public String layTenKhoa(){
        return this.lop.GetTenKhoa();
    }

    public boolean kiemTraThiDat(){
        return this.diemTrungBinh >= 5.0;
    }

    public boolean kiemTraCungNgaySinh(SinhVien sinhVienKhac){
        return this.ngaySinh == sinhVienKhac.ngaySinh;
    }
}
