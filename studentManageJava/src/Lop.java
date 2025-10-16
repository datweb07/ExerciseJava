public class Lop {
    private String tenLop;
    private String tenKhoa;

    public Lop(String tenLop, String tenKhoa){
        this.tenLop = tenLop;
        this.tenKhoa = tenKhoa;
    }

    public String GetTenLop(){
        return this.tenLop;
    }

    public String SetTenLop(String tenLop){
        return this.tenLop = tenLop;
    }

    public String GetTenKhoa(){
        return this.tenKhoa;
    }

    public String SetTenKhoa(String tenKhoa){
        return this.tenKhoa = tenKhoa;
    }
}
