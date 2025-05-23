package com.tnsif.stream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        String formattedDateTime = Stream.of(now)
                .map(dateTime -> dateTime.format(formatter))
                .findFirst()
                .orElse("DateTime not available");
        
        System.out.println("Today's Date and Current Time: " + formattedDateTime);
    }
}
