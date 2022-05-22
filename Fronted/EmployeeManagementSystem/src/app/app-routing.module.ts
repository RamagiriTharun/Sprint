import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddempComponent } from './addemp/addemp.component';
import { DetailsComponent } from './details/details.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AboutComponent } from './layout/about/about.component';
import { ContactComponent } from './layout/contact/contact.component';
import { HomeComponent } from './layout/home/home.component';
import { LoginComponent } from './login/login.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {
    component : EmployeeListComponent,
    path : 'employeelist'
  },
  {
    component : LoginComponent,
    path : 'login'
  },
  {
    component : UpdateComponent,
    path : 'update/:id'
  },
  {
    component : DetailsComponent,
    path : 'details/:id'
  },
  {
    component : AddempComponent,
    path : 'addemp'
  },
  {
    component : HomeComponent,
    path : 'home'
  },
  {
    component : AboutComponent,
    path : 'about'
  },
  {
    component : ContactComponent,
    path : 'contact'
  },
  {
    path : '', component : HomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
