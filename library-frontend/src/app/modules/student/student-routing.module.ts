import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { SetAppointmentComponent } from './components/set-appointment/set-appointment.component';
import { AppointmentsComponent } from './components/appointments/appointments.component';

const routes: Routes = [
  {
    path: "", component: DashboardComponent, children: [
      { path: 'home', component: HomeComponent },
      { path: 'set-appointment', component: SetAppointmentComponent },
      { path: 'appointments', component: AppointmentsComponent },
      { path: '', redirectTo: '/student/home', pathMatch: 'full' }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class StudentRoutingModule { }
