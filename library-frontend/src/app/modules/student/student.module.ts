import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { StudentRoutingModule } from './student-routing.module';
import { HomeComponent } from './components/home/home.component';
import { SetAppointmentComponent } from './components/set-appointment/set-appointment.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AppointmentsComponent } from './components/appointments/appointments.component';
import { HeaderComponent } from './components/header/header.component';


@NgModule({
  declarations: [
    HomeComponent,
    SetAppointmentComponent,
    DashboardComponent,
    AppointmentsComponent,
    HeaderComponent
  ],
  imports: [
    CommonModule,
    StudentRoutingModule
  ]
})
export class StudentModule { }
