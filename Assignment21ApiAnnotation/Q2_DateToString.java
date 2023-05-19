import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
 public class Q2_DateToString{  
       public static void main(String args[]){  
                Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
                String strDate = dateFormat.format(date);  
                System.out.println("Converted String: " + strDate);  
                 
        }  
}  