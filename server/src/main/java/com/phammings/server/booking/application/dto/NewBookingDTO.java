package com.phammings.server.booking.application.dto;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;
import java.util.UUID;

public record NewBookingDTO(
        @NotNull OffsetDateTime startDate,
        @NotNull OffsetDateTime endDate,
        @NotNull UUID listingPublicId) {
}