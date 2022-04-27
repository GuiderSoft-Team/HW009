public class Musluk {
    private boolean dolduranMi;
    private int sure;

    public Musluk(boolean dolduranMi, int sure) {
        this.setDolduranMi(dolduranMi);
        this.setSure(sure);
    }

    public Musluk() {
        this(true,1);
    }

    public boolean isDolduranMi() {
        return dolduranMi;
    }

    public void setDolduranMi(boolean dolduranMi) {
        if (dolduranMi==true){
            System.out.println("musluk havuzu dolduruyor.");
        }else{
            System.out.println("musluk havuzu boşaltıyor.");
        }
        this.dolduranMi = dolduranMi;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {

        if (sure>0){

            if (dolduranMi==true){
                    sure=+1;
            }else {
                sure=-1;
            }
            this.sure = sure;
        }
    }
}
