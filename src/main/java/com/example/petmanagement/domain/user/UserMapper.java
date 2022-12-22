package com.example.petmanagement.domain.user;

import com.example.petmanagement.business.user.register.RegisterRequest;
import com.example.petmanagement.business.user.login.LoginResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    LoginResponse toLoginResponse(User user);

    User registerRequestToUser(RegisterRequest registerRequest);

}