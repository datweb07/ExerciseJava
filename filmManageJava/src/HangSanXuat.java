public class HangSanXuat {
    private String tenHangSanXuat;
    private String tenQuocGia;

    public HangSanXuat(String tenHangSanXuat, String tenQuocGia){
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String GetTenHangSanXuat(){
        return this.tenHangSanXuat;
    }

    public String SetTenHangSanXuat(String tenHangSanXuat){
        return this.tenHangSanXuat = tenHangSanXuat;
    }

    public String GetTenQuocGia(){
        return this.tenQuocGia;
    }

    public String SetTenQuocGia(String tenQuocGia){
        return this.tenQuocGia = tenQuocGia;
    }
}
