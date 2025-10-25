public class MobilListrik extends KendaraanListrik {
    private static final double FAKTOR_EFISIENSI = 1.1; 
    
    public MobilListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }

    @Override
    public double hitungWaktuPengisian() {
        double energi = hitungEnergiDibutuhkan();
        double waktuDasar = energi / kecepatanPengisian;
        return waktuDasar * FAKTOR_EFISIENSI;
    }

    @Override
    public String toString() {
        return "Mobil Listrik";
    }
}
