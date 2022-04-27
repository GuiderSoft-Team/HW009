public class Musluk {
    private int sure;
    private boolean dolduranmi;

    /*public Musluk(int sure) {
        this(1, true);
    }*/

    public Musluk(int sure, boolean dolduranmi) {
        this.dolduranmi = dolduranmi;
        setSure(sure);
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {

        if (!dolduranmi) {
            this.sure = sure < 0 ? sure : -sure;
        } else {
            this.sure = sure > 0 ? sure : 0;
        }

    }
    public boolean isDolduranmi() {
        return dolduranmi;
    }

    public void setDolduranmi(boolean dolduranmi) {
        this.dolduranmi = dolduranmi;
    }
}