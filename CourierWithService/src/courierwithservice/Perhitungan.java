package courierwithservice;
public class Perhitungan {
    
    private double berat;
    private double biaya;
    private String tujuan;
    private String tipePaket;
    private double percentage;
    private double hargaBarang;

    public Perhitungan() {
    }

    public Perhitungan(double berat, double biaya, String tujuan, String tipePaket, double percentage, double hargaBarang) {
        this.berat = berat;
        this.biaya = biaya;
        this.tujuan = tujuan;
        this.tipePaket = tipePaket;
        this.percentage = percentage;
        this.hargaBarang = hargaBarang;
    }
    
    public double hitungBiayaPaket(){
        double biaya = 0.0;
        double biayaPerKiloGram = 15000.0;
        biaya = biaya * getBerat();
        return biaya;
    }
    
    public double hitungBiayaPaketByWeight() {
        double biaya = 0.0;
        double biayaPerKilogram = 17000.0;
        biaya = biayaPerKilogram * berat;
        return biaya;
    }

    public double hitungBiayaPaketByDestination() {
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

    public double hitungBiayaPaketByPackage() {
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

    public double calculateInsurance() {
        double biayaAsuransi = hargaBarang * percentage;
        return biayaAsuransi;
    }

    public double hitungBiayaDanAsuransi() {
        double biayaPlusAsuransi = 0.0;
        double biayaPaket = hitungBiayaPaketByPackage();
        double biayaAsuransi = calculateInsurance();
        biayaPlusAsuransi = biayaPaket + biayaAsuransi;
        return biayaPlusAsuransi;

    }
    
    public double HitungBiayaPaket(){
        double biaya = 0.0;
        double biayaPerKiloGram = 15000.0;
        
        biaya = biayaPerKiloGram * getBerat();
        if (getTujuan().equalsIgnoreCase("Depok")){
            biaya = biaya * 30000.0;
        } else if (getTujuan().equalsIgnoreCase("Jakarta")){
            biaya = biaya * 50000.0;
        } 
        return biaya;
            
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(double berat) {
        this.berat = berat;
    }

    /**
     * @return the biaya
     */
    public double getBiaya() {
        return biaya;
    }

    /**
     * @param biaya the biaya to set
     */
    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    /**
     * @return the tujuan
     */
    public String getTujuan() {
        return tujuan;
    }

    /**
     * @param tujuan the tujuan to set
     */
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    /**
     * @return the tipePaket
     */
    public String getTipePaket() {
        return tipePaket;
    }

    /**
     * @param tipePaket the tipePaket to set
     */
    public void setTipePaket(String tipePaket) {
        this.tipePaket = tipePaket;
    }

    /**
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    
}
