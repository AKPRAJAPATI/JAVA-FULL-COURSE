package Date_time;

import java.time.LocalDate;

public class print_current_date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Date is "+localDate);
    }
}
