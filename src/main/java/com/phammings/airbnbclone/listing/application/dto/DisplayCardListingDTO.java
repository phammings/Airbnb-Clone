package com.phammings.airbnbclone.listing.application.dto;

import com.phammings.airbnbclone.listing.application.dto.sub.PictureDTO;
import com.phammings.airbnbclone.listing.application.dto.vo.PriceVO;
import com.phammings.airbnbclone.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
