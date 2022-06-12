public class Musluk {
    private int sure;
    private boolean donduranMi;

    public Musluk(int sure, boolean donduranMi) {
        this.donduranMi=donduranMi;
        setSure(sure);
    }
    public Musluk() {
        this(1,true);

    }

    public int getSure() {
        return sure;

    }
    public void setSure(int sure) {
        if(sure>0) {
            this.sure=donduranMi?sure:-sure;

        }else{
            System.err.println("Süre sifirdan büyük olmalidir");
            System.exit(-1);
        }
    }

    public boolean isDonduranMi() {
        return donduranMi;
    }

    public void setDonduranMi(boolean donduranMi) {
        this.donduranMi = donduranMi;

    }
}
