public class Musluk {
    private int sure;
    private boolean dolduranMi;

    public Musluk(int sure, boolean dolduranMi) {
        this.sure = sure;
        this.dolduranMi = dolduranMi;
    }
    public Musluk() {
        this(1, true);
    }
    public int getSure() {
        return sure;
    }
    public void setSure(int sure) {
        if (sure>0){
            this.sure =dolduranMi?sure:-sure;
        }
    }
    public boolean isDolduranMi() {
        return dolduranMi;
    }
    public void setDolduranMi(boolean dolduranMi) {
        if (dolduranMi){
            System.out.println("Musluk Havuzu dolduruyor");
        }else{
            System.out.println("Musluk Havuzu boşaltıyor");
        }
        this.dolduranMi = dolduranMi;
    }
}
