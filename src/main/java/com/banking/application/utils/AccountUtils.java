package com.banking.application.utils;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountUtils {

    public static long uniq = 1L;
    public static String generateAccountNumber() {
        long acc = 0L;
        LocalDate a = LocalDate.now();
        String date = String.valueOf(a.getYear());
        String day = String.valueOf(a.getDayOfMonth());
        acc = Long.parseLong(date+day);
        acc += uniq++;
        return String.valueOf(acc);
    }
}
