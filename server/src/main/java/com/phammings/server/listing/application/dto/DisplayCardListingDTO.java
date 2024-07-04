package com.phammings.server.listing.application.dto;

import com.phammings.server.listing.application.dto.sub.PictureDTO;
import com.phammings.server.listing.application.dto.vo.PriceVO;
import com.phammings.server.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
