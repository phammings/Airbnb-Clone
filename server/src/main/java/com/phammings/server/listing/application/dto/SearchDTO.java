package com.phammings.server.listing.application.dto;

import com.phammings.server.booking.application.dto.BookedDateDTO;
import com.phammings.server.listing.application.dto.sub.ListingInfoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record SearchDTO(@Valid BookedDateDTO dates,
                        @Valid ListingInfoDTO infos,
                        @NotEmpty String location) {
}
