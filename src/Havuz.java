import java.util.ArrayList;
import java.util.List;

public class Havuz {
    public List<Musluk> musluklar = new ArrayList<>();
    public Havuz() {

    }
    public void muslukEkle(Musluk musluk){

    }
    public double problemiCoz(){
        double sonuc=0.0;
        for (Musluk musluk:musluklar) {
         sonuc+=1.0/musluk.getSure();

        }
        return sonuc>0?Math.pow(sonuc,-1):sonuc;
    }
}