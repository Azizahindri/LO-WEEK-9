public class Main {
    public static void main(String[] args) {
       
        KendaraanListrik[] daftar = {
            new MobilListrik(80, 20, 10),
            new MotorListrik(30, 10, 5),
            new MobilListrik(60, 45, 12),
            new MotorListrik(25, 20, 4)
        };

        double totalWaktu = 0;
        double totalEnergi = 0;

        
        for (int i = 0; i < daftar.length; i++) {
            KendaraanListrik v = daftar[i];
            double energi = v.hitungEnergiDibutuhkan();
            double waktu = v.hitungWaktuPengisian();

            
            System.out.println(v + " → waktu: " +
                    String.format("%.4f", waktu) + " jam, energi: " +
                    String.format("%.1f", energi) + " kWh");

            totalWaktu += waktu;
            totalEnergi += energi;
        }

        System.out.println();
        System.out.println("Total waktu pengisian seluruh kendaraan: " +
                String.format("%.4f", totalWaktu) + " jam");
        System.out.println("Total energi dibutuhkan: " +
                String.format("%.1f", totalEnergi) + " kWh");
    }
}
