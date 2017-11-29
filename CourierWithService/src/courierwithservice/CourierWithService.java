package courierwithservice;

public class CourierWithService {

    
    Courier C = new Courier();
    
    public double hitungBiayaPaket(int berat) {
        double biaya = 0.0;
        double biayaPerKilogram = 17000.0;
        biaya = biayaPerKilogram * berat;
        return biaya;
    }

    public double hitungBiayaPaket(int berat, String tujuan) {
        double biaya = 0.0;
        double biayaPerKilogram = 17000.0;

        biaya = biayaPerKilogram * berat;
        if (tujuan.equalsIgnoreCase("Bandung")) {
            biaya = berat * 17000;
            System.out.println("Bandung");
        } else if (tujuan.equalsIgnoreCase("Surabaya")) {
            biaya = berat * 25000;
            System.out.println("Surabaya");
            // tujuan bandung 17k, surabaya 25k
        }
        return biaya;
    }

    public double hitungBiayaPaket(int berat, String tujuan, String tipePaket) {
        double biaya = 0.0;
        double biayaPerKilogram = 17000.0;
        biaya = biayaPerKilogram * berat;

        if (tujuan.equalsIgnoreCase("Bandung")) {
            //biaya = berat * 17000;
            if (tipePaket.equalsIgnoreCase("REGULER")) {
                biaya = berat * 17000;
            } else if (tipePaket.equalsIgnoreCase("EXPRESS")) {
                biaya = berat * 17000 + 5000;
            } else if (tipePaket.equalsIgnoreCase("SDS")) {
                biaya = berat * 17000 + 10000;
            }
        } else if (tujuan.equalsIgnoreCase("Surabaya")) {
            if (tipePaket.equalsIgnoreCase("REGULER")) {
                biaya = berat * 25000;
            } else if (tipePaket.equalsIgnoreCase("EXPRESS")) {
                biaya = berat * 25000 + 5000;
            } else if (tipePaket.equalsIgnoreCase("SDS")) {
                biaya = berat * 25000 + 10000;
            }

            // SDS, EXPRESS, REGULER
        }
        return biaya;
    }

    public double calculateInsurance(double hargaBarang, double percentage) {
        double biayaAsuransi = hargaBarang * percentage;
        return biayaAsuransi;
    }

    public double hitungBiayaDanAsuransi(int berat,
            String tujuan, String tipePaket,
            double hargaBarang, double percentage) {
        double biayaPlusAsuransi = 0.0;
        double biayaPaket = hitungBiayaPaket(berat, tujuan, tipePaket);
        double biayaAsuransi = calculateInsurance(hargaBarang, percentage);
        biayaPlusAsuransi = biayaPaket + biayaAsuransi;
        return biayaPlusAsuransi;

    }

}
