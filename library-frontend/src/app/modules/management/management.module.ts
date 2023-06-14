import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ManagementRoutingModule } from './management-routing.module';
import { HeaderComponent } from './components/header/header.component';
import { HomeComponent } from './components/home/home.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AddBookComponent } from './components/add-book/add-book.component';
import { AuthorComponent } from './components/author/author.component';
import { DropdownComponent } from './components/dropdown/dropdown.component';
import { CapitalizePipe } from 'src/app/pipes/capitalize.pipe';

@NgModule({
  declarations: [
    HeaderComponent,
    HomeComponent,
    DashboardComponent,
    AddBookComponent,
    AuthorComponent,
    DropdownComponent,
    CapitalizePipe

  ],
  imports: [
    CommonModule,
    ManagementRoutingModule,
    FormsModule
  ]
})
export class ManagementModule { }
