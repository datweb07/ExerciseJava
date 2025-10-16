public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia){
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String GetTenSach(){
        return this.tenSach;
    }

    public String SetTenSach(String tenSach){
        return this.tenSach = tenSach;
    }

    public double GetGiaBan(){
        return this.giaBan;
    }

    public double SetGiaBan(double giaBan){
        return this.giaBan = giaBan;
    }

    public int GetNamXuatBan(){
        return this.namXuatBan;
    }

    public int SetNamXuatBan(int namXuatBan){
        return this.namXuatBan = namXuatBan;
    }

    public TacGia GetTacGia(){
        return this.tacGia;
    }

    public TacGia SetTacGia(TacGia tacGia){
        return this.tacGia = tacGia;
    }

    public void InTenSach(){
        System.out.println("Tên sách: " + this.tenSach);
    }

    public boolean KiemTraTrungNamXuatBan(Sach sach){
        return this.namXuatBan == sach.namXuatBan;
    }

    public double giaSauKhiGiam(double x){
        return this.giaBan * (1 - x/100);
    }


}
