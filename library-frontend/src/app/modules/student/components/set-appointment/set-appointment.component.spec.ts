import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SetAppointmentComponent } from './set-appointment.component';

describe('SetAppointmentComponent', () => {
  let component: SetAppointmentComponent;
  let fixture: ComponentFixture<SetAppointmentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SetAppointmentComponent]
    });
    fixture = TestBed.createComponent(SetAppointmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
