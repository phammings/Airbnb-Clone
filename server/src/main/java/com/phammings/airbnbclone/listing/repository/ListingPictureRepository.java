package com.phammings.airbnbclone.listing.repository;

import com.phammings.airbnbclone.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
