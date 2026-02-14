package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {

  /**
   *
   * @param customerDto - CustomerDto Object
   */
  void createAccount(CustomerDto customerDto);

  /**
   *
   * @param mobileNumber - Input Mobile number
   * @return Account details based on given mobileNumber
   */
  CustomerDto fetchAccount(String mobileNumber);

  /**
   *
   * @param customerDto - customerDto Object
   * @return boolean indicating update of account is successful or not
   */
  boolean updateAccount(CustomerDto customerDto);

  /**
   *
   * @param mobileNumber - Input mobile number
   * @return boolean indicating delete of account is successful or not
   */
  boolean deleteAccount(String mobileNumber);
}
