package courierwithservice;
public class courierAll {
    public static void main(String[] args) {
    Perhitungan hitung = new Perhitungan();
hitung.setBiaya(1);
hitung.setBerat(2);
hitung.setHargaBarang(500.0);
hitung.setPercentage(0.5);
hitung.setTipePaket("SDS");
hitung.setTujuan("Bandung");

hitung.hitungBiayaDanAsuransi();
        System.out.println("Biaya "+hitung.HitungBiayaPaket());
        System.out.println("Total "+hitung.hitungBiayaPaketByPackage());
        
    }
}