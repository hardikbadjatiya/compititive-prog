
import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;

import java.text.DateFormat; 
public class DateFor {
    public static void main(String[] args) {
        Date date=new Date();
        out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat();
        out.println(sdf.format(date));
    SimpleDateFormat sdff=new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        out.println(sdff.format(date));
    DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
    out.println(df.format(date));
    }

    private boolean format(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
}
