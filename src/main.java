public class main {
    public static void main(String[] args) {
        jagoan jakaSembung = new jagoan("Jaka Sembung");
        jagoan pitung = new jagoan("Si Pitung");

        jubah jubahPutih = new jubah("Jubah Putih", 7, 50);
        jubah jubahHitam = new jubah("Jubah Hitam", 8, 52);

        senjata golok = new senjata("Golok", 25);
        senjata toya = new senjata("Toya", 24);


        jakaSembung.pakaijubah(jubahPutih);
        jakaSembung.bersenjatakan(golok);
        pitung.pakaijubah(jubahHitam);
        pitung.bersenjatakan(toya);

        jakaSembung.serang(pitung);
        jakaSembung.serang(pitung);

        pitung.serang(jakaSembung);

        jakaSembung.serang(pitung);

        pitung.serang(jakaSembung);
    }
}
