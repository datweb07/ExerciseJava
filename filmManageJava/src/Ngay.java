public class Ngay {
    private int ngay;
    private int thang;
    private int nam;

    public Ngay(int ngay, int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int GetNgay(){
        return this.ngay;
    }

    public int SetNgay(int ngay){
        if (ngay >= 1 & ngay <= 31){
            return this.ngay = ngay;
        }
        else {
            return this.ngay = 1;
        }
    }

    public int GetThang(){
        return this.thang;
    }

    public int SetThang(int thang){
        if (thang >= 1 & thang <= 12){
            return this.thang = thang;
        }
        else {
            return this.thang = 1;
        }
    }

    public int GetNam(){
        return this.nam;
    }

    public int SetNam(int nam){
        if (nam >=0){
            return this.nam = nam;
        }
        else{
            return this.nam = 2025;
        }
    }
}
