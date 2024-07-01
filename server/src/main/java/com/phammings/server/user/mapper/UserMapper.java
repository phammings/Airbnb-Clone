package com.phammings.server.user.mapper;

import com.phammings.server.user.application.dto.ReadUserDTO;
import com.phammings.server.user.domain.Authority;
import com.phammings.server.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}