public class TacGia {
    private String tenTacGia;
    private Ngay ngaySinh;

    public TacGia(String tenTacGia, Ngay ngaySinh){
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public String GetTenTacGia(){
        return this.tenTacGia;
    }

    public String SetTenTacGia(String tenTacGia){
        return this.tenTacGia = tenTacGia;
    }

    public Ngay GetNgaySinh(){
        return this.ngaySinh;
    }

    public Ngay SetNgaySinh(Ngay ngaySinh){
        return this.ngaySinh = ngaySinh;
    }
}
