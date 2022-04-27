public class Main {
    public static void main(String[] args) {
        Havuz havuz=new Havuz();
        havuz.muslukEkle(new Musluk(18,false));
        havuz.muslukEkle(new Musluk(9,true));
        havuz.muslukEkle(new Musluk(2,true));
        System.out.printf("Sonuç : %5.2f",havuz.problemiCoz());


    }
}
