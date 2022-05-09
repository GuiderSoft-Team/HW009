public class Musluk {
    private int sure;
    private boolean dolduranMi;

    public Musluk(int sure, boolean dolduranMi) {
        this.dolduranMi = dolduranMi;
        this.setSure(sure);

    }

    public Musluk() {
        this(1,true);
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {

        if (dolduranMi==true) {
            this.sure = sure > 0 ? sure : 0;
        } else {
            this.sure = sure < 0 ? sure : -sure;
        }
    }

    public boolean isDolduranMi() {
        return dolduranMi;
    }

    public void setDolduranMi(boolean dolduranMi) {
        this.dolduranMi = dolduranMi;
    }
}
