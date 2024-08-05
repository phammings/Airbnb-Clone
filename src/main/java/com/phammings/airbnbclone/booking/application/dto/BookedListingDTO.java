package com.phammings.airbnbclone.booking.application.dto;

import com.phammings.airbnbclone.listing.application.dto.sub.PictureDTO;
import com.phammings.airbnbclone.listing.application.dto.vo.PriceVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record BookedListingDTO(@Valid PictureDTO cover,
                               @NotEmpty String location,
                               @Valid BookedDateDTO dates,
                               @Valid PriceVO totalPrice,
                               @NotNull UUID bookingPublicId,
                               @NotNull UUID listingPublicId) {
}
