package com.banking.application.service;

import com.banking.application.dto.AccountInfo;
import com.banking.application.dto.BankResponse;
import com.banking.application.dto.EmailDetails;
import com.banking.application.dto.UserRequest;
import com.banking.application.entity.User;
import com.banking.application.repository.UserRepository;
import com.banking.application.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmailService emailService;

    @Override
    public BankResponse createUserAccount(UserRequest userRequest) {


        if(userRepository.existsByEmail(userRequest.getEmail())){
            return new BankResponse("400","User already exists",null);
        }

        User user = new User();
        user.setFirstName(userRequest.getFirstName());
        user.setEmail(userRequest.getEmail());
        user.setAccountNumber(AccountUtils.generateAccountNumber());
        userRepository.save(user);

        EmailDetails ed = new EmailDetails(user.getEmail(),userRequest.getFirstName());

        emailService.sendMailAlert(ed);

        return new BankResponse("200","User created successfully",null);
    }


}
