package com.phammings.server.listing.application.dto.sub;

import com.phammings.server.listing.application.dto.vo.DescriptionVO;
import com.phammings.server.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(
        @NotNull TitleVO title,
        @NotNull DescriptionVO description
        ) {
}
