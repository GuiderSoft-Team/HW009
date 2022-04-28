public class Musluk {
    private int sure;
    private boolean dolduranMi;

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        if (sure <= 0) {
            System.err.println("Süre negatif olamaz");
            System.exit(1);
        }
        if (dolduranMi) {
            this.sure = sure;
        } else {
            this.sure = -1 * sure;
        }
    }

    public boolean getDolduranMi() {
        return dolduranMi;
    }

    public void setDolduranMi(boolean dolduranMi) {

        this.dolduranMi = dolduranMi;
    }

    public Musluk(int sure, boolean dolduranMi) {
        setDolduranMi(dolduranMi);
        setSure(sure);
    }

    public Musluk() {
        this(1, true);
    }
}

