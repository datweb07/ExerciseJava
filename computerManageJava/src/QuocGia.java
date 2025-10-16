public class QuocGia {
    private String maQuocGia;
    private String tenQuocGia;

    public QuocGia(String maQuocGia, String tenQuocGia){
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }

    public String GetMaQuocGia(){
        return this.maQuocGia;
    }

    public String SetMaQuocGia(String maQuocGia){
        return this.maQuocGia = maQuocGia;
    }

    public String GetTenQuocGia(){
        return this.tenQuocGia;
    }

    public String SetTenQuocGia(String tenQuocGia){
        return this.tenQuocGia = tenQuocGia;
    }
}
