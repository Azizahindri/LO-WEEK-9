public abstract class KendaraanListrik implements KonsumsiEnergi {
    protected double kapasitasBaterai;     
    protected double dayaSaatIni;          
    protected double kecepatanPengisian;   

    public KendaraanListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaSaatIni = dayaSaatIni;
        this.kecepatanPengisian = kecepatanPengisian;
    }

    @Override
    public double hitungEnergiDibutuhkan() {
        return kapasitasBaterai - dayaSaatIni;
    }

    
    public abstract double hitungWaktuPengisian();
}
