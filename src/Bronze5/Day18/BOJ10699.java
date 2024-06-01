package Bronze5.Day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BOJ10699 {
    public static void main(String[] args) {
        LocalDateTime local = LocalDateTime.now();
        String formatted = local.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
        System.out.println(formatted);
    }
}
