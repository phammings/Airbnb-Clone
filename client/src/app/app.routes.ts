import {Routes} from '@angular/router';
import {PropertiesComponent} from "./landlord/properties/properties.component";
import {authorityRouteAccess} from "./core/auth/authority-route-access";
import {HomeComponent} from "./home/home.component";
import {DisplayListingComponent} from "./tenant/display-listing/display-listing.component";
import {BookingListingComponent} from "./tenant/booking-listing/booking-listing.component";
import {ReservationComponent} from "./landlord/reservation/reservation.component";

export const routes: Routes = [
  {
    path: 'landlord/properties',
    component: PropertiesComponent,
    canActivate: [authorityRouteAccess],
    data: {
      authorities: ["ROLE_LANDLORD"]
    }
  },
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'listing',
    component: DisplayListingComponent
  },
  {
    path: "booking",
    component: BookingListingComponent
  },
  {
    path: "landlord/reservation",
    component: ReservationComponent,
    canActivate: [authorityRouteAccess],
    data: {
      authorities: ["ROLE_LANDLORD"]
    }
  }
];
