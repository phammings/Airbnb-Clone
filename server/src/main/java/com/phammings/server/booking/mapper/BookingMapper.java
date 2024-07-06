package com.phammings.server.booking.mapper;

import com.phammings.server.booking.application.dto.BookedDateDTO;
import com.phammings.server.booking.application.dto.NewBookingDTO;
import com.phammings.server.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
