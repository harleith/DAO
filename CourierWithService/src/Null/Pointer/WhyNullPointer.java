package Null.Pointer;
public class WhyNullPointer {
    public static void main(String[] args) {
        Artis artis = new Artis();
        artis.setNama("Capung"); // tidak akan error (Null pointer exception = NPE) karena sudah di berikan nilai
        String namaArtis = artis.getNama();
        System.out.println(artis.getNama()); // tidak error
        System.out.println(namaArtis.toUpperCase()); // null pointer exception = NPE
   }
    
}
