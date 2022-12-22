package com.example.petmanagement.domain.contact;

import com.example.petmanagement.business.user.register.RegisterRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {

    Contact registerRequestToContact(RegisterRequest registerRequest);

}