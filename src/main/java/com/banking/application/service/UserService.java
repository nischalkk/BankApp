package com.banking.application.service;

import com.banking.application.dto.BankResponse;
import com.banking.application.dto.UserRequest;
import com.banking.application.entity.User;

public interface UserService {

    BankResponse createUserAccount(UserRequest userRequest);
}
