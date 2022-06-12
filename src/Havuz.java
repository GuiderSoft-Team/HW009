import java.util.ArrayList;
import java.util.List;

public class Havuz {

    private List<Musluk>musluklar;

    public Havuz() {
        musluklar=new ArrayList<>();
    }

    public void  muslukEkle(Musluk musluk){
        musluklar.add(musluk);
    }


    public double problemiCoz(){
        double sonuc=0.0;
        for (Musluk musluk:musluklar){
            sonuc+=1.0/musluk.getSure();
        }

        return sonuc>0?Math.pow(sonuc,-1):sonuc;
    }
}