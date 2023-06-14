import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { AddBookComponent } from './components/add-book/add-book.component';

const routes: Routes = [
  {
    path: "", component: DashboardComponent, children: [
      { path: 'home', component: HomeComponent },
      { path: 'add-books', component: AddBookComponent },
      { path: '', redirectTo: '/author/home', pathMatch: 'full' }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ManagementRoutingModule { }
