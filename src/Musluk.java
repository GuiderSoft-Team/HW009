public class Musluk {

    private int sure;
    private boolean dolduranMi;

    public Musluk(int sure, boolean dolduranMi) {
        this.dolduranMi = dolduranMi;
        setSure(sure);
    }

    public Musluk() {
        this(1,true);
    }

    public int getSure() {
        return sure;
    }
    public void setSure(int sure) {
        if (sure>0) this.sure = sure;
        if (dolduranMi){
            this.sure = sure;
        }else{
            this.sure = -sure;
        }
    }

    public boolean isDolduranMi() {
        return dolduranMi;
    }
    public void setDolduranMi(boolean dolduranMi) {
        this.dolduranMi = dolduranMi;
    }
}
