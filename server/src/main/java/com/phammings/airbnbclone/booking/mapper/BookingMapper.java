package com.phammings.airbnbclone.booking.mapper;

import com.phammings.airbnbclone.booking.application.dto.BookedDateDTO;
import com.phammings.airbnbclone.booking.application.dto.NewBookingDTO;
import com.phammings.airbnbclone.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
