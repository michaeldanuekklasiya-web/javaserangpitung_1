public class jagoan {
    private String nama;
    private jubah jubah;
    private senjata senjata;

    public jagoan(String nama) {
        this.nama = nama;
    }

    public void pakaijubah(jubah jubah) {
        this.jubah = jubah;
    }

    public void bersenjatakan(senjata senjata) {
        this.senjata = senjata;
    }

    public void serang(jagoan target) {
        System.out.println(this.nama + " menggunakan " + this.jubah.getjubah()  + " menyerang "+ target.nama + " dengan " + this.senjata.getNama());
    }
}
