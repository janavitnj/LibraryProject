import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NotfoundComponent } from './components/notfound/notfound.component';
import { LoginComponent } from './components/login/login.component';
import { DropdownModule } from 'primeng/dropdown';
import { DropdownComponent } from './components/dropdown/dropdown.component';
import { AppointmentFormComponent } from './components/appointment-form/appointment-form.component';


@NgModule({
  declarations: [
    AppComponent,
    NotfoundComponent,
    LoginComponent,
    DropdownComponent,
    AppointmentFormComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    DropdownModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
