public class Main {
    public static void main(String[] args) {

        Havuz havuz=new Havuz();
        havuz.muslukEkle(new Musluk(false,18));
        havuz.muslukEkle(new Musluk(true,9));
        havuz.muslukEkle(new Musluk(true,2));
        System.out.printf("Sonuç : %5.2f",havuz.problemiCoz());
    }
}
