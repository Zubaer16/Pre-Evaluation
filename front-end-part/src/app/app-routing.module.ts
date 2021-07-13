import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { SearchComponent } from './search/search.component';
import { StudentsComponent } from './students/students.component';

const routes: Routes = [
  {
    path : "search" , component : SearchComponent
  },
  {
    path : "students", component : StudentsComponent
  },
  {
    path : "registration", component : RegistrationComponent 
  },
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
