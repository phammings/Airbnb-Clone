package com.phammings.airbnbclone.listing.mapper;

import com.phammings.airbnbclone.listing.application.dto.CreatedListingDTO;
import com.phammings.airbnbclone.listing.application.dto.DisplayCardListingDTO;
import com.phammings.airbnbclone.listing.application.dto.DisplayListingDTO;
import com.phammings.airbnbclone.listing.application.dto.ListingCreateBookingDTO;
import com.phammings.airbnbclone.listing.application.dto.SaveListingDTO;
import com.phammings.airbnbclone.listing.application.dto.sub.DescriptionDTO;
import com.phammings.airbnbclone.listing.application.dto.sub.ListingInfoDTO;
import com.phammings.airbnbclone.listing.application.dto.sub.PictureDTO;
import com.phammings.airbnbclone.listing.application.dto.vo.BathsVO;
import com.phammings.airbnbclone.listing.application.dto.vo.BedroomsVO;
import com.phammings.airbnbclone.listing.application.dto.vo.BedsVO;
import com.phammings.airbnbclone.listing.application.dto.vo.DescriptionVO;
import com.phammings.airbnbclone.listing.application.dto.vo.GuestsVO;
import com.phammings.airbnbclone.listing.application.dto.vo.PriceVO;
import com.phammings.airbnbclone.listing.application.dto.vo.TitleVO;
import com.phammings.airbnbclone.listing.domain.BookingCategory;
import com.phammings.airbnbclone.listing.domain.Listing;
import com.phammings.airbnbclone.listing.domain.ListingPicture;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-13T12:55:28-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class ListingMapperImpl implements ListingMapper {

    @Autowired
    private ListingPictureMapper listingPictureMapper;

    @Override
    public Listing saveListingDTOToListing(SaveListingDTO saveListingDTO) {
        if ( saveListingDTO == null ) {
            return null;
        }

        Listing listing = new Listing();

        listing.setTitle( saveListingDTODescriptionTitleValue( saveListingDTO ) );
        listing.setDescription( saveListingDTODescriptionDescriptionValue( saveListingDTO ) );
        listing.setBedrooms( saveListingDTOInfosBedroomsValue( saveListingDTO ) );
        listing.setGuests( saveListingDTOInfosGuestsValue( saveListingDTO ) );
        listing.setBookingCategory( saveListingDTO.getCategory() );
        listing.setBeds( saveListingDTOInfosBedsValue( saveListingDTO ) );
        listing.setBathrooms( saveListingDTOInfosBathsValue( saveListingDTO ) );
        listing.setPrice( saveListingDTOPriceValue( saveListingDTO ) );
        listing.setLocation( saveListingDTO.getLocation() );

        return listing;
    }

    @Override
    public CreatedListingDTO listingToCreatedListingDTO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        String publicId = null;

        if ( listing.getPublicId() != null ) {
            publicId = listing.getPublicId().toString();
        }

        CreatedListingDTO createdListingDTO = new CreatedListingDTO( publicId );

        return createdListingDTO;
    }

    @Override
    public List<DisplayCardListingDTO> listingToDisplayCardListingDTOs(List<Listing> listings) {
        if ( listings == null ) {
            return null;
        }

        List<DisplayCardListingDTO> list = new ArrayList<DisplayCardListingDTO>( listings.size() );
        for ( Listing listing : listings ) {
            list.add( listingToDisplayCardListingDTO( listing ) );
        }

        return list;
    }

    @Override
    public DisplayCardListingDTO listingToDisplayCardListingDTO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        PictureDTO cover = null;
        PriceVO price = null;
        String location = null;
        BookingCategory bookingCategory = null;
        UUID publicId = null;

        cover = listingPictureMapper.extractCover( listing.getPictures() );
        price = mapPriceToPriceVO( listing.getPrice() );
        location = listing.getLocation();
        bookingCategory = listing.getBookingCategory();
        publicId = listing.getPublicId();

        DisplayCardListingDTO displayCardListingDTO = new DisplayCardListingDTO( price, location, cover, bookingCategory, publicId );

        return displayCardListingDTO;
    }

    @Override
    public DisplayListingDTO listingToDisplayListingDTO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        DisplayListingDTO displayListingDTO = new DisplayListingDTO();

        displayListingDTO.setDescription( listingToDescriptionDTO( listing ) );
        displayListingDTO.setInfos( listingToListingInfoDTO( listing ) );
        displayListingDTO.setPrice( listingToPriceVO( listing ) );
        displayListingDTO.setCategory( listing.getBookingCategory() );
        displayListingDTO.setPictures( listingPictureSetToPictureDTOList( listing.getPictures() ) );
        displayListingDTO.setLocation( listing.getLocation() );

        return displayListingDTO;
    }

    @Override
    public ListingCreateBookingDTO mapListingToListingCreateBookingDTO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        UUID listingPublicId = null;
        PriceVO price = null;

        listingPublicId = listing.getPublicId();
        price = mapPriceToPriceVO( listing.getPrice() );

        ListingCreateBookingDTO listingCreateBookingDTO = new ListingCreateBookingDTO( listingPublicId, price );

        return listingCreateBookingDTO;
    }

    private String saveListingDTODescriptionTitleValue(SaveListingDTO saveListingDTO) {
        if ( saveListingDTO == null ) {
            return null;
        }
        DescriptionDTO description = saveListingDTO.getDescription();
        if ( description == null ) {
            return null;
        }
        TitleVO title = description.title();
        if ( title == null ) {
            return null;
        }
        String value = title.value();
        if ( value == null ) {
            return null;
        }
        return value;
    }

    private String saveListingDTODescriptionDescriptionValue(SaveListingDTO saveListingDTO) {
        if ( saveListingDTO == null ) {
            return null;
        }
        DescriptionDTO description = saveListingDTO.getDescription();
        if ( description == null ) {
            return null;
        }
        DescriptionVO description1 = description.description();
        if ( description1 == null ) {
            return null;
        }
        String value = description1.value();
        if ( value == null ) {
            return null;
        }
        return value;
    }

    private int saveListingDTOInfosBedroomsValue(SaveListingDTO saveListingDTO) {
        if ( saveListingDTO == null ) {
            return 0;
        }
        ListingInfoDTO infos = saveListingDTO.getInfos();
        if ( infos == null ) {
            return 0;
        }
        BedroomsVO bedrooms = infos.bedrooms();
        if ( bedrooms == null ) {
            return 0;
        }
        int value = bedrooms.value();
        return value;
    }

    private int saveListingDTOInfosGuestsValue(SaveListingDTO saveListingDTO) {
        if ( saveListingDTO == null ) {
            return 0;
        }
        ListingInfoDTO infos = saveListingDTO.getInfos();
        if ( infos == null ) {
            return 0;
        }
        GuestsVO guests = infos.guests();
        if ( guests == null ) {
            return 0;
        }
        int value = guests.value();
        return value;
    }

    private int saveListingDTOInfosBedsValue(SaveListingDTO saveListingDTO) {
        if ( saveListingDTO == null ) {
            return 0;
        }
        ListingInfoDTO infos = saveListingDTO.getInfos();
        if ( infos == null ) {
            return 0;
        }
        BedsVO beds = infos.beds();
        if ( beds == null ) {
            return 0;
        }
        int value = beds.value();
        return value;
    }

    private int saveListingDTOInfosBathsValue(SaveListingDTO saveListingDTO) {
        if ( saveListingDTO == null ) {
            return 0;
        }
        ListingInfoDTO infos = saveListingDTO.getInfos();
        if ( infos == null ) {
            return 0;
        }
        BathsVO baths = infos.baths();
        if ( baths == null ) {
            return 0;
        }
        int value = baths.value();
        return value;
    }

    private int saveListingDTOPriceValue(SaveListingDTO saveListingDTO) {
        if ( saveListingDTO == null ) {
            return 0;
        }
        PriceVO price = saveListingDTO.getPrice();
        if ( price == null ) {
            return 0;
        }
        int value = price.value();
        return value;
    }

    protected TitleVO listingToTitleVO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        String value = null;

        value = listing.getTitle();

        TitleVO titleVO = new TitleVO( value );

        return titleVO;
    }

    protected DescriptionVO listingToDescriptionVO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        String value = null;

        value = listing.getDescription();

        DescriptionVO descriptionVO = new DescriptionVO( value );

        return descriptionVO;
    }

    protected DescriptionDTO listingToDescriptionDTO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        TitleVO title = null;
        DescriptionVO description = null;

        title = listingToTitleVO( listing );
        description = listingToDescriptionVO( listing );

        DescriptionDTO descriptionDTO = new DescriptionDTO( title, description );

        return descriptionDTO;
    }

    protected BedroomsVO listingToBedroomsVO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        int value = 0;

        value = listing.getBedrooms();

        BedroomsVO bedroomsVO = new BedroomsVO( value );

        return bedroomsVO;
    }

    protected GuestsVO listingToGuestsVO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        int value = 0;

        value = listing.getGuests();

        GuestsVO guestsVO = new GuestsVO( value );

        return guestsVO;
    }

    protected BedsVO listingToBedsVO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        int value = 0;

        value = listing.getBeds();

        BedsVO bedsVO = new BedsVO( value );

        return bedsVO;
    }

    protected BathsVO listingToBathsVO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        int value = 0;

        value = listing.getBathrooms();

        BathsVO bathsVO = new BathsVO( value );

        return bathsVO;
    }

    protected ListingInfoDTO listingToListingInfoDTO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        BedroomsVO bedrooms = null;
        GuestsVO guests = null;
        BedsVO beds = null;
        BathsVO baths = null;

        bedrooms = listingToBedroomsVO( listing );
        guests = listingToGuestsVO( listing );
        beds = listingToBedsVO( listing );
        baths = listingToBathsVO( listing );

        ListingInfoDTO listingInfoDTO = new ListingInfoDTO( guests, bedrooms, beds, baths );

        return listingInfoDTO;
    }

    protected PriceVO listingToPriceVO(Listing listing) {
        if ( listing == null ) {
            return null;
        }

        int value = 0;

        value = listing.getPrice();

        PriceVO priceVO = new PriceVO( value );

        return priceVO;
    }

    protected List<PictureDTO> listingPictureSetToPictureDTOList(Set<ListingPicture> set) {
        if ( set == null ) {
            return null;
        }

        List<PictureDTO> list = new ArrayList<PictureDTO>( set.size() );
        for ( ListingPicture listingPicture : set ) {
            list.add( listingPictureMapper.convertToPictureDTO( listingPicture ) );
        }

        return list;
    }
}
