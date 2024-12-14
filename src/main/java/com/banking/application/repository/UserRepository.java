package com.banking.application.repository;

import com.banking.application.dto.UserRequest;
import com.banking.application.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    boolean existsById(@NotNull Long aLong);

    boolean existsByEmail(String email);

}
