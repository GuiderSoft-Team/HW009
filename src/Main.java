public class Main {
    public static void main(String[] args) {
        Havuz havuz=new Havuz();
        havuz.muslukekle(new Musluk(9,true));
        havuz.muslukekle(new Musluk(2,true));
        havuz.muslukekle((new Musluk(18,false)));

        System.out.printf("sonuc: %5.2f",havuz.problemicoz());

    }
}
   /* Havuz havuz=new Havuz();
        havuz.muslukEkle(new Musluk(18,false));
                havuz.muslukEkle(new Musluk(9,true));
                havuz.muslukEkle(new Musluk(2,true));

                System.out.printf("Sonuç : %5.2f",havuz.problemiCoz());

                output:
                Sonuç :  1,80*/