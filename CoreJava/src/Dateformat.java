
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;
import static java.lang.System.out;
import java.text.DateFormat;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Dateformat {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy hh/mm/ss");
        System.out.println("sdf");
//        Dateformat df=Dateformat.getDateInstance(DateFormat.LONG);
//    out.println(df.format(date));        

    }

}
