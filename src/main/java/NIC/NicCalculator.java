/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NIC;
import org.joda.time.DateTime;
/**
 *
 * @author Nazick Ahamed
 */
public class NicCalculator {
    public String[] calculate(String input){

            String[] a = new String[5];
            String bday = input;
            String year = bday.substring(0, 2);
            int year1 = Integer.parseInt(year);
            year1 = year1 + 1900;       //to find the year of birth

            String days = bday.substring(2, 5);

            int days1 = Integer.parseInt(days);
            if (days1 > 500) {
                a[3] = "Female";        // to check the gender
                days1 = days1 - 500;
            }else{
                a[3] = "Male";
            }

           
            DateTime dt = new DateTime(year1,1,1,1,1);
            DateTime dt1;
            DateTime current = new DateTime();  //gives current system date and time
            if(dt.getYear()%4 == 0){
                dt1 = dt.plusDays(days1).minusDays(1);
            }else{
                dt1 = dt.plusDays(days1).minusDays(2);
            }
            a[0] = Integer.toString(dt1.getYear());
            a[1] = Integer.toString(dt1.getMonthOfYear());
            a[2] = Integer.toString(dt1.getDayOfMonth());
            
            if(current.getYear()-dt1.getYear()>=18){
                a[4] = "Yes";           //to check whether the nic owner is a voter
            }else{
                a[4] = "No";
            }
            return a;

        }
    
        
}
