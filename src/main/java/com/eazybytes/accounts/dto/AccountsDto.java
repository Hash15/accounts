package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AccountsDto {

  @NotEmpty(message = "Account Number cannot be null or empty")
  @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number should be valid")
  private Long accountNumber;

  @NotEmpty(message = "Account Type cannot be null or empty")
  private String accountType;

  @NotEmpty(message = "Branch address cannot be null or empty")
  private String branchAddress;

}
