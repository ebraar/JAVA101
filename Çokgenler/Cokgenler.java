public class Cokgenler {

    private int kenarSayi;
    private String isim;


    public Cokgenler(int kenarSayi, String isim) {
        this.kenarSayi = kenarSayi;
        this.isim = isim;
    }

    public int getKenarSayi() {
        return kenarSayi;
    }

    public void setKenarSayi(int kenarSayi) {
        this.kenarSayi = kenarSayi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    int icAciBul(){
        return (this.kenarSayi-2)*180;
    }

    int disAciBul(){
        return 360 / this.kenarSayi;
    }
}
