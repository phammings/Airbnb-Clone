package com.phammings.airbnbclone.user.mapper;

import com.phammings.airbnbclone.user.application.dto.ReadUserDTO;
import com.phammings.airbnbclone.user.domain.Authority;
import com.phammings.airbnbclone.user.domain.User;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T12:55:28-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public ReadUserDTO readUserDTOToUser(User user) {
        if ( user == null ) {
            return null;
        }

        UUID publicId = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        String imageUrl = null;
        Set<String> authorities = null;

        publicId = user.getPublicId();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        email = user.getEmail();
        imageUrl = user.getImageUrl();
        authorities = authoritySetToStringSet( user.getAuthorities() );

        ReadUserDTO readUserDTO = new ReadUserDTO( publicId, firstName, lastName, email, imageUrl, authorities );

        return readUserDTO;
    }

    protected Set<String> authoritySetToStringSet(Set<Authority> set) {
        if ( set == null ) {
            return null;
        }

        Set<String> set1 = new LinkedHashSet<String>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Authority authority : set ) {
            set1.add( mapAuthoritiesToString( authority ) );
        }

        return set1;
    }
}
