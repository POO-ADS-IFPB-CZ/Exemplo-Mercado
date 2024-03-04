package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd/MM/yyyy");
        String data = "03/04/2024";
        LocalDate localDate = LocalDate.parse(data, formatter);
        System.out.println(localDate.format(formatter));

    }
}