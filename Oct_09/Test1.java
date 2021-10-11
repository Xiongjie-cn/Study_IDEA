package Oct_09;

import java.util.Date;
import java.util.Calendar;

/**
 * Test1
 */
public class Test1 {

    public static void main(String[] args) {
        Calendar cl1 = Calendar.getInstance();
        Date dt1 = cl1.getTime();
        long dt = dt1.getTime();
        System.out.println(dt);
    }
}