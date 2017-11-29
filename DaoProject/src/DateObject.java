
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateObject {
    public static void main(String[] args) throws ParseException {

        Date now = new Date();
        System.out.println("Tanggal: " + now);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
        // bisa dd-MM-yyyy, dd MM yyyy, dd MMMMM yyyy, dd/MM/yyyy
        
        String nowFmt = sdf.format(now); // kalau HH:mm:ss
        System.out.println("Tanggal Sekarang: " + nowFmt);
        
        Date dob = sdf.parse("1-10-1989");
        System.out.println("Tanggal lahir: " + dob);
        
        Calendar calNow = Calendar.getInstance();
        calNow.setTime(now);
        Calendar calDob = Calendar.getInstance();
        calDob.setTime(dob);
        int umur = calNow.get(Calendar.YEAR) - calDob.get(Calendar.YEAR);
        
        System.out.println("Umur " + umur);
        
        long millis = now.getTime() - dob.getTime();
        System.out.println("Milli seconds: " + millis);
        
        long year = millis / (1000*60*60*24*365);
        System.out.println("Year: "+year);
        
        
    }
    
}
