package com.example.petmanagement.domain.user;

import com.example.petmanagement.business.user.login.LoginResponse;
import com.example.petmanagement.business.user.register.RegisterRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    LoginResponse toLoginResponse(User user);

    User registerRequestToUser(RegisterRequest registerRequest);

}