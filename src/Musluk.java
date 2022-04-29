public class Musluk {
    private int sure;
    private boolean dolduranMı;

    public Musluk() {
        this(1,true);
    }

    public Musluk(int sure, boolean dolduranMı) {
        this.sure = sure;
        this.dolduranMı = dolduranMı;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
        if(sure>=0){
            if(dolduranMı==true){
                this.sure=sure;
            }
        }else {this.sure=-1*sure;
        }
        this.sure=sure;
    }

    public boolean isDolduranMı() {
        return dolduranMı;
    }

    public void setDolduranMı(boolean dolduranMı) {
        this.dolduranMı = dolduranMı;
        if(dolduranMı==true){
            System.out.println("Musluk Havuzu suyla dolduruyor.");
        }else {
            System.out.println("Musluk Havuzu boşaltıyor...");
        }
    }
}
