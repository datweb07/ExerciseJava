public class HangSanXuat {
    private String tenHangSanXuat;
    private QuocGia quocGia;

    public HangSanXuat(String tenHangSanXuat, QuocGia quocGia){
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    public String GetTenHangSanXuat(){
        return this.tenHangSanXuat;
    }

    public String SetTenHangSanXuat(String tenHangSanXuat){
        return this.tenHangSanXuat = tenHangSanXuat;
    }

    public QuocGia GetQuocGia(){
        return this.quocGia;
    }

    public QuocGia SetQuocGia(QuocGia quocGia){
        return this.quocGia = quocGia;
    }

    public String TenQuocGiaSanXuat(){
        return this.quocGia.GetTenQuocGia();
    }
}
