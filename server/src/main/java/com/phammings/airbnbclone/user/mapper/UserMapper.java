package com.phammings.airbnbclone.user.mapper;

import com.phammings.airbnbclone.user.application.dto.ReadUserDTO;
import com.phammings.airbnbclone.user.domain.Authority;
import com.phammings.airbnbclone.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}
