public class Musluk {
    private int sure;
    private boolean dolduranmi;

    public Musluk(int sure, boolean dolduranmi) {
        this.dolduranmi = dolduranmi;
        setSure(sure);
    }

    public Musluk() {
        this(1,true);
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {

        if (dolduranmi==true) {
            this.sure = sure > 0 ? sure : 0;
        } else {
            this.sure = sure < 0 ? sure : -sure;
        }

    }
    public boolean isDolduranmi() {
        return dolduranmi;
    }

    public void setDolduranmi(boolean dolduranmi) {
        this.dolduranmi = dolduranmi;
    }
}