import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookingListingComponent } from './booking-listing.component';

describe('BookingListingComponent', () => {
  let component: BookingListingComponent;
  let fixture: ComponentFixture<BookingListingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BookingListingComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BookingListingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
