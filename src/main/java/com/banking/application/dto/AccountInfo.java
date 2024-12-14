package com.banking.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
public class AccountInfo {
   private String accountName;
   private BigDecimal accountBalance;
   private String accountNumber;

   public AccountInfo(String accountName, BigDecimal accountBalance, String accountNumber) {
      this.accountName = accountName;
      this.accountBalance = accountBalance;
      this.accountNumber = accountNumber;
   }
}
